package com.company.Lab5.Task3;



public class A {

   protected String a;
   // declaram  pointer x de tip X
   protected X x = new X("xxx");




   A(){

      this("A","X");
   }

   A(String a, String x) {

      this.a = a;
      System.out.println(this.a);
      //Noi pointerului x de tip X  ii aratam  unde se afla  obiectul nou creat de tip clasa X in memorie




   }

}
