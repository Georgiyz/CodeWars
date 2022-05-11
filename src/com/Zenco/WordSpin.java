package com.Zenco;

public class WordSpin {
    public String spinWords(String sentence) {
        String spun = "";
        String [] words;
        //Split sentence by " "
        words = sentence.split(" ");
        String temp = "";//stores characters in transfer

        //Count characters in each word and reverses characters in long words
        for(int i = 0; i < words.length; i++){
            if(words[i].length()>=5){//checks if word's length is greater than 5
                for(int j=words[i].length() - 1; j >= 0; j--){//iterates through each character
                    temp = temp + words[i].charAt(j);//adds characters to temp in reverse order
                }
                words[i] = temp;//sets the word
                temp = "";//resets the temp variable
            }
        }

        //Concatenate words into a single string
        spun = String.join(" ", words);

        return spun;
    }
}
