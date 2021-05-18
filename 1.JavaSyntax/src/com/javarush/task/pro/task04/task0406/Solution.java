package com.javarush.task.pro.task04.task0406;

import java.util.Scanner;


public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String name = scanner.nextLine();
            if (name.equals("enough")) {
                break;
            }
            else {
                System.out.println(name);
            }
        }
    }
}