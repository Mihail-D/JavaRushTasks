package com.javarush.task.task14.task1408;

public class Solution {
    public static void main(String[] args) {
        Hen hen = HenFactory.getHen(Country.BELARUS);
        hen.getCountOfEggsPerMonth();
        hen.getDescription();
    }

    static class HenFactory {

        static Hen getHen(String country) {
            Hen hen = null;

            if (country.equals("Belarus")) {
                hen = new BelarusianHen();
            }
            if (country.equals("Moldova")) {
                hen = new MoldovanHen();
            }
            if (country.equals("Ukraine")) {
                hen = new UkrainianHen();
            }
            if (country.equals("Russia")) {
                hen = new RussianHen();
            }
            return hen;
        }
    }


}
