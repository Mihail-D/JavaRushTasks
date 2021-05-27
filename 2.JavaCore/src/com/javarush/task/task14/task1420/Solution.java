package com.javarush.task.task14.task1420;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
/*    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(reader.readLine());
        int y = Integer.parseInt(reader.readLine());

        int min = Math.min(x, y);
        int max = Math.max(x, y);
        int nod = Integer.MAX_VALUE;
        int count = min;

        while (count > 0) {
            count--;
            if (min % count == 0 && max % count == 0) {
                nod = count;
                break;
            }
        }
        System.out.println(nod);
    }*/
public static void main(String[] args) throws Exception {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    int first = Integer.parseInt(reader.readLine());
    int second = Integer.parseInt(reader.readLine());

    System.out.println(getNOD(first, second));
}

    private static int getNOD(int first, int second) {
        if (first < 1 || second < 1) {
            throw new IllegalArgumentException();
        }

        while (first != second) {
            if (first > second) {
                first -= second;
            }
            if (second > first) {
                second -= first;
            }
        }
        return first;
    }
}
