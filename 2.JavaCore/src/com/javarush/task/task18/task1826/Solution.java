package com.javarush.task.task18.task1826;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/* 
Шифровка
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        if (args[0].equals("-e")) {
            FileInputStream fis = new FileInputStream(args[1]);
            FileOutputStream fos = new FileOutputStream(args[2]);

            while (fis.available() > 0) {
                int x = fis.read();
                x++;
                fos.write(x);
            }

            fis.close();
            fos.close();
        }

        if (args[0].equals("-d")) {
            FileInputStream fis = new FileInputStream(args[1]);
            FileOutputStream fos = new FileOutputStream(args[2]);

            while (fis.available() > 0) {
                int x = fis.read();
                x--;
                fos.write(x);
            }

            fis.close();
            fos.close();
        }
    }
}
