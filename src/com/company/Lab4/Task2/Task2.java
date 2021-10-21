package com.company.Lab4.Task2;


import com.sun.source.tree.WhileLoopTree;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("src/com/company/Lab4/Task2/three_expressions.txt");
        Scanner scanner = new Scanner(file);

        while(scanner.hasNextLine()){

            String string = scanner.nextLine();

            // Function call
            if (Expression.checkString(string))
                System.out.println("Balanced ");
            else
                System.out.println("Not Balanced ");


        }

        }

}
