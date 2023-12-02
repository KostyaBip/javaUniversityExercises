package ru.mirea.it.ivt;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Calculator extends JFrame{
    JTextField jta1 = new JTextField(10);
    JTextField jta2 = new JTextField(10);
    JButton buttonAdd = new JButton(" Addition ");
    JButton buttonSub = new JButton(" Subtraction ");
    JButton buttonMultip = new JButton(" Multiplication ");
    JButton buttonDiv = new JButton(" Division ");
    Font fnt = new Font("Times new roman",Font.BOLD,20);
    //начало конструктора класса LabExample
    Calculator(){
        super("Calculator");
        setLayout(new FlowLayout());
        setSize(250,150);
        // создаем надпись 1
        add(new JLabel("1st Number"));
        // добавляем текстовое поле jta1
        add(jta1);
        // создаем надпись 2
        add(new JLabel("2nd Number"));
        // добавляем текстовое поле jta2
        add(jta2);
        // добавляем кнопку
        add(buttonAdd);
        //добавляем слушателя к кнопке
        buttonAdd.addActionListener(new ActionListener(){
            // добавляем реализацию actionPerformed
            public void actionPerformed(ActionEvent e){
                try{
                    //переменная для хранения ввода в текстовое поле 1
                    double x1 = Double.parseDouble(jta1.getText().trim());
                    //переменная для хранения ввода в текстовое поле 2
                    double x2 = Double.parseDouble(jta2.getText().trim());
                    //создаем всплывающее окно INFORMATION_MESSAGE
                    JOptionPane.showMessageDialog(null, "Result = "+(x1+x2),
                            "Alert",JOptionPane.INFORMATION_MESSAGE);
                }catch(Exception ex){
                    //создаем всплывающее окно ERROR_MESSAGE
                    JOptionPane.showMessageDialog( null, "Error in Numbers !",
                            "alert" , JOptionPane.ERROR_MESSAGE);
                }
            }
        });  // конец button.addActionListener()

        add(buttonSub);
        //добавляем слушателя к кнопке
        buttonSub.addActionListener(new ActionListener(){
            // добавляем реализацию actionPerformed
            public void actionPerformed(ActionEvent e){
                try{
                    //переменная для хранения ввода в текстовое поле 1
                    double x1 = Double.parseDouble(jta1.getText().trim());
                    //переменная для хранения ввода в текстовое поле 2
                    double x2 = Double.parseDouble(jta2.getText().trim());
                    //создаем всплывающее окно INFORMATION_MESSAGE
                    JOptionPane.showMessageDialog(null, "Result = "+(x1-x2),
                            "Alert",JOptionPane.INFORMATION_MESSAGE);
                }catch(Exception ex){
                    //создаем всплывающее окно ERROR_MESSAGE
                    JOptionPane.showMessageDialog( null, "Error in Numbers !",
                            "alert" , JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        add(buttonMultip);
        //добавляем слушателя к кнопке
        buttonMultip.addActionListener(new ActionListener(){
            // добавляем реализацию actionPerformed
            public void actionPerformed(ActionEvent e){
                try{
                    //переменная для хранения ввода в текстовое поле 1
                    double x1 = Double.parseDouble(jta1.getText().trim());
                    //переменная для хранения ввода в текстовое поле 2
                    double x2 = Double.parseDouble(jta2.getText().trim());
                    //создаем всплывающее окно INFORMATION_MESSAGE
                    JOptionPane.showMessageDialog(null, "Result = "+(x1*x2),
                            "Alert",JOptionPane.INFORMATION_MESSAGE);
                }catch(Exception ex){
                    //создаем всплывающее окно ERROR_MESSAGE
                    JOptionPane.showMessageDialog( null, "Error in Numbers !",
                            "alert" , JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        add(buttonDiv);
        //добавляем слушателя к кнопке
        buttonDiv.addActionListener(new ActionListener(){
            // добавляем реализацию actionPerformed
            public void actionPerformed(ActionEvent e){
                try{
                    //переменная для хранения ввода в текстовое поле 1
                    double x1 = Double.parseDouble(jta1.getText().trim());
                    //переменная для хранения ввода в текстовое поле 2
                    double x2 = Double.parseDouble(jta2.getText().trim());
                    int res = (int)x1/(int)x2;
                    //создаем всплывающее окно INFORMATION_MESSAGE
                    JOptionPane.showMessageDialog(null, "Result = "+(x1/x2),
                            "Alert",JOptionPane.INFORMATION_MESSAGE);
                }catch(Exception ex){
                    //создаем всплывающее окно ERROR_MESSAGE
                    JOptionPane.showMessageDialog( null, "Error in Numbers !",
                            "alert" , JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        setVisible(true);
    } // конец конструктора
}

