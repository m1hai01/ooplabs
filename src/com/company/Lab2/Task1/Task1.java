package com.company.Lab2.Task1;

public class Task1 {
    public static void main(String[] args) {

        Object1 o1 = new Object1();
        Object1 o2 = new Object1(5,6,7);
        Object1 o3 = new Object1(7);


        System.out.println(o1.height + " " + o1.width + " " + o1.depth);
        System.out.println(o2.height + " " + o2.width + " " + o2.depth);
        System.out.println(o3.height + " " + o3.width + " " + o3.depth);

    }

}
