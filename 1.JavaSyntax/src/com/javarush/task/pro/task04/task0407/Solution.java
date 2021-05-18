package com.javarush.task.pro.task04.task0407;


public class Solution {
    public static void main(String[] args) {

        int count = 1;
        int sum = 0;

        while (count <= 100) {
            if (count % 3 != 0) {
                sum += count;
                count++;
            }
            else {
                count++;
                continue;
            }

        }

        System.out.println(sum);
    }
}