package com.company.Lab2.Task2;

public class Task2 {
    public static void main(String[] args) {

        Queue q1 = new Queue();
        Queue q2 = new Queue();

        q1.push(3);
        q1.push(5);
        q1.push(7);
        q1.pop();
        q1.pop();
        System.out.println(q1.peek());
        q1.pop();



        q2.push(4);
        q2.push(9);
        q2.push(10);
        q2.pop();
        q2.pop();
        System.out.println(q2.peek());
        q2.pop();

    }
}

