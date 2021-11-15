package com.company.Lab7.Task3;



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

    @Override
    public void setValues(double[] value) {
        this.length = value[0];
        this.width = value[1];


    }


}
