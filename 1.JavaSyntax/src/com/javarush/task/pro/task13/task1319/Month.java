package com.javarush.task.pro.task13.task1319;

public enum Month {
    JANUARY,
    FEBRUARY,
    MARCH,
    APRIL,
    MAY,
    JUNE,
    JULY,
    AUGUST,
    SEPTEMBER,
    OCTOBER,
    NOVEMBER,
    DECEMBER;

    public static Month[] getWinterMonths() {
        Month[] arr = {Month.DECEMBER, Month.JANUARY, Month.FEBRUARY};
        return arr;
    }

    public static Month[] getSpringMonths() {
        Month[] arr = {Month.MARCH, Month.APRIL, Month.MAY};
        return arr;
    }

    public static Month[] getSummerMonths() {
        Month[] arr = {Month.JUNE, Month.JULY, Month.AUGUST};
        return arr;
    }

    public static Month[] getAutumnMonths() {
        Month[] arr = {Month.SEPTEMBER, Month.OCTOBER, Month.NOVEMBER};
        return arr;
    }
}
