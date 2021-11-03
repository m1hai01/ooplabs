package com.company.Lab5.Task3;

public class C extends B {
    protected String c;

    public C() {
        this("C");
    }

    public C(String c) {
        this.c = c;
        System.out.println(this.c);
    }
}
