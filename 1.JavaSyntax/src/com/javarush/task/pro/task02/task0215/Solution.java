package com.javarush.task.pro.task02.task0215;

import java.util.Scanner;

/* 
Чтение чисел
*/

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 1;
        
        String nameOne = "";
        String nameTwo = "";
        String nameThree = "";
        
        while (count <= 3) {
            if (count == 1) {
                nameOne = scanner.nextLine();
            }
            if (count == 2) {
                nameTwo = scanner.nextLine();
            }
            if (count == 3) {
                nameThree = scanner.nextLine();
            }
        
           count++;
        }
        
        int result = (Integer.parseInt(nameOne) + Integer.parseInt(nameTwo) + Integer.parseInt(nameThree)) / 3; 
        System.out.println(result);

    }
}
