package ru.mirea.it.ivt;

import java.util.Scanner;

public class Main {
    public static void Exercise1(){
        // Exercise №4 (Computer shop)
        System.out.println("Exercise 2.4 - Computer shop");
        Scanner scan = new Scanner(System.in);

        ComputerShop comp = null;
        int chooseCommand = 0;
        while(chooseCommand != -1) {
            switch (chooseCommand) {
                case (0):
                    System.out.println("Available commands are:\n 1 - create new computer" +
                            "\n 2 - add last created computer to shop\n 3 - create and add computer to shop" +
                            "\n 4 - delete computer from shop by name\n 5 - find computer by name" +
                            "\n 0 - show list of commands\n -1 - stop program");
                    break;

                case (1):
                    System.out.println("Enter name, number of CPU cores, number of GPU cores " +
                            "and number of RAM separated with space");
                    comp = new ComputerShop(scan.next(), scan.nextInt(),scan.nextInt(),scan.nextInt());
                    System.out.println("Computer " + comp.Name + " was successfully created");
                    break;

                case (2):
                    if(comp != null){
                        ComputerShop.addItem(comp);
                    }else System.out.println("Error. There is no already created computer");
                    break;

                case (3):
                    ComputerShop.addItem();
                    break;

                case (4):
                    ComputerShop.deleteItem();
                    break;

                case (5):
                    ComputerShop.findItem();
                    break;

                default:
                    System.out.println("Wrong input");
                    break;
            }
            System.out.println("Enter command: ");
            chooseCommand = scan.nextInt();
        }
    }

    public static void Exercise2(){
        // Exercise №5 (Dogs)
        Scanner scan = new Scanner(System.in);
        System.out.println("Exercise 2.5 - Dogs");

        Dog dog = null;
        int chooseCommand = 0;
        while(chooseCommand != -1) {
            switch (chooseCommand) {
                case (0):
                    System.out.println("Available commands are:\n 1 - create new dog" +
                            "\n 2 - add last created dog to dog kennel\n 3 - print list of dogs living in kennel" +
                            "\n 0 - show list of commands\n -1 - stop program");
                    break;

                case (1):
                    System.out.println("Enter name and age of dog separated with space");
                    dog = new Dog(scan.next(), scan.nextInt());
                    System.out.println("Dog " + dog.getName() + " was successfully created");
                    break;

                case (2):
                    if(dog != null){
                        DogKennel.addDogToArray(dog);
                        System.out.println("Dog " + dog.getName() + " was successfully added to kennel");
                    }else System.out.println("Error. There is no already created dog");
                    break;

                case (3):
                    DogKennel.printArrayOfDogs();
                    break;

                default:
                    System.out.println("Wrong input");
                    break;
            }
            System.out.println("Enter command: ");
            chooseCommand = scan.nextInt();
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int chooseExecise = 0;
        while(chooseExecise != -1) {
            System.out.println("Enter number of exercise from 1 to 2 or -1 to exit");
            chooseExecise = scan.nextInt();
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
                    System.out.println("Wrong input");
                    break;
            }
        }
    }
}