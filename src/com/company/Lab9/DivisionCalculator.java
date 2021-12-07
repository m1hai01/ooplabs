package com.company.Lab9;

import  javax.swing.*;
import java.awt.*;
import java.awt.event.*;



 class Myframe extends JFrame implements ActionListener{
    private Container c;
    private JLabel label1,label2;
    private JTextField t1,t2;
    private JButton div;
    private JLabel result;
    private JLabel error;

    Myframe(){
        setTitle("Division Calculator");
        setSize(300,300);
        setLocation(100,100);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        c = getContentPane();
        c.setLayout(null);

        label1 = new JLabel ("First Number : ");
        label1.setBounds(10,20,100,20);
        c.add(label1);

        t1 = new JTextField();
        t1.setBounds(120,20,100,20);
        c.add(t1);


        label2 = new JLabel ("Second Number : ");
        label2.setBounds(10,50,100,20);
        c.add(label2);

        t2 = new JTextField();
        t2.setBounds(120,50,100,20);
        c.add(t2);


        div = new JButton("/");
        div.setBounds(10,80,70,30);
        c.add(div);


        result = new JLabel("Result :");
        result.setBounds(10,120,150,20);
        c.add(result);

        error = new JLabel();
        error.setBounds(10,140,170,20);
        c.add(error);



        div.addActionListener(this);

        setVisible(true);


    }


    public void actionPerformed(ActionEvent e) {

        try {
            if (e.getSource() == div) {
                double a = Integer.parseInt(t1.getText());
                double b = Integer.parseInt(t2.getText());
                double c = a / b;
                result.setText("Result :" + c);

                if(b == 13.0)
                {
                   throw new UnluckyException();

                }
            }



        }

    catch(NumberFormatException e1) {
           error.setText("Please input numbers only");
         }

    catch(UnluckyException e2){
            error.setText("Unlucky number");
    }


     }

}
