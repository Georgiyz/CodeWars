package com.Zenco;

import java.util.Arrays;
//Was not completed well enough. Only passed 1/2 of the tests. Works on the basic test set however.
public class Lexicographical {
    public String[] inArray(String[] array1, String[] array2) {
        String[] store = new String[array1.length];//array1.length is max length of array
        int index = 0;

        //finds the substrings and stores them
        for(int i=0; i <= array1.length - 1; i++){//loop addressing array 2
            for(int j=0; j <= array2.length - 1; j++){//loop comparing entries of array 1 to the selected element of array 2
                if(array2[j].contains(array1[i])){
                    store[index] = array1[i];
                    index++;
                    //array1[j]="";
                    break;
                }
            }
        }

        //finds the number of non-null values
        index = 0;
        for(int i = 0; i <= store.length - 1; i++){
            if(store[i] != null){
                index++;
            }
        }

        //inserts the non-null values into the returned array
        String[] ret = new String[index];
        ret = Arrays.copyOfRange(store, 0, index);

        return ret;
    }

}
