/*package com.javarush.task.task19.task1908;

import java.io.*;

*//*
Выделяем числа
*//*

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s1 = reader.readLine();
        String s2 = reader.readLine();

        FileReader fr = new FileReader(s1);
        FileWriter fw = new FileWriter(s2);
        String result = "";

        while (fr.ready()) {
            int x = fr.read();
            result += String.valueOf((char) x);
        }

        String[] arr = result.split(" ");

        for (String i : arr) {
            if (i.matches("[0-9]+")) {
                fw.write(i);
                fw.write(" ");
            }
        }

        fr.close();
        fw.close();
        reader.close();
    }
}*/
package com.javarush.task.task19.task1908;


import java.io.*;
import java.util.ArrayList;

/*
Выделяем числа
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        String inputFileName;
        String outputFileName;

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            inputFileName = reader.readLine();
            outputFileName = reader.readLine();
        }

        ArrayList<String> fileContent = new ArrayList<>();
        try (BufferedReader inputFileReader = new BufferedReader(new FileReader(inputFileName))) {
            while (inputFileReader.ready()) {
                fileContent.add(inputFileReader.readLine());
            }
        }

        try (BufferedWriter outputFileWriter = new BufferedWriter(new FileWriter(outputFileName))) {
            for (String line : fileContent) {
                String[] splitLine = line.trim().split(" ");
                for (String word : splitLine) {
                    try {
                        int num = Integer.parseInt(word);
                        outputFileWriter.write(word + " ");
                    } catch (Exception ignore) {
                        /* NOP */
                    }
                }
            }
        }
    }
}
