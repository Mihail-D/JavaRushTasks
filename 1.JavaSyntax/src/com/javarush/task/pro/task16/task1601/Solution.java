package com.javarush.task.pro.task16.task1601;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Solution {

    static Date birthDate = new Date(71, 3, 19);

    public static void main(String[] args) {
        System.out.println(getDayOfWeek(birthDate));
    }

/*    static String getDayOfWeek(Date date) {
        SimpleDateFormat formatter = new SimpleDateFormat("EEEE", Locale.getDefault());
        String message = formatter.format(date);
        return message;
    }*/

    static String getDayOfWeek(Date date) {
        String result = "";
        int day = date.getDay();
        switch (day) {
            case 0:
                return "воскресенье";
            case 1:
                return "понедельник";
            case 2:
                return "вторник";
            case 3:
                return "среда";
            case 4:
                return "четверг";
            case 5:
                return "пятница";
            case 6:
                return "суббота";
        }
        return result;
    }

}
