package com.javarush.task.pro.task12.task1212;

/* 
Создаем свой список
*/

public class CustomStringArrayList {

    private int size;
    private int capacity;
    private String[] elements;

    public CustomStringArrayList() {
        capacity = 10;
        size = 0;
        elements = new String[capacity];
    }

    public void add(String element) {
        if (size == capacity) {
            grow();
        }
        elements[size] = element;
        size++;
    }

    private void grow() {

        capacity = (int) (capacity *  1.5);
        String[] newArr = new String[capacity];
        for (int i = 0; i < elements.length; i++) {
            newArr[i] = elements[i];
        }
    elements = newArr;
    }
}
