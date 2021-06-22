package com.javarush.task.task19.task1923;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/* 
Слова с цифрами
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(args[0]));
        FileWriter fw = new FileWriter(args[1]);

        while (br.ready()) {
            String str = br.readLine();
            String[] arr = str.split(" ");

            for (String i : arr) {
                if (i.matches(".*[0-9].*")) {
                    fw.write(i + " ");
                }
            }
        }
        fw.close();
        br.close();
    }
}
