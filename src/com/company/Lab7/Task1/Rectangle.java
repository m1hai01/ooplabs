package com.company.Lab7.Task1;

public class Rectangle extends Figure {
    double length ;
    double width;
    double area = 0;
    double perimeter = 0;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public void getArea(){
        area = length * width;

    }

    public void getPerimeter(){

        perimeter = 2 * (length + width);


    }


}
