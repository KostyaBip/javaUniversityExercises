package ru.mirea.it.ivt;

import java.util.Scanner;

public class Main {

    public static void Exercise1(){
        Gui5_1 Exercise5_1 = new Gui5_1();
        Exercise5_1.setVisible(true);
    }

    public static void Exercise2(){
        Gui5_2 Exercise5_2 = new Gui5_2();
        Exercise5_2.setVisible(true);
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int chooseExecise = 0;
        while(chooseExecise != -1) {
            System.out.println("Enter number of exercise from 1 to 2 or -1 to exit");

            try {
                chooseExecise = scan.nextInt();
            } catch (java.util.InputMismatchException ex) {
                System.out.println("Wrong input, entered line is not a number");
                scan.nextLine();
                continue;
            }

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