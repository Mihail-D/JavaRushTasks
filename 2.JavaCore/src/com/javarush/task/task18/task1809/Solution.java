package com.javarush.task.task18.task1809;

import java.io.*;
import java.util.ArrayList;

/* 
Реверс файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s1 = reader.readLine();
        String s2 = reader.readLine();

        FileInputStream fis = new FileInputStream(s1);
        FileOutputStream fos = new FileOutputStream(s2);
        ArrayList<Integer> list = new ArrayList<>();

        while (fis.available() > 0) {
            int x = fis.read();
            list.add(x);
        }

        for (int i = list.size() - 1; i >= 0; i--) {
            fos.write(list.get(i));
        }

        fis.close();
        fos.close();
    }
}
