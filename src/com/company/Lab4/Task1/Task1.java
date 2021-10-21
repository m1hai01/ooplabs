package com.company.Lab4.Task1;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("src/com/company/Lab4/Task1/one_expression.txt");
        Scanner scanner = new Scanner(file);
        String string = scanner.nextLine();

        System.out.println(string);

        // Function call
        if (Expression.checkString(string))
            System.out.println("Balanced ");
        else
            System.out.println("Not Balanced ");


    }


}
