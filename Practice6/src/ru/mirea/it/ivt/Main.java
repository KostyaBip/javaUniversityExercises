package ru.mirea.it.ivt;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void Exercise1(){
        MovablePoint point = new MovablePoint(0,0,1,1);
        MovableCircle Circle = new MovableCircle(2,point);

        System.out.println(Circle);

        Circle.moveUp();
        Circle.moveRight();

        System.out.println(Circle);
    }

    public static void Exercise2(){
        Planet mars = new Planet();
        Car car = new Car();
        Animal monkey = new Animal();

        System.out.println("Название 1-ого класса: " + mars.getName());
        System.out.println("Название 2-ого класса: " + car.getName());
        System.out.println("Название 3-ого класса: " + monkey.getName());
    }

    public static void Exercise3(){
        Priceable product = new Product("Книга", 299.99);
        Service service = new Service("Ремонт", 50000.0);

        System.out.println("Цена товара: " + product.getPrice() + " rub");
        System.out.println("Цена услуги: " + service.getPrice() + " rub");
    }

    public static void Exercise4(){

        double celsiusTemperature = 25.0;

        ConvertTemperature convertTemperature = new ConvertTemperature();

        System.out.println(celsiusTemperature + " градусов Цельсия = " + convertTemperature.convert(celsiusTemperature, 1) + " Кельвинов");
        System.out.println(celsiusTemperature + " градусов Цельсия = " + convertTemperature.convert(celsiusTemperature, 2) + " градусов Фаренгейта");
    }


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int chooseExecise = 0;
        while(chooseExecise != -1) {
            System.out.println("Enter number of exercise from 1 to 4 or -1 to exit");

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