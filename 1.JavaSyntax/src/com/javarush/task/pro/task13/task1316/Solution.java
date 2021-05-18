package com.javarush.task.pro.task13.task1316;

public class Solution {

    public static void main(String[] args) {
        JavarushQuest [] jr = JavarushQuest.values();

        for (JavarushQuest i : jr) {
            System.out.println(i.ordinal());
        }
    }
}
