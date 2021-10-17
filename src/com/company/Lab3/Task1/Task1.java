package com.company.Lab3.Task1;

public class Task1 {
    public static void main(String[] args) {
        Text t1 = new Text("Duis maximus erat sit amet justo auctor tempor. Integer at auctor urna. Cras tristique commodo dignissim. ");
        System.out.println("Number of sentences:"  );
         t1.CountSentences();

        System.out.println("Numbers of words:" + t1.CountWords(t1.fullText) );



    }
}
