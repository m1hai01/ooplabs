package com.company.Lab1.Task2;

public class Task2 {
    public static void main(String[] args) {
        Student student1 = new Student("Viorel" , 20 ,10 );
        Student student2 = new Student("Marcel" , 20 ,10 );
        Student student3 = new Student("Mihai" , 20 ,8 );

        University university1 = new University("UTM" , 1964);

        university1.studentsList = new Student[3];

        university1.studentsList[0] = student1;
        university1.studentsList[1] = student2;
        university1.studentsList[2] = student3;
    }
}
