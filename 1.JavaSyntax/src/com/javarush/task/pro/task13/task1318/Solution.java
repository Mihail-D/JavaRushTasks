package com.javarush.task.pro.task13.task1318;

public class Solution {

    public static void main(String[] args) {
        System.out.println(getNextMonth(Month.JANUARY));
        System.out.println(getNextMonth(Month.JULY));
    }

    public static Month getNextMonth(Month month) {
        Month[] arr = Month.values();

        Month x;

        if (month.ordinal() == arr.length - 1) {
            x = arr[0];
        }
        else {
            int i = month.ordinal() + 1;
            x = arr[i];
        }

        return x;
    }
}
