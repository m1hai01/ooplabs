package com.company.Lab7.Task1;

public class Square extends Figure{

    double side ;
    double area = 0;
    double perimeter = 0;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public void getArea(){

        area = side *  side;

    }

    public void getPerimeter(){
        perimeter = side * 4;

    }
}
