package com.javarush.task.task24.task2401;

/* 
Создание своего интерфейса-маркера
*/

public class Solution {
    public static void main(String[] args) throws UnsupportedInterfaceMarkerException, com.javarush.task.task24.task2401.UnsupportedInterfaceMarkerException {
        SelfInterfaceMarkerImpl obj = new SelfInterfaceMarkerImpl();
        Util.testClass((SelfInterfaceMarker) obj);
    }

    private static class UnsupportedInterfaceMarkerException extends Exception {
    }
}
