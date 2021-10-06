package com.company.Lab2.Task2;


public class Stack {

    class Node {
        int value;
        //fac link la primu nod cu a doilea
        Node next;


        Node(int _value) {
            value = _value;
        }
    }

    Node head; // virful stackului permanent

   public void push (int value) {

       Node n1 = new Node( value );

       //when stack is empty
       if(head == null ) {
           head = n1;
       }
        // when stack is not empty
       else{

            Node temp = head;
            head = n1;
            n1.next = temp; //memoreaza cine se afla de subt


       }


   }

   public int pop(){

      /* if(head != null){

           head = head.next;

       }

       return head.value; */

       Node temp = head;
       head = head.next;
       return temp.value;

   }

   public int  peek(){
       return head.value;
   }

   public boolean isEmpty(){
       if(head == null)
           return true;

           return false;

   }

}


