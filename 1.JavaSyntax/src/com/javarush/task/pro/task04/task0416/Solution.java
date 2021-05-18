package com.javarush.task.pro.task04.task0416;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        double result = (x * 1.0 / y);
        System.out.println(result);
    }
}