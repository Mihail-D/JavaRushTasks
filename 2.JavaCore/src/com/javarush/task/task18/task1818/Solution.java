package com.javarush.task.task18.task1818;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

/* 
Два в одном
*/

public class Solution {
/*    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s1 = reader.readLine();
        Path path = Paths.get(s1);
        String s2 = reader.readLine();
        String s3 = reader.readLine();

        FileOutputStream fos = new FileOutputStream(s1);
        FileInputStream fis1 = new FileInputStream(s2);
        FileInputStream fis2 = new FileInputStream(s3);

        byte[] buffer1 = new byte[fis1.available()];
        byte[] buffer2 = new byte[fis2.available()];

        while (fis1.available() > 0) {
            int x = fis1.read(buffer1);
            fos.write(buffer1);
        }

        while (fis2.available() > 0) {
            int x = fis2.read(buffer2);
            Files.write(Paths.get(String.valueOf(path)), buffer2, StandardOpenOption.APPEND);
        }

        fis1.close();
        fis2.close();
        fos.close();
    }*/

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();
        String fileName3 = reader.readLine();

        try (FileOutputStream fileOutputStream = new FileOutputStream(fileName1);
             FileInputStream fileInputStream1 = new FileInputStream(fileName2);
             FileInputStream fileInputStream2 = new FileInputStream(fileName3)) {
            while (fileInputStream1.available() > 0) {
                fileOutputStream.write(fileInputStream1.read());
            }
            while (fileInputStream2.available() > 0) {
                fileOutputStream.write(fileInputStream2.read());
            }
        }
    }
}
