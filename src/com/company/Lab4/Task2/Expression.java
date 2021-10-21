package com.company.Lab4.Task2;


import java.util.Stack;

public class Expression {




    public static boolean checkString(String Expression) {


        // Using ArrayDeque is faster than using Stack class
          Stack<Character>  s2 = new Stack();
    // Traversing the Expression
        for (int i = 0; i < Expression.length(); i++)
    {
        char x = Expression.charAt(i);


        if (x == '(' )
        {
            // Push the element in the stack
            s2.push(x);
            continue;
        }

    }

        for (int i = 0; i < Expression.length(); i++) {
            if(Expression.charAt(i)== ')' ){
                if(s2.isEmpty()){
                    return false;
                }

                s2.pop();
                continue;



            }



        }

        if (s2.isEmpty())
            return true;
        else
            return false;

    }

}
