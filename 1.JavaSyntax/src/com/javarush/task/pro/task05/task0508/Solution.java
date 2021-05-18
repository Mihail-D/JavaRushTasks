package com.javarush.task.pro.task05.task0508;

import java.util.Scanner;

public class Solution {
    public static String[] strings;

    public static void main(String[] args) {
        strings = new String[10];
        String mark = "";
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            String name = scanner.nextLine();
            strings[i] = name;
        }

        for (int i = 0; i < strings.length; i++) {
            int count = 0;
            if (strings[i] != null) {
                mark = strings[i];
            }

            for (int j = 0; j < strings.length; j++) {
                if (strings[j] != null && strings[j].equals(mark)) {
                    count++;
                    if (count >= 2) {
                        for (int k = 0; k < strings.length; k++) {
                            if (strings[k] == null) {
                                continue;
                            }
                            else if (strings[k].equals(mark)) {
                                strings[k] = null;
                            }
                        }
                    }
                }
            }
            count = 0;
        }

        for (int i = 0; i < strings.length; i++) {
            System.out.print(strings[i] + ", ");
        }
    }
}
