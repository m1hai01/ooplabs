package com.company.Lab3.Task3;

public class TextManipulation3 {

    String fullText;
    int count = 0;
    static String maxWord = "";


    TextManipulation3(String fT) {
        fullText = fT;

    }

    public void LongestWordLength() {
        String word = "",  large="";
        String[] words = new String[100];
        int length = 0;

        //Add extra space after string to get the last word in the given string
        fullText = fullText + " ";

        for(int i = 0; i < fullText.length(); i++){
            //Split the string into words
            if(fullText.charAt(i) != ' '){
                word = word + fullText.charAt(i);
            }
            else{
                //Add word to array words
                words[length] = word;
                //Increment length
                length++;
                //Make word an empty string
                word = "";
            }
        }
        //Initialize large with first word in the string
        large = words[0];

        //Determine  largest word in the string
        for(int k = 0; k < length; k++){


            //If length of large is less than any word present in the string
            //Store value of word into large
            if(large.length() < words[k].length())
                large = words[k];
        }

        System.out.println("Largest word: " + large);
    }


}

