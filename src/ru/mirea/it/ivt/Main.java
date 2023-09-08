package ru.mirea.it.ivt;
import java.util.Scanner;
public class Main {
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
            max = max < array[i] ? array[i] : max;
            min = min > array[i] ? array[i] : min;
            i++;
        }
        System.out.print("Sum of element of array is " + sumOfElem +
                "\nMax value of element of array is " + max +
                "\nMin value of element of array is " + min);
    }
    public static void Exercise_1_5(){
        //
    }
    public static void Exercise_1_6(){
        for(int i = 0; i < 10; i++) {
            System.out.print(1.0/(i+1) == 1/(i+1) ? 1/(i+1) + ", ": String.format("%.4f, ", 1.0/(i+1)));
        }
    }
    public static int Exercise_1_7(int num){
        int factorial = num;
        while(num > 2){
            factorial *= num-1;
            num--;
        }
        return factorial;
    }
    public static void Exercise_1_8(){

    }
    public static void main(String[] args) {
        // Exercise_1_7
        /*System.out.print(Exercise_1_7(5));*/

        // Exercise_1_5
        /*for(String s : args){
            System.out.println(s);
        }*/
    }
}