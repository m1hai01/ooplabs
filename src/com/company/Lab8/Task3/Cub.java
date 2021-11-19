package com.company.Lab8.Task3;

public class Cub implements GeometricBody {

    double side ;
    double surface ;
    double volume;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getSurface(){
        surface = 6 * (side * side);

        return surface;


    }

    public double getVolume(){

        volume = side * side * side;

        return volume;

    }

}
