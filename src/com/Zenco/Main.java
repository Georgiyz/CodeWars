package com.Zenco;

public class Main {

    public static void main(String[] args) {
        testWordSpin();
    }

    private static void testNseries() {
        NthSeries nSeries = new NthSeries();
        String[] testSet = {"70", "90", "5", "88", "12", "47", "2", "11", "11", "62", "94", "76", "92", "8", "42",
                "85", "96", "34", "61", "53", "82", "32"};
        String result = "";

        //Section for testing incrementing numbers
        for(int i = 0; i <= 4; i++){
            result = nSeries.seriesSum(i);
            System.out.println(result);
        }

        //Section for testing an array of test values
    }

    private static void testWordSpin(){
        WordSpin test = new WordSpin();
        String review ="";
        review=test.spinWords("I am cat four lives mined juicy heartily");
        System.out.println(review);
    }

}
