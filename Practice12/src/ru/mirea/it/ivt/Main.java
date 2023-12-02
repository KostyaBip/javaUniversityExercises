package ru.mirea.it.ivt;

import javax.swing.*;
import java.util.Scanner;

public class Main {

    public static int getNum(){
        Scanner scan = new Scanner(System.in);
        int num;

        try {
            num = scan.nextInt();
            return num;
        } catch (java.util.InputMismatchException ex) {
            System.out.println("Wrong input, entered line is not a number");
            scan.nextLine();
            return getNum();
        } finally {
            System.out.println("Finally");
        }
    }

    public static void Exercise1(){
        JFrame frame = new JFrame("Drawing : ) ");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new Draw());
        frame.setSize(1200, 800);
        frame.setVisible(true);
    }

    public static void Exercise2(){
        JFrame frame = new JFrame("Image Slider");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new ImageSlider());
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {

        int chooseExecise = 0;
        while(chooseExecise != -1) {
            System.out.println("Enter number of exercise from 1 to 2 or -1 to exit");

            chooseExecise = getNum();

            switch (chooseExecise) {
                case (1):
                    Exercise1();
                    break;
                case (2):
                    Exercise2();
                    break;
                case (-1):
                    System.out.println("Shutdown");
                    break;
                default:
                    System.out.println("Wrong input, entered number is not a command");
                    break;
            }
        }
    }
}