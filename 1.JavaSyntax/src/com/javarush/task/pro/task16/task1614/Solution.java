package com.javarush.task.pro.task16.task1614;

import java.time.Instant;
import java.time.LocalTime;

public class Solution {

    public static void main(String[] args) {
        System.out.println(getMaxFromMilliseconds());
        System.out.println(getMaxFromSeconds());
        System.out.println(getMaxFromSecondsAndNanos());
    }

    static Instant getMaxFromMilliseconds() {
        Instant maxMillis = Instant.ofEpochMilli(Long.MAX_VALUE);
        return maxMillis;
    }

    static Instant getMaxFromSeconds() {
        Instant maxSeconds = Instant.ofEpochSecond(Instant.MAX.getEpochSecond());
        return maxSeconds;
    }

    static Instant getMaxFromSecondsAndNanos() {
        Instant maxSeconds = Instant.ofEpochSecond(Instant.MAX.getEpochSecond(), 999999999);
        return maxSeconds;
    }
}
