/*package com.javarush.task.pro.task12.task1210;

import java.util.ArrayList;
import java.util.Iterator;

public class Solution {
    private static final ArrayList<Integer> numbers = new ArrayList<>(10);

    public static void main(String[] args) {
        init(numbers);
        print(numbers);

        reverse(numbers);
        print(numbers);
    }

    public static ArrayList<Integer> init(ArrayList<Integer> numbers) {
        for (int i = 0; i < 10; i++) {
            numbers.add(i, i);
        }
        return numbers;
    }

    public static void reverse(ArrayList<Integer> numbers) {
        int n = numbers.size() - 1;
        for (int i = 0; i < numbers.size() / 2; i++) {
            int temp = numbers.get(i);
            numbers.set(i, n - i);
            numbers.set(n - i, temp);
        }
    }

    private static void print(ArrayList<Integer> numbers) {
        Iterator<Integer> iterator = numbers.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}*/

package com.javarush.task.pro.task12.task1210;

import java.util.ArrayList;

/*
Переворачивание данных
*/

public class Solution {
    public static ArrayList<Integer> numbers = new ArrayList<>();

    public static void main(String[] args) {
        init();
        print();

        reverse();
        print();
    }

    public static void init() {
        for (int i = 0; i < 10; i++) {
            numbers.add(i);
        }
    }

    public static void reverse() {
        int n = numbers.size() - 1;
        for (int i = 0; i < numbers.size() / 2; i++) {
            int temp = numbers.get(i);
            numbers.set(i, numbers.get(n - i));
            numbers.set(n - i, temp);
        }
    }

    private static void print() {
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
