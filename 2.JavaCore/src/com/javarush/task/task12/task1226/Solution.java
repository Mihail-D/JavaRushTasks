package com.javarush.task.task12.task1226;

public class Solution {

    public static void main(String[] args) {
    }

    public interface CanFly {
        default void fly() {
        }
    }

    public interface CanClimb {
        default void climb() {
        }
    }

    public interface CanRun {
        default void run() {
        }
    }

    public class Cat implements CanClimb, CanRun{
    }

    public class Dog implements CanRun{
    }

    public class Tiger extends Cat {
    }

    public class Duck implements CanRun, CanFly {
    }
}
