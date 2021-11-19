package com.company.Lab8.Task3;


public class GeometricBodyController {

    double max1 = 0;
    double max2 = 0;

    public double checkBiggestVolume(GeometricBody[] geometricBodies) {
        for (GeometricBody temp : geometricBodies) {
            if (temp.getVolume() > max1)
                max1 = temp.getVolume();

        }
        System.out.println(max1);
        return max1;


    }

    public double checkBiggestSurface(GeometricBody[] geometricBodies) {
        for (GeometricBody temp : geometricBodies) {
            if (temp.getSurface() > max2)
                max2 = temp.getSurface();

        }
        System.out.println(max2);
        return max2;

    }

}
