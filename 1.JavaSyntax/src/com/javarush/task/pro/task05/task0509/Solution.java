package com.javarush.task.pro.task05.task0509;

/*
Таблица умножения
*/

public class Solution {

    public static int[][] MULTIPLICATION_TABLE;

    public static void main(String[] args) {
        MULTIPLICATION_TABLE = new int[10][10];
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                MULTIPLICATION_TABLE[i - 1][j - 1] = i * j;
                System.out.print(MULTIPLICATION_TABLE[i - 1][j - 1]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}

/*package com.javarush.task.pro.task05.task0509;

public class Solution {

    public static int[][] MULTIPLICATION_TABLE;

    public static void main(String[] args) {
        MULTIPLICATION_TABLE = new int[][] {{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}};
        String result = "";
        for (int i = 0; i < MULTIPLICATION_TABLE[0].length; i++) {
            for (int j = 0; j < MULTIPLICATION_TABLE[1].length; j++) {
                result = MULTIPLICATION_TABLE[0][i] * MULTIPLICATION_TABLE[1][j] + " ";
                System.out.print(result);
            }
            result.trim();
            System.out.println();
        }

    }
}*/


