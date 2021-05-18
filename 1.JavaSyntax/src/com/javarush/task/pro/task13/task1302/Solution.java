package com.javarush.task.pro.task13.task1302;

import java.util.HashSet;

import static java.util.Arrays.asList;

public class Solution {
    public static HashSet<String> words = new HashSet<>(asList("Если бы меня попросили выбрать язык на замену Java я бы не выбирал".split(" ")));

    public static void checkWords(String word) {

        System.out.println((words.contains(word) ? "Слово " + word + " есть" : "Слова " + word + " нет") + " в " +
                "множестве");
    }

    public static void main(String[] args) {
        checkWords("JavaScript");
        checkWords("Java");
    }
}
