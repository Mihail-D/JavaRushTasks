package com.javarush.task.pro.task03.task0314;

import java.util.Scanner;

public class Solution {
    public static String secret = "AmIGo";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name1 = scanner.nextLine().toLowerCase();

        System.out.println(name1.equals(secret.toLowerCase()) ? "доступ разрешен" : "доступ запрещен");
    }
}
