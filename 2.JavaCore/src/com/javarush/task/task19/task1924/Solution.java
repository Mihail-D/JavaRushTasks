package com.javarush.task.task19.task1924;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* 
Замена чисел
*/

public class Solution {
    public static Map<Integer, String> map = new HashMap<Integer, String>();

    static {
        map.put(0, "ноль");
        map.put(1, "один");
        map.put(2, "два");
        map.put(3, "три");
        map.put(4, "четыре");
        map.put(5, "пять");
        map.put(6, "шесть");
        map.put(7, "семь");
        map.put(8, "восемь");
        map.put(9, "девять");
        map.put(10, "десять");
        map.put(11, "одиннадцать");
        map.put(12, "twelve");
    }

    public static void main(String[] args) throws IOException {
/*        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();*/
        BufferedReader br = new BufferedReader(new FileReader("D:\\Tempo\\test.txt"));

        while (br.ready()) {
            String string = br.readLine();
            String[] arr = string.split(" ");

            for (String i : arr) {
                if (!i.contains("[a-zA-Zа-яА-Я]+") && i.length() > 1) {
                    System.out.print(i + " ");
                }
                else if (i.matches("\\d|1[0-2]")) {
                    System.out.print(map.get(Integer.parseInt(i))  + " ");
                }
            }
            System.out.println("");
        }
    br.close();
    //reader.close();
    }
}
// line=line.replaceAll("\\b"+entry.getKey()+"\\b",entry.getValue());