package ru.mirea.it.ivt;
import java.util.Scanner;

public class Main {
    private static Scanner scan = new Scanner(System.in);
    public static void Exercise_1_3(){
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        int sumOfElem = 0;
        float averageValOfElem;
        for(int i : array){
            sumOfElem += i;
        }
        averageValOfElem = (float)sumOfElem/ array.length;
        System.out.print("Sum of element of array is " + sumOfElem +
                "\nAverage value of elements of array is " + averageValOfElem);
    }
    public static void Exercise_1_4(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter values of array separated with space: ");
        String valuesOfArray = scan.nextLine();
        String[] splitedValues = valuesOfArray.split(" ");
        int i = 0;
        int max = Integer.parseInt(splitedValues[0]);
        int min = max;
        int sumOfElem = 0;
        int[] array = new int[splitedValues.length];
        while(i<splitedValues.length){
            array[i] = Integer.parseInt(splitedValues[i]);
            sumOfElem+=array[i];
            max = Math.max(max, array[i]);
            min = min > array[i] ? array[i] : min;
            i++;
        }
        System.out.print("Sum of element of array is " + sumOfElem +
                "\nMax value of element of array is " + max +
                "\nMin value of element of array is " + min);
    }
    public static void Exercise_1_5(String[] args){
        for(String s : args){
            System.out.println(s);
        }
    }
    public static void Exercise_1_6(){
        for(int i = 0; i < 10; i++) {
            System.out.print(1.0/(i+1) == 1/(i+1) ? 1/(i+1) + ", ": String.format("%.4f, ", 1.0/(i+1)));
        }
    }
    public static void Exercise_1_7(Scanner scan){
        System.out.println("Enter num: ");
        int num = scan.nextInt();
        System.out.println("Factorial of " + num + "is " + Factorial(num));
    }
    public static int Factorial(int num){
        int factorial = num;
        while(num > 2){
            factorial *= num-1;
            num--;
        }
        return factorial;
    }
    public static void main(String[] args) {
        int chooseExecise = 0;
        while(chooseExecise != -1){
            System.out.println("\nEnter number of exercise from 3 to 7 or -1 to exit");
            chooseExecise = scan.nextInt();
            switch (chooseExecise){
                case (3):
                    Exercise_1_3();
                    break;
                case (4):
                    Exercise_1_4();
                    break;
                case (5):
                    Exercise_1_5(args);
                    break;
                case (6):
                    Exercise_1_6();
                    break;
                case (7):
                    Exercise_1_7(scan);
                    break;
                case (-1):
                    System.out.println("Shutdown");
                    break;
                default:
                    System.out.println("Wrong input");
                    break;
            }
        }
        //Exercise_1_4();

        // Exercise_1_7
        /*System.out.print(Exercise_1_7(5));*/

        //Exercise_1_5
        /*for(String s : args){
            System.out.println(s);
        }*/
    }
}