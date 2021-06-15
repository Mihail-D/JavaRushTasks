package com.javarush.task.task18.task1808;

import java.io.*;

/* 
Разделение файла
*/

public class Solution {
    /*public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s1 = reader.readLine();
        String s2 = reader.readLine();
        String s3 = reader.readLine();
        FileInputStream fis = new FileInputStream(s1);
        FileOutputStream fos1 = new FileOutputStream(s2);
        FileOutputStream fos2 = new FileOutputStream(s3);

        long fileSize1 = fis.getChannel().size();
        long fileSize2;
        long fileSize3;

        if (fileSize1 % 2 == 0) {
            fileSize2 = fileSize1 / 2;
            fileSize3 = fileSize1 / 2;
        }
        else {
            fileSize2 = (fileSize1 + 1) / 2;
            fileSize3 = fileSize1 - fileSize2;
        }

        byte[] buffer1 = new byte[(int) fileSize2];
        byte[] buffer2 = new byte[(int) fileSize3];

        while (fis.available() > 0) {
            int x = 0;

            for (int i = 0; i < fileSize1; i++) {
                x = fis.read();

                if (i < fileSize2) {
                    buffer1[i] = (byte) x;
                }
                else {

                    buffer2[(int) ((i - fileSize2))] = (byte) x;
                    if ((int) (i - fileSize2) >= fileSize3) {
                        break;
                    }
                }
            }

            fos1.write(buffer1);
            fos2.write(buffer2);
        }

        fis.close();
        fos1.close();
        fos2.close();
    }*/

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String inputFile = reader.readLine();
        String outputFile1 = reader.readLine();
        String outputFile2 = reader.readLine();

        try (FileInputStream fileInputStream = new FileInputStream(inputFile);
             FileOutputStream fileOutputStream1 = new FileOutputStream(outputFile1);
             FileOutputStream fileOutputStream2 = new FileOutputStream(outputFile2)) {

            int halfOfFile = (fileInputStream.available() + 1) / 2;
            int numberOfByte = 0;
            while (fileInputStream.available() > 0) {
                if (numberOfByte < halfOfFile) {
                    fileOutputStream1.write(fileInputStream.read());
                    numberOfByte++;
                } else fileOutputStream2.write(fileInputStream.read());
            }
        }
    }
}
