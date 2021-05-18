package com.javarush.task.pro.task08.task0803;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        int[] intArray = getArrayOfTenElements();
        System.out.println(min(intArray));
    }

    public static int min(int[] ints) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < ints.length - 1; i++) {
            int x = Math.min(ints[i], ints[i + 1]);
            if (x < min) {
                min = x;
            }
        }
        return min;
    }

    public static int[] getArrayOfTenElements() {
        int[] arr = new int[10];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            int x = scanner.nextInt();
            arr[i] = x;
        }
        return arr;
    }
}
