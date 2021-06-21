package com.javarush.task.task19.task1920;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.TreeMap;

/* 
Самый богатый
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        TreeMap<String, Double> map = new TreeMap<>();
        BufferedReader br = new BufferedReader(new FileReader(args[0]));
        double max = Double.MIN_VALUE;

        while (br.ready()) {
            String str = br.readLine();
            String[] arr = str.split(" ");
            String key = arr[0];

            if (!map.containsKey(key)) {
                map.put(key, Double.parseDouble(arr[1]));
            }
            else {
                map.put(key, map.get(arr[0]) + Double.parseDouble(arr[1]));
            }
        }

        for (String i : map.keySet()) {
            if (map.get(i) > max) {
                max = map.get(i);
            }
        }

        for (String i : map.keySet()) {
            if (map.get(i) == max) {
                System.out.println(i);
            }
        }

        br.close();
    }
}
