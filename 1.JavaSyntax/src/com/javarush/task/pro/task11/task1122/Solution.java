package com.javarush.task.pro.task11.task1122;

/* 
Затенение поля класса
*/

public class Solution {
    public static int salary;

    public static void add(int increase) {
        salary += increase;
        System.out.println(salary);
    }
    public static void main(String[] args) {
        add(100500);

    }
}