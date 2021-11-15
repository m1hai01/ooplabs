package com.company.Lab7.Task2;


import java.util.ArrayList;

public class Task2 {
    public static void main(String[] args) {

        Square s1 = new Square();
        Rectangle r1 = new Rectangle();
        Triangle t1 = new Triangle();

        s1.setSide(4);
        r1.setLength(2);
        r1.setWidth(3);
        t1.setSide1(5);
        t1.setSide2(7);
        t1.setSide3(6);

        Figure[] figures = {s1, r1, t1};


        FigureController f1 = new FigureController();
        f1.checkBiggestArea(figures);
        f1.checkBiggestParametr(figures);





    }
}
