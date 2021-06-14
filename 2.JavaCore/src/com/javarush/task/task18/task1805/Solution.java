package com.javarush.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* 
Сортировка байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        ArrayList<Integer> list = new ArrayList<>();

        FileInputStream fis = new FileInputStream(s);

        while (fis.available() > 0) {
            int x = fis.read();
            if (!list.contains(x)) {
                list.add(x);
            }
        }
        fis.close();

        Collections.sort(list);

        for (int i : list) {
            System.out.print(i);
            System.out.print(" ");
        }
    }
}
