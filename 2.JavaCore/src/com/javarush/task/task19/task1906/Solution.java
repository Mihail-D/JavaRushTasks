package com.javarush.task.task19.task1906;

import java.io.*;

/*
Четные символы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s1 = reader.readLine();
        String s2 = reader.readLine();
        int count = 0;
        FileReader fr = new FileReader(s1);
        FileWriter fw = new FileWriter(s2);

        while (fr.ready()) {
            count++;
            int x = fr.read();

            if (count % 2 == 0) {
                fw.write(x);
            }
        }

        reader.close();
        fr.close();
        fw.close();
    }
}
