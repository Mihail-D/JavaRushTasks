package com.javarush.task.pro.task11.task1109;

public class Solution {
    public static void main(String[] args) {
        Outer.Nested nstd = new Outer.Nested();
        Outer.Inner inr = new Outer().new Inner();
    }
}
