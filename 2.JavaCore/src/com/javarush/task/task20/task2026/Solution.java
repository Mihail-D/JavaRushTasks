package com.javarush.task.task20.task2026;

/* 
Алгоритмы-прямоугольники
*/

public class Solution {
    public static void main(String[] args) {
        byte[][] a1 = new byte[][]{
                {1, 1, 0, 0},
                {1, 1, 0, 0},
                {1, 1, 0, 0},
                {1, 1, 0, 1}
        };
        byte[][] a2 = new byte[][]{
                {1, 0, 0, 1},
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {1, 0, 0, 1}
        };

        int count1 = getRectangleCount(a1);
        System.out.println("count = " + count1 + ". Должно быть 2");
        int count2 = getRectangleCount(a2);
        System.out.println("count = " + count2 + ". Должно быть 4");
    }

    public static int getRectangleCount(byte[][] arr) {
        byte[][] array = new byte[arr.length][arr[0].length];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = arr[i][j];
            }
        }

        int horizontal = array[0].length;
        int vertical = array.length;
        int counter;
        int verticalEnd;
        int horizontalEnd;
        int result = 0;
        for (int i = 0; i < vertical; i++) {
            for (int j = 0; j < horizontal; j++) {
                if (array[i][j] == 1) {
                    verticalEnd = i;
                    horizontalEnd = j;
                    counter = i + 1;
                    System.out.println("a[" + counter + "][" + j + "]");
                    while (true) {
                        if (counter >= vertical || (array[counter][j] == 0 && counter < vertical)) {
                            verticalEnd = counter - 1;
                            System.out.println("verEnd = " + verticalEnd);
                            break;
                        }
                        counter++;
                        System.out.println("a[" + counter + "][" + j + "]");
                    }
                    //по горизонтали
                    counter = j + 1;
                    while (true) {
                        if (counter >= horizontal || (array[i][counter] == 0 && counter < horizontal)) {
                            horizontalEnd = counter - 1;
                            System.out.println("horEnd = " + horizontalEnd);
                            break;
                        }
                        counter++;
                    }
                    boolean flag = true;
                    for (int p = i; p <= verticalEnd; p++)
                        for (int q = j; q <= horizontalEnd; q++)
                            if (array[p][q] != 1) {
                                flag = false;
                                break;
                            }
                    if (flag) {
                        System.out.println("startI = " + i);
                        System.out.println("startJ = " + j);
                        System.out.println("endI = " + verticalEnd);
                        System.out.println("endJ = " + horizontalEnd);
                        for (int p = i; p <= verticalEnd; p++)
                            for (int q = j; q <= horizontalEnd; q++)
                                array[p][q] = 0;
                        result++;
                    }
                    System.out.println();
                }
            }
        }
        return result;
    }
}
