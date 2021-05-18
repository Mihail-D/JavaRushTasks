package com.javarush.task.pro.task10.task1015;

public class Hedgehog {

    public void eat(Apple apple) {
        System.out.println("Яблоко было съедено!");
    }

    public static void main(String[] args) {
        Apple apple = new Apple();
        Hedgehog hedge = new Hedgehog();
        hedge.eat(apple);
    }

    public static class Apple {
    }
}
