package com.company.Lab3.Task2;

public class TextManipulation {

        String fullText;
        int count = 0;


        TextManipulation(String fT){
            fullText=fT;

        }

    public void CountLettres() {
        int lettercount = 0;

        for (int i = 0; i < fullText.length(); i++) {
            if (fullText.charAt(i) >='A'&& fullText.charAt(i) <='Z' || fullText.charAt(i) >='a' && fullText.charAt(i) <='z')
                lettercount++;


        }

        System.out.println(lettercount);
    }

    public void CountVowelConsonant(){
        int vCount = 0, cCount = 0;

        fullText = fullText.toLowerCase();

        for(int i = 0; i < fullText.length(); i++) {
            //Checks whether a character is a vowel
            if(fullText.charAt(i) == 'a' || fullText.charAt(i) == 'e' || fullText.charAt(i) == 'i' || fullText.charAt(i) == 'o' || fullText.charAt(i) == 'u') {
                //Increments the vowel counter
                vCount++;
            }
            //Checks whether a character is a consonant
            else if(fullText.charAt(i) >= 'a' && fullText.charAt(i)<='z') {
                //Increments the consonant counter
                cCount++;
            }
        }
        System.out.println("Number of vowels: " + vCount);
        System.out.println("Number of consonants: " + cCount);

    }
}
