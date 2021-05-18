package com.javarush.task.pro.task03.task0305;
import java.util.Scanner;
/* 
Три числа
*/
public class Solution {
    public static void main(String[] args) {
        Scanner numbers = new Scanner(System.in);
        int num1 = numbers.nextInt();
        int num2 = numbers.nextInt();
        int num3 = numbers.nextInt();
        if (num1 == num2 && num2 == num3 && num1 == num3) {
            System.out.println(num1 + " " + num2 + " " + num3);
        }
             else if (num2 == num3) {
                System.out.println(num2 + " " + num3);
             }
                 else if (num1 == num3) {
                    System.out.println(num1 + " " + num3);
                 }
                     else if (num1 == num2) {
                        System.out.println(num1 + " " + num2);
                     }
                     else System.out.print("");
    }
}