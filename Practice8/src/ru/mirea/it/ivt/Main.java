package ru.mirea.it.ivt;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
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

    public static void printSequence(int numOfCharToPrint, int counter,  int currNum){
        for(int i = 0; counter<=numOfCharToPrint && i < currNum; i++){
            System.out.print(currNum + " ");
            counter++;
        }
        currNum++;
        if(counter < numOfCharToPrint) printSequence(numOfCharToPrint, counter, currNum);
    }

    public static void printSequence(int numOfCharToPrint){
        printSequence(numOfCharToPrint, 0 ,1);
    }

    public static void Exercise1(){
        System.out.println("Enter num in range [1,999]: ");
        int numOfCharToPrint = getNum();

        while(numOfCharToPrint < 1 || numOfCharToPrint > 999){
            System.out.println("Entered number is out of range. Enter num again: ");
            numOfCharToPrint = getNum();
        }

        printSequence(numOfCharToPrint);
        System.out.println();
    }

    public static int getSumOfDigitInNum(int num){
        int currSum = 0;
        currSum += num%10;
        num = num/10;
        if(num == 0) return currSum;
        else return currSum+getSumOfDigitInNum(num);
    }


    public static void Exercise2(){
        System.out.println("Enter num in range [1,999999]: ");
        int numToGetSum = getNum();

        while(numToGetSum < 1 || numToGetSum > 999999){
            System.out.println("Entered number is out of range. Enter num again: ");
            numToGetSum = getNum();
        }

        System.out.println("Sum of digits in num is: " + getSumOfDigitInNum(numToGetSum));
    }

    //private static Map<Integer, Boolean> cache = new HashMap<>();

    public static boolean isPrime(int num){
        boolean isPrime = true;
        //boolean divisorIsPrime;
        int currDivisor = 2;

        while (currDivisor <= Math.sqrt(num)){
            /*if (cache.containsKey(currDivisor)) divisorIsPrime = cache.get(currDivisor);
            else divisorIsPrime = isPrime(currDivisor);*/
            if(isPrime(currDivisor)){
                if(num%currDivisor == 0) return false;
            }
            currDivisor++;
        }

        return isPrime;
    }

    public static void Exercise3(){
        System.out.println("Enter num in range [1,999999]: ");
        int numToCheckPrime = getNum();

        while(numToCheckPrime < 1 || numToCheckPrime > 999999){
            System.out.println("Entered number is out of range. Enter num again: ");
            numToCheckPrime = getNum();
        }

        System.out.println("Number " + numToCheckPrime + " is" + (isPrime(numToCheckPrime) ? "" : " not") + " prime");
    }

    public static boolean isPolindrom(String word, int position){
        if(word.charAt(position) != word.charAt(word.length()-1-position)) return false;
        else if((word.length()-1)/2 <= position) return isPolindrom(word,position+1);
        else return true;
    }

    public static boolean isPolindrom(String word){
        return isPolindrom(word,0);
    }

    public static void Exercise4(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter word: ");
        String word = scanner.next();
        boolean isPolindrom = isPolindrom(word);
        System.out.println("Word " + word + " is " +(isPolindrom? "":"not ") + "polindrom");
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