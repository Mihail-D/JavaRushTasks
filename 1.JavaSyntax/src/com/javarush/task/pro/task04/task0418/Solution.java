package com.javarush.task.pro.task04.task0418;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        double glass = 0.5;

        Scanner scanner = new Scanner(System.in);
        boolean x = scanner.nextBoolean();

        System.out.println(!x ? (int) Math.floor(glass) : (int) Math.ceil(glass));
    }
}