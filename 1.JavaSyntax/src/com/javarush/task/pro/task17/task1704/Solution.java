package com.javarush.task.pro.task17.task1704;

import java.util.ArrayList;

public class Solution {
    public static ArrayList<Astronaut> astronauts = new ArrayList<>();

    public static void main(String[] args) {
        createCrew();
        printCrewInfo();
        runWorkingProcess();
    }

    public static void runWorkingProcess() {
        for (int i = 0; i < astronauts.size(); i++) {
            if (i == 0) {
                Human human1 = (Human) astronauts.get(i);
                pilot(human1);
            }
            if (i == 1) {
                Human human2 = (Human) astronauts.get(i);
                pilot(human2);
            }
            if (i == 2) {
                Dog dog = (Dog) astronauts.get(i);
                createDirection(dog);
            }
            if (i == 3) {
                Cat cat = (Cat) astronauts.get(i);
                research(cat);
            }
        }
    }

    public static void pilot(Human human){
        System.out.println("Член экипажа " + human.getInfo() + " пилотирует корабль.");
    }

    public static void createDirection(Dog dog){
        System.out.println("Член экипажа " + dog.getInfo() + " занимается созданием навигационного маршрута.");
    }

    public static void research(Cat cat){
        System.out.println("Член экипажа " + cat.getInfo() + " исследует ближайшие планеты.");
    }

    public static void createCrew() {
        astronauts.add(new Human());
        astronauts.add(new Human());
        astronauts.add(new Dog());
        astronauts.add(new Cat());
    }

    public static void printCrewInfo() {
        System.out.println("На борт погружены члены экипажа: ");
        for (Astronaut astronaut : astronauts) {
            System.out.println(astronaut.getInfo());
        }
    }
}
