package com.javarush.task.pro.task04.task0412;

public class Solution {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 1; i <= 17; i++) {
            if (i % 3 == 0) {
                sum += i;
            }
            else {
                continue;
            }
        }
        System.out.println(sum);
    }
}