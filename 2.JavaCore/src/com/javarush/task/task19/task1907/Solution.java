package com.javarush.task.task19.task1907;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Считаем слово
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        String str = "";
        int counter = 0;

        FileReader fr = new FileReader(s);

        while (fr.ready()) {
            int x = fr.read();
            char c = (char) x;

            if (!Character.isLetter(c)) {
                str += " ";
            }
            else {
                str += c;
            }
        }

        String[] arr = str.split(" ");

        for (String i : arr) {
            if (i.equals("world")) {
                counter++;
            }
        }

        System.out.println(counter);

        reader.close();
        fr.close();
    }
}
