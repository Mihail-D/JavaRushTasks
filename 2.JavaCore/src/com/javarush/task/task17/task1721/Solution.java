package com.javarush.task.task17.task1721;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Транзакционность
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String path1 = reader.readLine();
        String path2 = reader.readLine();

        BufferedReader br = new BufferedReader(new FileReader(path1));
        String sCurrentLine;

        while ((sCurrentLine = br.readLine()) != null) {
            allLines.add(sCurrentLine);
        }

        String sCurrentLine1;
        BufferedReader br1 = new BufferedReader(new FileReader(path2));
        while ((sCurrentLine1 = br1.readLine()) != null) {
            forRemoveLines.add(sCurrentLine1);
        }

        br.close();
        br1.close();

        Solution solution = new Solution();
        solution.joinData();

    }

    public void joinData() throws CorruptedDataException {
        if (allLines.containsAll(forRemoveLines)) {
            allLines.removeAll(forRemoveLines);
        }
        else {
            allLines.clear();
            throw new CorruptedDataException();
        }
    }
}
