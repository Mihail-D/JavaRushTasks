package com.javarush.task.pro.task07.task0706;

/* 
Странное деление
*/

public class Solution {
    public static void main(String[] args) {
        div(Math.sqrt(-1), 1.22);
    }

    public static void div(double a, double b) {
        System.out.println((b / a));
    }
}
