package com.company.Lab3.Task2;

import com.company.Lab3.Task1.Text;

public class Task2 {
    public static void main(String[] args) {

        TextManipulation t1 = new TextManipulation("Given a string, we have to find the longest word in the input string and then calculate the number of characters in this word..");


        System.out.println("Numbers of letters:");
        t1.CountLettres();

        t1.CountVowelConsonant();
    }
}
