package com.javarush.task.task18.task1819;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Объединение файлов
*/

public class Solution {
/*    public static void main(String[] args) throws IOException {
        List<Integer> inputs = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s1 = reader.readLine();
        String s2 = reader.readLine();

        FileInputStream fis = new FileInputStream(s1);
        FileInputStream fis1 = new FileInputStream(s2);
        FileWriter writer;

        while (fis1.available() > 0) {
            int x = fis1.read();
            inputs.add(x);
        }

        while (fis.available() > 0) {
            int x = fis.read();
            inputs.add(x);
        }

        writer = new FileWriter("D:\\Tempo\\test.txt");
        for (int i : inputs) {
            writer.write(i);
        }

        writer.close();
        fis.close();
        fis1.close();
    }*/

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();

        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try (FileInputStream fileInputStream1 = new FileInputStream(fileName1);
             FileInputStream fileInputStream2 = new FileInputStream(fileName2)) {

            while (fileInputStream2.available() > 0) {
                byteArrayOutputStream.write(fileInputStream2.read());
            }
            while (fileInputStream1.available() > 0) {
                byteArrayOutputStream.write(fileInputStream1.read());
            }
        }
        try (FileOutputStream fileOutputStream = new FileOutputStream(fileName1)) {
            byteArrayOutputStream.writeTo(fileOutputStream);
        }
    }
}
