package com.javarush.task.pro.task04.task0409;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = Integer.MAX_VALUE;

        while (true) {
            try {
                int x = scanner.nextInt();
                if (x < min) {
                    min = x;
                }
            } catch (InputMismatchException e) {
                break;
            }
        }
        System.out.println(min);
    }

}
