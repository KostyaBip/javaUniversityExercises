package ru.mirea.it.ivt;

import java.util.Scanner;

public class Main {
    public static void Exercise1(){
        MovablePoint leftPoint = new MovablePoint(-2,2,1,1);
        MovablePoint rightPoint = new MovablePoint(2,-1,1,1);
        MovableRectangleExtended Rectangle = new MovableRectangleExtended(leftPoint, rightPoint);

        System.out.println(Rectangle);
        System.out.println("Points have " + (Rectangle.SpeedTest() ? "same" : "different") + " speed");
    }

    public static void Exercise2(){
        MathFunc func = new MathFunc();
        System.out.println("Area of circle with radius 2 is: " + func.areaOfCircle(2));
        System.out.println("Length of circle with radius 3 is: " + func.lengthOfCircle(3));
    }

    public static void Exercise3(){
        StringFunctions func = new StringFunctions();
        String string = "";
        System.out.println("Num of char in string is: " + func.numOfCharInString(string));
        System.out.println("String from uneven is: " + func.stringConsistOfUneven(string));
        System.out.println("Reversed string is: " + func.reverseString(string));
    }



    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int chooseExecise = 0;
        while(chooseExecise != -1) {
            System.out.println("Enter number of exercise from 1 to 3 or -1 to exit");

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
                case (3):
                    Exercise3();
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