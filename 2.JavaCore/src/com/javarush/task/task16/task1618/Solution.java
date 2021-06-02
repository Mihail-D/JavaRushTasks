package com.javarush.task.task16.task1618;


public class Solution {
    public static void main(String[] args) throws InterruptedException {
        TestThread ts = new TestThread();
        ts.start();
        ts.interrupt();
    }

    //Add your code below - добавь код ниже
    public static class TestThread extends Thread{
        public void run(){

        }
    }
}