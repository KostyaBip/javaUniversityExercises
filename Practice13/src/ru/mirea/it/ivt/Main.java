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
        String address1 = "Росси я, Центральный федеральный округ, Москва, Проспект Вернадского, 78, 1, 1";
        String address2 = "Россия. Центральный федеральный округ. Москва. Проспект Верндаского. 86. 1. 1";
        String address3 = "Россия; Центральный федеральный округ; Тверь; Трехсвятская; 14; 3; 23";
        String address4 = "Россия/ Северо-Западный федеральный округ/ Санкт-Петербугр/ Думская/ 46/ 2/ 9";
        Adress addr1 = new Adress();
        Adress addr2 = new Adress();
        Adress addr3 = new Adress();
        Adress addr4 = new Adress();

        addr1.getParametersFromString(address1);
        addr2.getParametersFromString(address2, ".");
        addr3.getParametersFromString(address3, ";");
        addr4.getParametersFromString(address4, "/");

        System.out.println(addr1 + "\n" + addr2 + "\n" + addr3 + "\n" + addr4);
    }

    public static void Exercise2(){
        ConvertTelephoneNumber convTelNum = new ConvertTelephoneNumber();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter telephone number: ");
        String telephoneNumber = scan.next();
        telephoneNumber = convTelNum.covertTelephoneNumber(telephoneNumber);
        System.out.println(telephoneNumber);
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