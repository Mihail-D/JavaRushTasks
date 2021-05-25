package com.javarush.task.task12.task1224;

/* 
Неведома зверушка
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(getObjectType(new Cat()));
        System.out.println(getObjectType(new Tiger()));
        System.out.println(getObjectType(new Lion()));
        System.out.println(getObjectType(new Bull()));
        System.out.println(getObjectType(new Pig()));
    }

    public static String getObjectType(Object o) {
        String title = "Животное";

        if (o instanceof Cat) {
            title = "Кот";
        }
        if (o instanceof Tiger) {
            title = "Тигр";
        }
        if (o instanceof Lion) {
            title = "Лев";
        }
        if (o instanceof Bull) {
            title = "Бык";
        }

        return title;
    }

    public static class Cat {
    }

    public static class Tiger {
    }

    public static class Lion {
    }

    public static class Bull {
    }

    public static class Pig {
    }
}
