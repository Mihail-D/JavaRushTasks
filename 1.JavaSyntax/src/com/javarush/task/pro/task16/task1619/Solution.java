package com.javarush.task.pro.task16.task1619;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Solution {

    static LocalDateTime localDateTime = LocalDateTime.now();

    public static void main(String[] args) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyyг. Hч.mмин");
        String text = dtf.format(localDateTime);
        System.out.println(text);
    }
}

// В методе main выведи на экран переменную localDateTime в таком виде: 19.03.2020г. 5ч.4мин
//                                                                      15.05.2021г. 22ч.24мин