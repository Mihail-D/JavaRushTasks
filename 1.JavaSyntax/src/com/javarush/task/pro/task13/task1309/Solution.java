package com.javarush.task.pro.task13.task1309;

import java.util.HashMap;


public class Solution {
    public static HashMap<String, Double> grades = new HashMap<>();

    public static void main(String[] args) {
        addStudents();
        System.out.println(grades);
    }

    public static void addStudents() {
        grades.put("Вася Иванов", 3.56);
        grades.put("Коля Петров", 5.0);
        grades.put("Саша Семенов", 4.56);
        grades.put("Ника Васильева", 4.25);
        grades.put("Лена Головач", 4.99);
    }
}
