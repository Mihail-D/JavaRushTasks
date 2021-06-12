/*
package com.javarush.task.task17.task1710;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
*/
/*
-c Миронов м 15/04/1990
-u 1 Миронов м 15/04/1990
-d 1
-i 1
*//*


public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws IOException, ParseException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        String[] arr = s.split(" ");

        if (arr[0].equals("-c")) {
            Sex sex = Sex.MALE;
            if (arr[2].equals("f")) {
                sex = Sex.FEMALE;
            }

            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
            Date date = formatter.parse(arr[3]);

            String pattern = "dd-MMM-yyyy";
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern, Locale.ENGLISH);
            String date1 = simpleDateFormat.format(date);

            Person person = new Person(arr[1], sex, date);
            allPeople.add(person);

            System.out.println(allPeople.indexOf(person));
        }

        if (arr[0].equals("-u")) {
            Person person = allPeople.get(Integer.parseInt(arr[1]));
            person.setName(arr[2]);
            if (arr[3].equals("m")) {
                person.setSex(Sex.MALE);
            }
            else if (arr[3].equals("f")) {
                person.setSex(Sex.FEMALE);
            }

            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
            Date date = formatter.parse(arr[4]);
            person.setBirthDate(date);
        }

        if (arr[0].equals("-d")) {
            Person person = allPeople.get(Integer.parseInt(arr[1]));
            person.setName(null);
            person.setSex(null);
            person.setBirthDate(null);
        }

        if (arr[0].equals("-i")) {
            Person person = allPeople.get(Integer.parseInt(arr[1]));
            String sex = "m";
            if (person.getSex() == Sex.FEMALE) {
                sex = "f";
            }

            String pattern = "dd-MMM-yyyy";
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern, Locale.ENGLISH);
            String date1 = simpleDateFormat.format(person.getBirthDate());

            System.out.println(person.getName() + " " + sex + " " + date1);
        }
    }
}
*/
package com.javarush.task.task17.task1710;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/*
CRUD
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
    static SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);


    public static void main(String[] args) throws Exception {
        if (args == null || args.length < 1)
            throw new RuntimeException();

        Date birthdayDate = new Date();
        Person person;
        switch (args[0]) {
            case "-c":
                birthdayDate = simpleDateFormat.parse(args[3]);

                if (args[2].equals("м"))
                    person = Person.createMale(args[1], birthdayDate);
                else
                    person = Person.createFemale(args[1], birthdayDate);

                allPeople.add(person);
                System.out.println(allPeople.size() - 1);
                break;
            case "-u":
                birthdayDate = simpleDateFormat.parse(args[4]);
                int id = Integer.parseInt(args[1]);
                person = allPeople.get(id);
                if (person == null)
                    throw new IllegalArgumentException();
                person.setSex(getSex(args[3]));
                person.setBirthDate(birthdayDate);
                person.setName(args[2]);
                allPeople.set(id, person);
                break;
            case "-d":
                Person currentPerson = allPeople.get(Integer.valueOf(args[1]));
                currentPerson.setName(null);
                currentPerson.setSex(null);
                currentPerson.setBirthDate(null);
                break;
            case "-i":
                person = allPeople.get(Integer.parseInt(args[1]));
                if (person != null)
                    System.out.println(person.getName() + " " + (person.getSex() == Sex.MALE ? "м" : "ж") + " " + simpleDateFormat2.format(person.getBirthDate()));
                break;
        }

    }

    private static Sex getSex(String sexParam) {
        return sexParam.equals("м") ? Sex.MALE : Sex.FEMALE;
    }
}
