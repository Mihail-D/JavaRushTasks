package com.javarush.task.task18.task1802;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Минимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();

        FileInputStream fl = new FileInputStream(s);
        int min = Integer.MAX_VALUE;

        while (fl.available() > 0) {
            int x = fl.read();
            if (x < min) {
                min = x;
            }
        }

        fl.close();
        System.out.println(min);
    }
}
