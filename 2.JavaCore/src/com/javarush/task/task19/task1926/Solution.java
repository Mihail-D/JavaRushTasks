package com.javarush.task.task19.task1926;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

/* 
Перевертыши
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();

        BufferedReader br = new BufferedReader(new FileReader(s));

        while (br.ready()) {
            String str = br.readLine();
            String[] arr = str.split(" ");
            ArrayList<String> list = new ArrayList<String>(Arrays.asList(arr));
            Collections.reverse(list);

            for (String i : list) {
                StringBuilder sb = new StringBuilder(i).reverse();
                System.out.print(sb + " ");
            }
        }

        br.close();
        reader.close();
    }
}
