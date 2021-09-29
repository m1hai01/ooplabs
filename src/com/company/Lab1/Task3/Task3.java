package com.company.Lab1.Task3;

public class Task3 {
    public static void main(String[] args) {
        Student student1 = new Student("Viorel" , 20 ,10 );
        Student student2 = new Student("Marcel" , 20 ,10 );
        Student student3 = new Student("Mihai" , 20 ,8 );

        Student student4 = new Student("Jessica" , 22 ,5 );
        Student student5 = new Student("Eva" , 21 ,7 );
        Student student6 = new Student("Lana" , 19 ,8 );

        Student student7 = new Student("Vasile" , 19 ,9 );
        Student student8 = new Student("Afanasie" , 23 ,8 );
        Student student9 = new Student("Veronica" , 20 ,7 );




        University university1 = new University("UTM" , 1964);

        university1.studentsList = new Student[3];

        university1.studentsList[0] = student1;
        university1.studentsList[1] = student2;
        university1.studentsList[2] = student3;




        University university2 = new University("ASEM" , 1974);

        university2.studentsList = new Student[3];

        university2.studentsList[0] = student4;
        university2.studentsList[1] = student5;
        university2.studentsList[2] = student6;


        University university3 = new University("USM" , 1969);

        university3.studentsList = new Student[3];

        university3.studentsList[0] = student7;
        university3.studentsList[1] = student8;
        university3.studentsList[2] = student9;

        university1.Media();
        university2.Media();
        university3.Media();



        System.out.println("Media aritmetica la toate universitatile este " +  (university1.med + university2.med + university3.med)/3 );

    }
}
