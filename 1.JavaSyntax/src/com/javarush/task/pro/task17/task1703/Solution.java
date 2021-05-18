package com.javarush.task.pro.task17.task1703;

import java.util.ArrayList;

public class Solution {
    public static ArrayList<Astronaut> astronauts = new ArrayList<>();

    public static void main(String[] args) {
        createCrew();
        printCrewInfo();
    }

    public static void createCrew(){
        Astronaut hum1 = new Human();
        Astronaut hum2 = new Human();
        Astronaut dog = new Dog();
        Astronaut cat = new Cat();
        astronauts.add(hum1);
        astronauts.add(hum2);
        astronauts.add(dog);
        astronauts.add(cat);
    }

    public static void printCrewInfo() {
        System.out.println("На борт погружены члены экипажа: ");
        for (Astronaut astronaut : astronauts) {
            System.out.println(astronaut.getInfo());
        }
    }
}
