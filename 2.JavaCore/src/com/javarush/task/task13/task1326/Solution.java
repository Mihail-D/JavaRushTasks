package com.javarush.task.task13.task1326;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class Solution {
    /*public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();
        BufferedReader objReader = new BufferedReader(new FileReader(path));
        List<Integer> list = new ArrayList<>();
        String strCurrentLine;

        while ((strCurrentLine = objReader.readLine()) != null) {
            list.add(Integer.parseInt(strCurrentLine));
        }

        List<Integer> x = list.stream().filter(a -> a % 2 == 0).collect(Collectors.toList());
        x.sort(Comparator.naturalOrder());

        for (int i : x) {
            System.out.println(i);
        }

        objReader.close();
    }*/

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sourceFileName = reader.readLine();
        java.io.FileInputStream fileInputStream = new java.io.FileInputStream(sourceFileName);

        Scanner scanner = new Scanner(fileInputStream);
        List<Integer> data = new ArrayList<Integer>();

        while (scanner.hasNext()) {
            int value = scanner.nextInt();
            if (value % 2 == 0) data.add(value);
        }

        Collections.sort(data);

        for (Integer value : data)
            System.out.println(value);

        scanner.close();
        fileInputStream.close();
    }
}
