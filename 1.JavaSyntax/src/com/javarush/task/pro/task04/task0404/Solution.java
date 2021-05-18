package com.javarush.task.pro.task04.task0404;

public class Solution {
    public static void main(String[] args) {
        String str = "Q";
        int x = 0;
        int y = 0;

        while (x < 5) {
            while (y < 10) {
                System.out.print("Q");
                y++;
            }
            System.out.println("");
            y = 0;
            x++;
        }
    }
}