package com.javarush.task.pro.task04.task0408;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = Integer.MIN_VALUE;

        while (true) {
            try {
                int x = scanner.nextInt();
                if (x % 2 == 0 && x > max) {
                    max = x;
                }
            } catch (InputMismatchException e) {
                break;
            }
        }
        System.out.println(max);
    }
}