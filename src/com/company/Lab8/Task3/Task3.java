package com.company.Lab8.Task3;

import com.company.Lab8.Task2.Cub;
import com.company.Lab8.Task2.GeometricBody;
import com.company.Lab8.Task2.GeometricBodyController;
import com.company.Lab8.Task2.Parallelepiped;
import com.company.Lab8.Task2.Sphere;

public class Task3 {

    public static void main(String[] args) {

        com.company.Lab8.Task2.Cub c1 = new Cub();
        com.company.Lab8.Task2.Sphere s1 = new Sphere();
        com.company.Lab8.Task2.Parallelepiped p1 = new Parallelepiped();

        c1.setSide(7);

        s1.setRadius(5);

        p1.setHeight(4);
        p1.setLength(6);
        p1.setWidth(3);

        GeometricBody[] geometricBodies = {s1, s1, p1};

        com.company.Lab8.Task2.GeometricBodyController g1 = new GeometricBodyController();
        g1.checkBiggestSurface(geometricBodies);
        g1.checkBiggestVolume(geometricBodies);

    }
}
