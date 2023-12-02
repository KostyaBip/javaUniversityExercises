package ru.mirea.it.ivt;

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
        }
    }

    public static void Exercise1() throws badInnImpressionException {
        Scanner scan = new Scanner(System.in);
        int innNumber = 0;

        System.out.println("Enter inn: ");

        try {
            innNumber = scan.nextInt();
            if(Integer.toString(innNumber).length()!=10){
                throw new IllegalArgumentException("Wrong format");
            }else System.out.println("Inn is: " + innNumber);
        } catch (java.util.InputMismatchException ex) {
            throw new badInnImpressionException("Wrong impression, inn must be a number." + // throw
                    "\nEntered inn : " + scan.nextLine(),ex);
        } catch (IllegalArgumentException ex){
            throw new badInnFormatException("Wrong format, inn must be 10 digit number." +
                    "\nEntered inn:" + innNumber, ex);
        }
    }

    public static void Exercise2(){
        LabClassDriver labClassDriver = new LabClassDriver();
        labClassDriver.testStudents();
    }

    public static void main(String[] args) {
        int chooseExecise = 0;
        while(chooseExecise != -1) {
            System.out.println("Enter number of exercise from 1 to 2 or -1 to exit");

            chooseExecise = getNum();

            switch (chooseExecise) {
                case (1):
                    try {
                        Exercise1();
                    } catch (badInnImpressionException e) {
                        throw new RuntimeException(e);
                    }
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