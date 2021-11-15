package com.company.Lab7.Task3;


import java.lang.reflect.Array;

public class Task3 {
    public static void main(String[] args) {

        Square s1 = new Square();
        Rectangle r1 = new Rectangle();
        Triangle t1 = new Triangle();



        Figure circle = new Figure() {

            double aria;
            double perimeter;
            double radius ;



            @Override
            public double getArea() {

                aria = Math.PI * (radius * radius);

                //System.out.println(aria);
                return aria;

            }

            @Override
            public double getPerimeter() {

                perimeter = 2 * Math.PI * radius;

                //System.out.println(perimeter);
                return perimeter;
            }

            @Override
            public void setValues(double[] value) {
                this.radius = value[0];

            }


        };

        double[] value = {4};

        circle.setValues(value);
        circle.getArea();
        circle.getPerimeter();

        double[] value1 = {3,5,7};

        t1.setValues(value1);

        double[] value2 = {2,6};
        r1.setValues(value2);

        double[] value3 = {9};
        s1.setValues(value3);


        System.out.println(circle.getArea());
        System.out.println(circle.getPerimeter());



        Figure[] figures = {s1, r1, t1, circle};

       FigureController f1 = new FigureController();

       f1.checkBiggestArea(figures);


    }
}


