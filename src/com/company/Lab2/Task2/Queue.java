package com.company.Lab2.Task2;

public class Queue {
    Stack s1 = new Stack();
    Stack s2 = new Stack();

    int count; //cate elemente amm in queue
    int queuelimit;
    int front;

    Queue(){

        count = 0;
        queuelimit = Integer.MAX_VALUE;
    }

    Queue(int _x){


          count = 0;
          queuelimit = _x;
    }


    public void push(int value) {

        if(s1.isEmpty())
            front = value;

        // verificam daca queue ajunge la limita
        if(count == queuelimit){
            System.out.println("You have reached the limit");

        }
        else
            s1.push(value);
            count++;

    }


    public void pop() {
        if (count == 0) {
            System.out.println("You have reached the limit");
            System.exit(0);
        }


            if (s2.isEmpty()) {
                while (!s1.isEmpty() ) {
                    s2.push(s1.pop());

                }
            }
                s2.pop();

        count--;


    }

    public int peek(){

        if(s1.isEmpty())
            return s2.peek();
        else
            return front;
    }
}