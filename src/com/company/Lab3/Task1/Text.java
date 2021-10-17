package com.company.Lab3.Task1;

public class Text {
    String fullText;
    int count = 0;


    Text(String fT){
        fullText=fT;

    }

    public void CountSentences(){
        for(int i = 0; i < fullText.length(); i++){

            if(fullText.charAt(i) == '.' || fullText.charAt(i) == '?' || fullText.charAt(i) == '!' ){
                count ++;

            }

        }
        System.out.println(count);

    }

    public int  CountWords(String fullText){
        if (fullText == null || fullText.isEmpty()){
            return 0;
        }

        String[] words = fullText.split("\\s+");


        return words.length;

    }









}
