package com.javarush.task.task19.task1919;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeMap;

/* 
Считаем зарплаты
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        TreeMap<String, Double> map = new TreeMap<>();

        BufferedReader br = new BufferedReader(new FileReader(args[0]));

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
            System.out.println(i + " " + map.get(i));
        }


        br.close();
    }

}
