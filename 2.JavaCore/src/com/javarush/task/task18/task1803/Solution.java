package com.javarush.task.task18.task1803;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* 
D:\Downloads\test.txt
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        Map<Integer, Integer> map = new HashMap<>();
        FileInputStream fis = new FileInputStream(s);
        int max = Integer.MIN_VALUE;

        while (fis.available() > 0) {
            int x = fis.read();

            if (!map.containsKey(x)) {
                map.put(x, 1);
            }
            else {
                map.put(x, map.get(x) + 1);
            }
        }
        fis.close();

        for (int i : map.values()) {
            if (i > max) {
                max = i;
            }
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == max) {
                System.out.print(entry.getKey());
                System.out.print(" ");
            }
        }
    }
}
