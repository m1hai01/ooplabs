package com.company.Lab8.Task2;



public class Task2 {
    public static void main(String[] args) {

        Cub c1 = new Cub();
        Sphere s1 = new Sphere();
        Parallelepiped p1 = new Parallelepiped();

        c1.setSide(7);

        s1.setRadius(5);

        p1.setHeight(4);
        p1.setLength(6);
        p1.setWidth(3);

        GeometricBody[] geometricBodies = {s1, s1, p1};

        GeometricBodyController g1 = new GeometricBodyController();
        g1.checkBiggestSurface(geometricBodies);
        g1.checkBiggestVolume(geometricBodies);

    }
}
