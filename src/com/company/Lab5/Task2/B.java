package com.company.Lab5.Task2;

public class B extends A {
    protected String b;

    B(){
    this("B");
    }
    B(String b) {
        super();
        this.b = b;
        System.out.println(this.b);
    }
}
