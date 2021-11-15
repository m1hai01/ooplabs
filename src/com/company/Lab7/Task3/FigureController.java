package com.company.Lab7.Task3;



public class FigureController {

    double max1 = 0;
    double max2 = 0;

    public double checkBiggestArea(Figure[] figures) {
        for (Figure temp : figures ) {
           if(temp.getArea() > max1)
               max1 = temp.getArea();

        }
        System.out.println(max1);
        return max1;


    }

    public double checkBiggestParametr(Figure[] figures) {
        for (Figure temp : figures ) {
            if(temp.getPerimeter() > max2)
                max2 = temp.getPerimeter();

        }
        System.out.println(max2);
        return max2;


    }

}
