package ru.mirea.it.ivt;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.*;

public class Main {

    public static int getNum(){
        Scanner scan = new Scanner(System.in);
        int num;

        try {
            num = scan.nextInt();
            return num;
        } catch (InputMismatchException ex) {
            System.out.println("Wrong input, entered line is not a number");
            scan.nextLine();
            return getNum();
        }
    }

    public static void Exercise1(){
        String text = "It is text to split";
        System.out.println("Original text: " + text);
        Pattern pattern = Pattern.compile("\\s");
        String[] strings = pattern.split(text);
        System.out.println("Splitted text: ");
        for (String s : strings) {
            System.out.println(s);
        }
    }

    public static void Exercise2(){
        Pattern pattern = Pattern.compile("abcdefghijklmnopqrstuv18340");
        String str1 = "abcdefghijklmnopqrstuv18340";
        String str2 = "Example string";
        Matcher matcher1 = pattern.matcher(str1);
        Matcher matcher2 = pattern.matcher(str2);
        System.out.println("Pattern - \"abcdefghijklmnopqrstuv18340\"");
        System.out.println("String - \"" + str1 + "\" " + (matcher1.matches() ? "" : "doesn't ") + "matches to pattern");
        System.out.println("String - \"" + str2 + "\" " + (matcher2.matches() ? "" : "doesn't ") + "matches to pattern");
    }

    public static void Exercise3(){
        Pattern pattern = Pattern.compile(".*\\d+\\s*\\+");
        String str1 = "(1 + 8) – 9 / 4";
        String str2 = "6 / 5 – 2 * 9";
        Matcher matcher1 = pattern.matcher(str1);
        Matcher matcher2 = pattern.matcher(str2);
        System.out.println("String - \"" + str1 + "\" " + (matcher1.find() ? "" : "doesn't ") + "contains num with plus sign after");
        System.out.println("String - \"" + str2 + "\" " + (matcher2.find() ? "" : "doesn't ") + "contains num with plus sign after");
    }

    public static void Exercise4(){
        Pattern pattern = Pattern.compile("[a-zA-Z\\d]+[a-zA-Z\\d.]*[a-zA-Z\\d]+@[a-zA-Z]+\\.[a-zA-Z]+");
        String email1 = "user@example.com";
        String email2 = "myhost@@@com.ru";
        String email3 = "@my.ru";
        Matcher matcher1 = pattern.matcher(email1);
        Matcher matcher2 = pattern.matcher(email2);
        Matcher matcher3 = pattern.matcher(email3);
        System.out.println("Email address " + email1 + " is " + (matcher1.matches() ? "correct" : "wrong"));
        System.out.println("Email address " + email2 + " is " + (matcher2.matches() ? "correct" : "wrong"));
        System.out.println("Email address " + email3 + " is " + (matcher3.matches() ? "correct" : "wrong"));

    }

    public static void main(String[] args) {
        int chooseExecise = 0;
        while(chooseExecise != -1) {
            System.out.println("Enter number of exercise from 1 to 4 or -1 to exit");

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