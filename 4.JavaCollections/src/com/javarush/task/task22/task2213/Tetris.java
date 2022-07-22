package com.javarush.task.task22.task2213;

public class Tetris {
    private Field field;
    private Figure figure;
    public static Tetris game;

    public Field getField() {
        return field;
    }

    public static void run(){}
    public void step(){}

    public Figure getFigure() {
        return figure;
    }
    public static void main(String[] args) {
           Tetris game = new Tetris();
           run();
        }
}
