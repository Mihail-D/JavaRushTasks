package com.javarush.task.pro.task03.task0312;

import java.util.Scanner;


public class Solution {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String nameOne = scanner.nextLine();
        String nameTwo = scanner.nextLine();

        System.out.println(nameOne.equals(nameTwo) ? "строки одинаковые" : "строки разные");
    }
}
