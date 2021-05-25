package com.javarush.task.task12.task1216;

public class Solution {
    public static void main(String[] args) {

    }

    public interface CanFly {
        static void takeOff() {
            System.out.println("Take off!");
        }

        static void landing () {
            System.out.println("Has landed!");
        }
    }

}
