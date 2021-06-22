/*
package com.javarush.task.task19.task1925;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

*/
/*
Длинные слова
*//*


public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("D:\\Tempo\\test.txt"));
        FileWriter fw = new FileWriter("D:\\Tempo\\test1.txt");

        while (br.ready()) {
            String str = br.readLine();
            String[] arr = str.split(" ");

            for (int i = 0; i < arr.length; i++) {
                if (arr[i].length() > 6) {
                    fw.write(arr[i]);
                    if (i != arr.length - 1) {
                        fw.write(",");
                    }
                }

            }
        }
        fw.close();
        br.close();
    }
}
*/
package com.javarush.task.task19.task1925;


import java.io.*;
import java.util.ArrayList;

/*
Длинные слова
*/

public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader in = new BufferedReader(new FileReader(args[0]));
        BufferedWriter out = new BufferedWriter(new FileWriter(args[1]));
        StringBuilder sb = new StringBuilder();
        while (in.ready()) {
            String line = in.readLine();
            String[] words = line.split(" ");
            for (String word : words) {
                if (word.length() > 6)
                    sb.append(word + ",");
            }
        }
        sb.deleteCharAt(sb.length() - 1);
        out.write(sb.toString());
        in.close();
        out.close();
    }
}
