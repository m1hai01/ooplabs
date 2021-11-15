package com.company.Lab7.Task1;

public class Triangle extends Figure{

    double side1 ;
    double side2 ;
    double side3 ;
    double s;
    double x;

    double area = 0;
    double perimeter = 0;

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    @Override
    public void getArea(){
        double s = (side1 + side2 + side3)/2;
        double x = ((s) * (s-side1) * (s-side2) * (s-side3));
        double area = Math.sqrt(x);

    }

    public void getPerimeter(){

        perimeter = side1 + side2 + side3;

    }
}
