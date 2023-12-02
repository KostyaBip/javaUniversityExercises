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

    public static void Exercise1(){
        genericClassOne<String, Integer, Boolean> obj = new genericClassOne<>("Hello", 123, true);
        System.out.println(obj);
    }

    public static void Exercise2(){
        Integer[] array = {3,7,5,4,3,9,2};
        MinMax<Integer> minMax = new MinMax<>(array);
        System.out.println("Max = " + minMax.findMax());
        System.out.println("Min = " + minMax.findMin());
    }

    public static void main(String[] args) {
        int chooseExecise = 0;
        while(chooseExecise != -1) {
            System.out.println("Enter number of exercise from 1 to 2 or -1 to exit");

            chooseExecise = getNum();

            switch (chooseExecise) {
                case (1) -> Exercise1();
                case (2) -> Exercise2();
                case (-1) -> System.out.println("Shutdown");
                default -> System.out.println("Wrong input, entered number is not a command");
            }
        }
    }
}