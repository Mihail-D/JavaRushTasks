package com.javarush.task.task12.task1225;

/* 
Посетители
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(getObjectType(new Cat()));
        System.out.println(getObjectType(new Tiger()));
        System.out.println(getObjectType(new Lion()));
        System.out.println(getObjectType(new Bull()));
        System.out.println(getObjectType(new Cow()));
        System.out.println(getObjectType(new Animal()));
    }

    public static String getObjectType(Object o) {
        // «Кот», «Тигр», «Лев», «Бык», «Корова», «Животное».
        String s = "Животное";

        if (o.getClass().equals(Cat.class) ) {
            s = "Кот";
        }
        if (o.getClass().equals(Tiger.class) ) {
            s = "Тигр";
        }
        if (o.getClass().equals(Lion.class) ) {
            s = "Лев";
        }
        if (o.getClass().equals(Bull.class) ) {
            s = "Бык";
        }
        if (o.getClass().equals(Cow.class) ) {
            s = "Корова";
        }

        return s;
    }

    public static class Cat extends Animal {
    }

    public static class Tiger extends Cat {
    }

    public static class Lion extends Cat {
    }

    public static class Bull extends Animal {
    }

    public static class Cow extends Animal {
    }

    public static class Animal {
    }
}
