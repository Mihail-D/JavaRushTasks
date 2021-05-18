package com.javarush.task.pro.task15.task1517;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Path filePath = Path.of(scanner.nextLine());
        Path fileNewPath = Path.of(scanner.nextLine());

        if (!Files.exists(filePath)) {
            Files.createFile(filePath);
        }

        if (Files.exists(filePath)) {
            if (!Files.exists(fileNewPath)) {
                Files.move(filePath, fileNewPath);
            }
            else {
                Files.delete(filePath);
            }
        }
    }
}

/*
1.	Если файла по первому пути не существует, его нужно создать.
2.	Если же файл по первому пути существует, нужно переместить этот файл по второму пути, но только в том случае, если по второму пути файла нет.
3.	Если же он есть, нужно просто удалить файл по первому пути.
*/