package com.company.Lab7.Task3;



public class Square extends Figure {

    private double side ;
    private double area = 0;
    private double perimeter = 0;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getArea(){

        area = side *  side;

        return  area;
        

    }

    public double getPerimeter(){
        perimeter = side * 4;

        return perimeter;

    }

    @Override
    public void setValues(double[] value) {
        this.side = value[0];

    }
}
