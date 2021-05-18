package com.javarush.task.pro.task16.task1617;

import java.time.*;

/* 
Временная глобализация
*/

public class Solution {

    static LocalDateTime localDateTime = LocalDateTime.of(2020, 3, 19, 9, 17);
    static ZoneId zoneId = ZoneId.of("Zulu");
    static ZonedDateTime globalTime;

    public static void main(String[] args) {
        ZonedDateTime zoneTime = ZonedDateTime.now(zoneId);


        globalTime = localDateTime.atZone(zoneId);

        System.out.println(globalTime);
    }
}
// присвой значение переменной globalTime, используя переменные localDateTime и zoneId.