package com.company.Lab5.Task3;



public class B extends A {
    protected String b;

    B(){
    this("B");
    }
    B(String b) {
        this.b = b;
        System.out.println(this.b);
    }
}
