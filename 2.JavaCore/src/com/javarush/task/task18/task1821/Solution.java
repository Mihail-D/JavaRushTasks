package com.javarush.task.task18.task1821;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/* 
Встречаемость символов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream(args[0]);

        HashMap<Character, Integer> map = new HashMap<>();

        while (fis.available() > 0) {
            int x = fis.read();

            if (!map.containsKey((char) x)) {
                map.put((char) x, 1);
            }
            else {
                map.put((char) x, map.get((char) x) + 1);
            }
        }

        ArrayList<Character> list = new ArrayList<>(map.keySet());
        Collections.sort(list);

        for (Character i : list) {
            System.out.println(i + " " + map.get(i));
        }

     fis.close();
    }
}


