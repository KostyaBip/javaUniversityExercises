package ru.mirea.it.ivt;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static int getNumInRange(int min, int max){
        Scanner scan = new Scanner(System.in);

        int num = max+1;
        boolean flag = true;

        while (flag) {
            try {
                num = scan.nextInt();
            } catch (java.util.InputMismatchException ex) {
                System.out.println("Wrong input, enter number again");
                scan.nextLine();
                continue;
            }
            if(num < min || num > max){
                System.out.println("Entered number is out of range. Try again");
            }else flag = false;
        }

        return num;
    }

    public static void Exercise1(){
        // Exercise 3.4 random int array
        System.out.println("Exercise 3.4 random int array");

        Random randGen = new Random();
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter size of array from 5 to 25");
        int sizeArr = getNumInRange(5,25);

        int[] arrayRand = new int[sizeArr];
        ArrayList<Integer> arrayEven = new ArrayList<>();

        for(int i = 0; i < sizeArr; i ++){
            int genNum = randGen.nextInt(0,sizeArr + 1);
            arrayRand[i] = genNum;
            if(genNum%2 == 0) arrayEven.add(genNum);
        }

        System.out.print("Original array :");
        for(int i : arrayRand){
            System.out.print(" " + i);
        }

        System.out.print("\nArray with even numbers:");
        for(int i : arrayEven){
            System.out.print(" " + i);
        }
        System.out.print("\n");
    }

    public static void Exercise2(){
        // Exercise 3.3.2 convert money
        System.out.println("Exercise 3.3.2 convert money");

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter amount of money you want to convert");
        int amount = getNumInRange(1,1000000);
        System.out.println("Enter the currency you want to convert\n1 - Rub, 2 - USD, 3 - Eur, 4 - Yuan");
        int firstCurrency = getNumInRange(1,4);
        System.out.println("Enter the currency to convert to\n1 - Rub, 2 - USD, 3 - Eur, 4 - Yuan");
        int secondCurrency = getNumInRange(1,4);

        NumberFormat numberFormat4 = NumberFormat.getCurrencyInstance(Locale.ROOT); // Русский где?
        switch (secondCurrency){
            case 1:
                numberFormat4 = NumberFormat.getCurrencyInstance(Locale.ROOT);
                break;
            case 2:
                numberFormat4 = NumberFormat.getCurrencyInstance(Locale.US);
                break;
            case 3:
                numberFormat4 = NumberFormat.getCurrencyInstance(Locale.UK);
                break;
            case 4:
                numberFormat4 = NumberFormat.getCurrencyInstance(Locale.CHINA);
                break;
        }

        if (firstCurrency == secondCurrency){
            System.out.println("Result = " + numberFormat4.format(amount));
        }
        else{
            int changeNum = Integer.parseInt(Integer.toString(firstCurrency) + Integer.toString(secondCurrency));
            double res = 0.0;
            switch (changeNum){
                case 12:
                    res = ConvertMoney.RubToUsd(amount);
                    System.out.println("Result = " + numberFormat4.format(res));
                    break;
                case 13:
                    res = ConvertMoney.RubToEur(amount);
                    System.out.println("Result = " + numberFormat4.format(res));
                    break;
                case 14:
                    res = ConvertMoney.RubToYuan(amount);
                    System.out.println("Result = " + numberFormat4.format(res));
                    break;
                case 21:
                    res = ConvertMoney.RubToUsd(1.0/amount);
                    System.out.println("Result = " + numberFormat4.format(1.0/res));
                    break;
                case 31:
                    res = ConvertMoney.RubToEur(1.0/amount);
                    System.out.println("Result = " + numberFormat4.format(1.0/res));
                    break;
                case 41:
                    res = ConvertMoney.RubToYuan(1.0/amount);
                    System.out.println("Result = " + numberFormat4.format(1.0/res));
                    break;
                case 23:
                    res = ConvertMoney.UsdToEur(amount);
                    System.out.println("Result = " + numberFormat4.format(res));
                    break;
                case 24:
                    res = ConvertMoney.UsdToYuan(amount);
                    System.out.println("Result = " + numberFormat4.format(res));
                    break;
                case 32:
                    res = ConvertMoney.UsdToEur(1.0/amount);
                    System.out.println("Result = " + numberFormat4.format(1.0/res));
                    break;
                case 42:
                    res = ConvertMoney.UsdToYuan(1.0/amount);
                    System.out.println("Result = " + numberFormat4.format(1.0/res));
                    break;
                case 34:
                    res = ConvertMoney.EurToYuan(amount);
                    System.out.println("Result = " + numberFormat4.format(res));
                    break;
                case 43:
                    res = ConvertMoney.EurToYuan(1.0/amount);
                    System.out.println("Result = " + numberFormat4.format(1.0/res));
                    break;
            }
        }

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