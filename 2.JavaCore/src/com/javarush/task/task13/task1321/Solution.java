package com.javarush.task.task13.task1321;

public class Solution {

    public static void main(String[] args) {
        System.out.println(Dream.HOBBY.toString());
        new Hobby();
        System.out.println(Hobby.INDEX);
    }

    interface Desire {
    }

    interface Dream {
        Hobby HOBBY = new Hobby();
    }

    static class Hobby implements Desire, Dream {
        static int INDEX = 1;

        @Override
        public String toString() {
            INDEX++;
            return "" + INDEX;
        }
    }

}
