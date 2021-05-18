package com.javarush.task.pro.task16.task1605;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Solution {

    public static final String INVENTED = "Пожалуйста, можете забрать ваш карманный телепорт. Спасибо за ожидание!";
    public static final String NOT_INVENTED = "Извините, телепорт еще не изобрели, приходите через 10 лет.";

    public static final Calendar INVENTION_DAY = new GregorianCalendar(2192, Calendar.JUNE, 12);

    public static void main(String[] args) {
        Calendar currentDay = Calendar.getInstance();

        for (int i = 0; ; i++) {
            if (isTeleportInvented(currentDay) == false) {
                currentDay.roll(Calendar.YEAR, 10);
            }
            else {
                break;
            }
        }
    }

    static boolean isTeleportInvented(Calendar currentDay) {
        boolean bool = false;
        if (INVENTION_DAY.before(currentDay)) {
            System.out.println(INVENTED);
            bool = true;
        }
        else {
            System.out.println(NOT_INVENTED);
        }

        return bool;
    }
}
