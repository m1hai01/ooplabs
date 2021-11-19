package com.company.Lab8.Task3;

public class Parallelepiped implements GeometricBody {

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

    public double getSurface (){

        surface = 2 * ((length * height) + (width * height) + (length * width));

        return surface;
    }

    public double getVolume() {
        volume = length * width * height;

        return  volume;

    }
}
