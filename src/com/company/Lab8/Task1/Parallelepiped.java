package com.company.Lab8.Task1;

public class Parallelepiped extends GeometricBody {

    double length;
    double width;
    double height;
    double surface;
    double volume;

    public double getLength()  {
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

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void getSurface (){

        surface = 2 * ((length * height) + (width * height) + (length * width));

    }

    public void getVolume() {
        volume = length * width * height;

    }
}
