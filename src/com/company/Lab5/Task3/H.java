package com.company.Lab5.Task3;

public class H extends G {
    protected String h;
    private X x = new X("bbb");

    H(){
        this("H");
    }
    H(String h) {

        this.h = h;
        System.out.println(this.h);
    }
}
