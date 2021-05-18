package com.javarush.task.pro.task05.task0511;

import java.util.Scanner;

public class Solution {
    public static int[][] multiArray;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        multiArray = new int[x][];

        for (int i = 0; i < x; i++) {
            int y = scanner.nextInt();
            multiArray[i] = new int[y];
        }
    }
}
