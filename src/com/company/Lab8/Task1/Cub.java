package com.company.Lab8.Task1;

public class Cub extends  GeometricBody{

    double side ;
    double surface ;
    double volume;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public void getSurface(){
        surface = 6 * (side * side);

    }

    public void getVolume(){

        volume = side * side * side;

    }

}
