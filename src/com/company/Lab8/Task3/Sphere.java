package com.company.Lab8.Task3;

public class Sphere implements GeometricBody {

    double radius ;
    double surface ;
    double volume;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getSurface(){

        surface =  4 * Math.PI * (radius * radius);

        return  surface;
    }

    public double getVolume(){
        volume = (4 * Math.PI * (radius*radius*radius))/3;

        return  volume;

    }


}
