package com.company.Lab7.Task3;


import java.lang.reflect.Array;

public class Triangle extends Figure {

    double side1 ;
    double side2 ;
    double side3 ;


    double perimeter = 0;



    @Override
    public double getArea(){
        double s = (side1 + side2 + side3)/2;
        double x = ((s) * (s-side1) * (s-side2) * (s-side3));
        double area = Math.sqrt(x);

        return  area;

    }

    public double getPerimeter(){

        perimeter = side1 + side2 + side3;

        return  perimeter;

    }

    @Override
    public void setValues(double[] value) {
        this.side1 = value[0];
        this.side2 = value[1];
        this.side3 = value[2];

    }
}
