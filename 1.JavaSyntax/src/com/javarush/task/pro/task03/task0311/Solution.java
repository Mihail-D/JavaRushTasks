package com.javarush.task.pro.task03.task0311;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();

        if ((Math.abs(x - y)) < 0.000001) {
            System.out.println("числа равны");
        }
        else {
            System.out.println("числа не равны");
        }
    }
}
