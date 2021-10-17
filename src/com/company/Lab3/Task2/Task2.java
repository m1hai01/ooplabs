package com.company.Lab3.Task2;

import com.company.Lab3.Task1.Text;

public class Task2 {
    public static void main(String[] args) {

        TextManipulation t1 = new TextManipulation("Viorel se duce la odih. Kim face laba.");


        System.out.println("Numbers of letters:");
        t1.CountLettres();

        t1.CountVowelConsonant();
    }
}
