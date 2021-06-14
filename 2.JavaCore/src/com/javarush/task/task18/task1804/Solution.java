package com.javarush.task.task18.task1804;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* 
Самые редкие байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        HashMap<Integer, Integer> map = new HashMap<>();
        int min = Integer.MAX_VALUE;

        FileInputStream fis = new FileInputStream(s);

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
            if (i < min) {
                min = i;
            }
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == min) {
                System.out.print(entry.getKey());
                System.out.print(" ");
            }
        }
    }
}
