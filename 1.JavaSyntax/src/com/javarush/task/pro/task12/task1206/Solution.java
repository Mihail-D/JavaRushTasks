package com.javarush.task.pro.task12.task1206;

/*
Анализ строк
*/

public class Solution {
    public static void main(String[] args) {
        String string = "Думаю, это будет новой фичей." +
                "Только не говорите никому, что она возникла случайно.";

        System.out.println("Количество цифр в строке : " + countDigits(string));
        System.out.println("Количество букв в строке : " + countLetters(string));
        System.out.println("Количество пробелов в строке : " + countSpaces(string));
    }

    public static int countDigits(String string) {
        long countDigits = string.chars()
                .filter(Character::isDigit)
                .count();

        return (int) countDigits;
    }

    public static int countLetters(String string) {
        long countLetters = string.chars()
                .filter(Character::isLetter)
                .count();

        return (int) countLetters;
    }

    public static int countSpaces(String string) {
        long countSpaces = string.chars()
                .filter(Character::isSpaceChar)
                .count();

        return (int) countSpaces;
    }
}
