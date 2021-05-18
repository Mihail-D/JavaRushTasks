package com.javarush.task.pro.task02.task0214;

import java.util.Scanner;

/* 
Чтение и преобразование строк
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
        
        
        System.out.println(nameThree);
        System.out.println(nameTwo.toUpperCase());
        System.out.println(nameOne.toLowerCase());
        
        


    }
}
