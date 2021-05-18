package com.javarush.task.pro.task14.task1415;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class MyStack {

    private final List<String> storage = new ArrayList<>();

    public void push(String s) {
        storage.add(0, s);
    }

    public String pop() {
        return storage.remove(0);
    }

    public String peek() {
        return storage.get(0);
    }

    public boolean empty() {
        return storage.isEmpty();
    }

    public int search(String s) {
        return storage.indexOf(s);
    }
}

/*•	1. Метод push(String) должен добавлять элемент в начало списка storage.
•	2. Метод pop() должен возвращать первый элемент списка storage и удалять его.
•	3. Метод peek() должен возвращать первый элемент списка storage.
•	4. Метод empty() должен проверять, не пустой ли storage.
•	5. Метод search(String) должен найти элемент в storage и вернуть его индекс. Если элемента нет, вернуть -1.
*/