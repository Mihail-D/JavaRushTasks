package com.javarush.task.pro.task03.task0301;
import java.util.Scanner;


/* 
Тепло или холодно
*/

public class Solution {
    public static void main(String[] args)  {



Scanner scanner = new Scanner(System.in);
String name = scanner.nextLine();
int n = Integer.parseInt(name);
    
    
    if (n < 0) {
        System.out.println("на улице холодно"); 
    } 
    else {System.out.println("на улице тепло");}
        
        
    }
}
