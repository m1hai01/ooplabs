package com.company.Lab5.Task1;

public class B extends A{
    public String b;

    B(){
    this("B");
    }
    B(String b) {
        super();
        this.b = b;
        System.out.println(this.b);
    }
}
