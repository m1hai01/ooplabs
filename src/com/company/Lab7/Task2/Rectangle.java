package com.company.Lab7.Task2;

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
    public double getArea(){
        area = length * width;

        return  area;

    }

    public double getPerimeter(){

        perimeter = 2 * (length + width);

        return  perimeter;

    }


}
