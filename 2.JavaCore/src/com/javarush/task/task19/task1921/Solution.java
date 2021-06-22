package com.javarush.task.task19.task1921;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/* 
Хуан Хуанович
*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<Person>();

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader(args[0]));

        while (br.ready()) {
            String string = br.readLine();
            String[] arr = string.split(" ");
            String name = "";
            int year = Integer.parseInt(arr[arr.length - 1]);
            int month = Integer.parseInt(arr[arr.length - 2]);
            int day = Integer.parseInt(arr[arr.length - 3]);
            int nameLen = arr.length - 3;

            Date date;
            Calendar cal = Calendar.getInstance();
            cal.set(Calendar.YEAR, year);
            cal.set(Calendar.MONTH, month - 1);
            cal.set(Calendar.DATE, day);
            date = cal.getTime();

            for (int i = 0; i < nameLen; i++) {
                name += (arr[i] + " ");
            }

            Person person = new Person(name.toString().trim(), date);

            PEOPLE.add(person);
        }

        br.close();
    }
}
