package com.javarush.task.task24.task2401;

public class UnsupportedInterfaceMarkerException extends Throwable {
    public static void main(String[] args) throws UnsupportedInterfaceMarkerException {
        SelfInterfaceMarkerImpl obj = new SelfInterfaceMarkerImpl();
        Util.testClass(obj);
    }

}
