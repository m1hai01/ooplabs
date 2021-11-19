package com.company.Lab8.Task1;

public class Sphere extends GeometricBody {

    double radius ;
    double surface ;
    double volume;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void getSurface(){

        surface =  4 * Math.PI * (radius * radius);
    }

    public void getVolume(){
        volume = (4 * Math.PI * (radius*radius*radius))/3;

    }


}
