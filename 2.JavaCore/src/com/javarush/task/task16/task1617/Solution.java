package com.javarush.task.task16.task1617;

/* 
Отсчет на гонках
*/

public class Solution {
    public static volatile int numSeconds = 3;

    public static void main(String[] args) throws InterruptedException {
        RacingClock clock = new RacingClock();
        Thread.sleep(3500);
        clock.interrupt();
    }

    public static class RacingClock extends Thread {
        public RacingClock() {
            start();
        }

        public void run() {
            /*int mills = 0;

            for (int i = numSeconds + 1; i > 1; i--) {
                System.out.println(i - 1);
                try {
                    Thread.sleep(1000);
                    mills += 1000;
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            if (mills >= 3500) {
                System.out.println("Прервано!");
            }
            else {
                System.out.println("Марш!");
            }*/
            try {
                while (!isInterrupted() && numSeconds >= 0) {
                    if (numSeconds == 0) {
                        System.out.println("Марш!");
                    } else {
                        System.out.print(numSeconds + " ");
                        Thread.sleep(1000);
                    }
                    numSeconds--;
                }
            } catch (InterruptedException e) {
                if (numSeconds != -1) {
                    System.out.println("Прервано!");
                }
            }
        }
    }
}
