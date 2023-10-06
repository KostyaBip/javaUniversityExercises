package ru.mirea.it.ivt;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public enum Seasons{
        Summer ("Лето", 25, "можно купаться"),
        Autumn ("Осень",7, "падают листья"),
        Winter ("Зима",-10, "можно лепить снеговиков"),
        Spring("Весна",12, "всё распускается");

        private int averageTemperature;
        private String name;
        private String description;

        Seasons(String name, int averageTemperature, String description){
            this.name = name;
            this.averageTemperature = averageTemperature;
            this.description = description;
        }

        public void printSpecification(Seasons season){
            switch (season){
                case Summer:
                    System.out.println("Я люблю лето!");
                case Autumn:
                    System.out.println("Я люблю осень!");
                case Winter:
                    System.out.println("Я люблю зиму!");
                case Spring:
                    System.out.println("Я люблю весну!");

            }
        }

        public String getDescription(){
            return "Холодное время года";
        }

        public String getDescription(Seasons season){
            if(season == Summer) return ("Теплое время года");
            else return ("Холодное время года");
        }

        @Override
        public String toString(){
            return "Название - " + this.name + ", средняя температура - " +
                    this.averageTemperature + ", описание - " + this.description;
        }
    }

    public static void Exercise1(){
        System.out.println(Arrays.toString(Seasons.values()));
    }

    public static void Exercise2(){
        Computer computer = new Computer(Computer.manufacturer.Xiaomi,
                new Processor(6,12,4200), new Memory(3666, 4, 16),
                new Monitor(1920, 24));
        computer.printSpecifications();
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