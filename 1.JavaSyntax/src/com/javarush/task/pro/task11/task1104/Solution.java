package com.javarush.task.pro.task11.task1104;


public class Solution {
    public static void main(String[] args) {
        String string = "12.84";
        double dbl = Double.parseDouble(string);
        int x = (int) Math.round(dbl);
        System.out.println(x);
    }
}
