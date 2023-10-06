package ru.mirea.it.ivt;

import java.util.Scanner;

public class Main {

    public static void Exercise1(){
        Shape shape = new Square(2,4);
        System.out.println(shape.toString());
        shape = new Circle(3);
        System.out.println(shape.toString());
        shape = new Rectangle(3,4,5);
        System.out.println(shape.toString());
    }

    public static void Exercise2(){
        Person person1 = new Person();
        Person person2 = new Person("Maria", 19);
        System.out.println(person1.toString() + "\n" + person2.toString());
    }

    public static void main(String[] args) {
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