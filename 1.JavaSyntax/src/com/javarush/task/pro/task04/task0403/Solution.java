package com.javarush.task.pro.task04.task0403;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int sum = 0;

        while (true) {
            String str = scanner.nextLine();
            if (str.equals("ENTER")) {
                System.out.println(sum);
                break;
            }
            else {
                sum += Integer.parseInt(str);
            }
        }
    }
}