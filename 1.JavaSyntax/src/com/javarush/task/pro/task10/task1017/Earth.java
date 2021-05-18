package com.javarush.task.pro.task10.task1017;

/* 
Создание материков
*/

public class Earth {
    public static void main(String[] args) {
        Africa afro = new Africa(30_370_000);
        Antarctica antrt = new Antarctica(14_107_000);
        Australia austr = new Australia(7_659_861);
        Eurasia euro = new Eurasia(53_600_000);
        NorthAmerica usa = new NorthAmerica(24_365_000);
        SouthAmerica latino = new SouthAmerica(17_840_000);
    }
}
