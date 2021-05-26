package com.javarush.task.task13.task1319;

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();
        String str;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new FileWriter(path));

        while (!(str = br.readLine()).equals("exit")) {
            bw.write(str + "\n");
            bw.flush();
        }

        bw.write("exit");
        bw.close();
    }
}
