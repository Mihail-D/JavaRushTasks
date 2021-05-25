package com.javarush.task.task12.task1207;

/* 
Int и Integer
*/

public class Solution {
    public static void main(String[] args) {
        print(12);
        print(new Integer(12));
    }

    public static void print(int x) {
        System.out.println(x);
    }

    public static void print(Integer x) {
        System.out.println(x);
    }
}
