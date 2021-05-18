package com.javarush.task.pro.task04.task0414;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int number = scanner.nextInt();

        if (number <= 0 || number >= 5) {
            System.out.println(name);
        }

        do {
            if (number > 0 && number < 5) {
                System.out.println(name);
                number--;
            }
            else {
                break;
            }
        }
        while (number > 0);


    }
}