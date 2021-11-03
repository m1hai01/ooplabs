package com.company.Lab5.Task3;

import com.company.Lab5.Task2.X;

public class D extends C {
    protected String d;

    protected com.company.Lab5.Task2.X x = new X("aaa");

    D(){
        this("D");
    }
    D(String d) {
        this.d = d;
        System.out.println(this.d);
    }
}
