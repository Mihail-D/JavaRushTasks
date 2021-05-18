package com.javarush.task.pro.task17.task1708;

public class MinMaxUtil {
    public static int min(int a, int b) {
        return Math.min(a, b);
    }
    public static int min(int a, int b, int c) {
        return Math.min(Math.min(a, b), Math.min(b, c));
    }
    public static int min(int a, int b, int c, int d) {
        return Math.min(Math.min(a, b), Math.min(c, d));
    }
    public static int min(int a, int b, int c, int d, int e) {
        int x = Math.min(Math.min(a, b), Math.min(c, d));
        return Math.min(x, e);
    }

    public static int max(int a, int b) {
        return Math.max(a, b);
    }
    public static int max(int a, int b, int c) {
        return Math.max(Math.max(a, b), Math.max(b, c));
    }
    public static int max(int a, int b, int c, int d) {
        return Math.max(Math.max(a, b), Math.max(c, d));
    }
    public static int max(int a, int b, int c, int d, int e) {
        int x = Math.max(Math.max(a, b), Math.max(c, d));
        return Math.max(x, e);
    }
}
