package com.javarush.task.task18.task1817;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

/* 
Пробелы
*/

public class Solution {
    /*public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream(args[0]);
        int fisLen = (int) fis.getChannel().size(); //692
        int fisSpaces = 0; //98

        while (fis.available() > 0) {
            int x = fis.read();

            if (x == (int) ' ') {
                fisSpaces++;
            }
        }

        fis.close();

        double result = (double) fisSpaces / fisLen * 100;

        System.out.printf("%.2f", result);
    }*/

    public static void main(String[] args) throws IOException {
        int total = 0;
        int spaces = 0;
        try (FileReader fileReader = new FileReader(args[0])) {
            while (fileReader.ready()) {
                int readedChar = fileReader.read();
                total++;
                if (readedChar == (int) ' ') spaces++;
            }
        }
        if (total != 0) {
            double result = (double) spaces / total * 100;
            System.out.printf("%.2f", result);
        }
    }
}
