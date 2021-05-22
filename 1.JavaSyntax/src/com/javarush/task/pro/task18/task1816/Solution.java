package com.javarush.task.pro.task18.task1816;

import java.util.stream.Stream;

public class Solution {

    public static void main(String[] args) {
        Stream<String> stream = Stream.of("Не", "волнуйтесь", "если", "что-то", "не", "работает.", "Если", "бы", "всё", "работало", "вас", "бы", "уволили.");

        toUpperCase(stream).forEach(System.out::println);
    }

    public static Stream<String> toUpperCase(Stream<String> strings) {
        Stream<String> strng = strings.map(String::toUpperCase);
        return strng;
    }
}
