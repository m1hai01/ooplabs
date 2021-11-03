package com.company.Lab5.Task2;

public class D extends C {
    protected String d;

    D(){
        this("D");
    }
    D(String d) {
        this.d = d;
        System.out.println(this.d);
    }
}
