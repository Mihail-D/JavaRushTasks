package com.javarush.task.pro.task03.task0309;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberA = scanner.nextInt();
        int numberB = scanner.nextInt();

        int biggerInt = 0;

        System.out.println(numberA > numberB ? numberA : numberB);



        /*if (numberA > numberB) {
            System.out.println(numberA);
        } else {
            System.out.println(numberB);
        }*/
    }
}
