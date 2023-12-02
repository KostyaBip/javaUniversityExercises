package ru.mirea.it.ivt;

import java.util.Objects;
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
        } /*finally {
            System.out.println("ghjk");
        }*/
    }

    public static void exceptionZeroDiv() {
        try{
            System.out.println( 2/0 );
        } catch ( ArithmeticException e ) {
            System.out.println("Attempted division by zero");
        }
    }

    public static void exceptionDemo1() {
        Scanner myScanner = new Scanner( System.in);
        System.out.print( "Enter an integer ");
        String intString = myScanner.next();
        try
        {
            int i = Integer.parseInt(intString);
            System.out.println( 2/i );
        }
        catch (java.lang.NumberFormatException ex){
            System.out.println("Wrong input");
        }
        catch (ArithmeticException zeroDiv){
            System.out.println("Zero division");
        }
    }

    public static void exceptionDemo2() {
        Scanner myScanner = new Scanner( System.in);
        System.out.print( "Enter an integer ");
        String intString = myScanner.next();
        try
        {
            int i = Integer.parseInt(intString);
            System.out.println( 2/i );
        }
        catch (Exception exception){
            System.out.println("General exception caught");
        }
    }

    public static void exceptionDemo3() {
        Scanner myScanner = new Scanner( System.in);
        System.out.print( "Enter an integer ");
        String intString = myScanner.next();
        try
        {
            int i = Integer.parseInt(intString);
            System.out.println( 2/i );
        }
        catch (java.lang.NumberFormatException ex){
            System.out.println("Wrong input");
        }
        catch (ArithmeticException zeroDiv){
            System.out.println("Zero division");
        }
        finally {
            System.out.println("it will be printed anyway");
        }
    }

    public static void printMessage(String key) {
        try {
            String message = getDetails(key);
            System.out.println(message);
        }
        catch (NullPointerException ex){
            System.out.println("null pointer exception");
        }
    }
    public static String getDetails(String key) {
        if(key == null) {
            throw new NullPointerException("null key in getDetails");
        }
        return "data for " + key; }

    public static void getKey() {
        Scanner myScanner = new Scanner( System.in );
        System.out.println("Enter string");
        String key = myScanner.next();
        try {
            printDetails( key );
        }catch (Exception ex){
            System.out.println("Key set to empty string");
        }
    }
    public static void printDetails(String key) throws Exception {
        try {
            String message = getDetails1(key);
            System.out.println( message );
        }catch ( Exception e){
            throw e;
        }
    }
    private static String getDetails1(String key) throws Exception {
        if(Objects.equals(key, "")) {
            throw new Exception( "Key set to empty string" );
        }
        return "data for " + key; }

    public static void getKeyManyTimes() {
        Scanner myScanner = new Scanner( System.in );
        boolean flag = true;
        while (flag) {
            flag = false;
            System.out.println("Enter string");
            String key = myScanner.next();
            try {
                printDetails(key);
            } catch (Exception ex) {
                flag = true;
                System.out.println("Key set to empty string");
            }
        }
    }

    public static void Exercise1(){
        exceptionZeroDiv();
    }

    public static void Exercise2(){
        exceptionDemo1();
    }

    public static void Exercise3(){
        exceptionDemo2();
    }

    public static void Exercise4(){
        exceptionDemo3();
    }

    public static void Exercise5(){
        printMessage("Hello");
        printMessage(null);
    }

    public static void Exercise6(){
        getKey();
    }

    public static void Exercise7(){
        getKeyManyTimes();
    }

    public static void main(String[] args) {
        int chooseExecise = 0;
        while(chooseExecise != -1) {
            System.out.println("Enter number of exercise from 1 to 7 or -1 to exit");

            chooseExecise = getNum();

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
                case (4):
                    Exercise4();
                    break;
                case (5):
                    Exercise5();
                    break;
                case (6):
                    Exercise6();
                    break;
                case (7):
                    Exercise7();
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