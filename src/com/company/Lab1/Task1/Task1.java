package com.company.Lab1.Task1;

public class Task1 {
    public static void main(String[] args) {
        Monitor Samsung = new Monitor();
        Samsung.colorMonitor = "black";
        Samsung.dimensionsMonitor = "24 inch";
        Samsung.resolutionMonitor = "FullHD";

        Monitor Asus = new Monitor();
        Asus.colorMonitor = "white";
        Asus.dimensionsMonitor = "27 inch";
        Asus.resolutionMonitor = "2K";

        System.out.println("Samsung Monitor color is " + Samsung.colorMonitor + ", Asus Monitor  is " + Asus.colorMonitor);
        System.out.println("Samsung Monitor dimensions is " + Samsung.dimensionsMonitor + ", Asus Monitor is " + Asus.dimensionsMonitor);
        System.out.println("Samsung Monitor resolution is " + Samsung.resolutionMonitor + ", Asus Monitor is " + Asus.resolutionMonitor);

    }
}
