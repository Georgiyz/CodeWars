package com.Zenco;
//import java.util.ArrayList;
public class NthSeries {

    public String seriesSum(int n) {
        double div = 1;
        double num = 0; //stores the fraction
        double sum = 0; //stores the sum of fractions
        //ArrayList<String> results = new ArrayList<String>();
        String ret = ""; //return variable containing the sum of fraction strings

        //Accounts for case n=0
        if(n==0){
            ret = "0.00";
        }
        else {
            //Calculates the numbers as doubles
            for (int i = 0; i < n; i++) {
                num = 1 / div;
                div = div + 3;
                sum = sum + num;
            }

            //Rounding to 2 dp
            sum = Math.round(sum * 100);
            sum = sum / 100;

            //Convert to string
            ret = Double.toString(sum);
        }
        return ret;
    }
}