package com.Zenco;
//can be improved by removing the internal for loop and instead use substrings
public class LargestDigits {
    public int solve(final String digits) {
        char[] arr = digits.toCharArray();
        String strTest = "";
        int largest = 0;


        for(int i = 0; i < arr.length - 4; i++){//tests five digit numbers
            for(int j = 0; j < 5; j++){ //generates new five digit number
                strTest = strTest + arr[i + j];
            }

            if(Integer.parseInt(strTest) > largest)//tests the generated number against the current highest one
                largest = Integer.parseInt(strTest);

            strTest = "";//resets the variable so it could be used again in the next loop iteration

        }
        System.out.println(largest);
        return largest; // you code here
    }

}
