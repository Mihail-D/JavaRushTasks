package com.javarush.task.task17.task1711;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD 2
*/

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
        allPeople.add(Person.createMale("Сидоров Вася", new Date()));  //сегодня родился    id=2
        allPeople.add(Person.createMale("Семенова Света", new Date()));  //сегодня родился    id=3
    }

    public static void main(String[] args) {
        //start here - начни тут
    }
}
