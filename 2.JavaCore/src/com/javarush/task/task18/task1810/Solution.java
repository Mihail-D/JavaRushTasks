package com.javarush.task.task18.task1810;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/* 
DownloadException
*/

public class Solution {
    public static void main(String[] args) throws DownloadException, IOException {
/*        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String s = reader.readLine();
            FileInputStream fis = new FileInputStream(s);
            Path path = Paths.get(s);
            long size = Files.size(path);

            if (size < 1000) {
                fis.close();
                throw new DownloadException();
            }
        }*/
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String fileName = reader.readLine();

            try (FileInputStream fileInputStream = new FileInputStream(fileName)) {
                if (fileInputStream.available() < 1000) throw new DownloadException();
            }
        }
    }

    public static class DownloadException extends Exception {

    }
}
