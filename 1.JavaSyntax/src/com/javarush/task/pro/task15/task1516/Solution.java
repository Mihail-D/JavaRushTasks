package com.javarush.task.pro.task15.task1516;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Solution {
    private static final String THIS_IS_FILE = " - это файл";
    private static final String THIS_IS_DIR = " - это директория";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String name = scanner.nextLine();
            Path path = Paths.get(name);

            if (Files.isRegularFile(path)) {
                System.out.println(name + THIS_IS_FILE);
            }
            else if (Files.isDirectory(path)) {
                System.out.println(name + THIS_IS_DIR);
            }
            else {
                break;
            }
        }


    }
}

