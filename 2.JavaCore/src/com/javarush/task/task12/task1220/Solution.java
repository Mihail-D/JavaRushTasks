package com.javarush.task.task12.task1220;

public class Solution {
    public static void main(String[] args) {

    }

    public abstract class Human implements CanRun, CanSwim {

    }

    public interface CanRun {
        static void someMethod() {
        }
    }

    public interface CanSwim {
        static void someMethod() {
        }
    }
}
