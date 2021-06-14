package com.javarush.task.task18.task1801;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Максимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();

        FileInputStream fl = new FileInputStream(s);
        int max = Integer.MIN_VALUE;

        while (fl.available() > 0) {
            int x = fl.read();
            if (x > max) {
                max = x;
            }
        }

        fl.close();
        System.out.println(max);

    }
}
