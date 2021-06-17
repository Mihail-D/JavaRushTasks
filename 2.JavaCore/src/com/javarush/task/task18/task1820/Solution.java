package com.javarush.task.task18.task1820;

import java.io.*;

/* 
Округление чисел
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s1 = reader.readLine();
        String s2 = reader.readLine();
        StringBuilder str = new StringBuilder();
        FileInputStream fis = new FileInputStream(s1);

        while (fis.available() > 0) {
            int x = fis.read();
            char c = (char) x;
            str.append(c);
        }

        String string = str.toString();
        String[] arr = string.split(" ");

        PrintWriter pr = new PrintWriter(s2);

        for (String s : arr) {
            double q = Double.parseDouble(s);
            pr.print(Math.round(q));
            pr.print(" ");
        }

        fis.close();
        pr.close();
    }
}
