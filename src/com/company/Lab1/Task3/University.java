package com.company.Lab1.Task3;

public class University {
    String nameUniversity;
    int    foundationYear;
    Student[] studentsList;
    double med;

    University(String nU , int fY ){
        nameUniversity = nU;
        foundationYear = fY;

    }

    public  void Media () {
        int i ;
        for (i = 0;i<3;i++)

            med =  studentsList[i].markStudent + med;

        med = med/ i;
    }
}
