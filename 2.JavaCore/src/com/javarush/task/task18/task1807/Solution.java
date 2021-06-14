package com.javarush.task.task18.task1807;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Подсчет запятых
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        int comas = 0;
        FileInputStream fis = new FileInputStream(s);

        char character = ',';
        int ascii = (int) character;

        while (fis.available() > 0) {
            int x = fis.read();
            if (x == ascii) {
                comas++;
            }
        }
        fis.close();

        System.out.println(comas);
    }
}
