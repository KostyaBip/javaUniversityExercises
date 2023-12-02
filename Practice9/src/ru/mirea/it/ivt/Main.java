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
        Student student1 = new Student("Mark",20,3.9);
        Student student2 = new Student("Petya",19,4.2);
        Student student3 = new Student("Maria",18,4.85);
        Student student4 = new Student("Elizaveta",21,3.4);
        testStudent test = new testStudent(new Student[]{student1, student2, student3, student4});
        test.printArray();
        test.sortByMarks();
        test.printArray();
    }


    public static void Exercise2(){
        Student student1 = new Student("Mark",20,3.9);
        Student student2 = new Student("Petya",19,4.2);
        Student student3 = new Student("Maria",18,4.85);
        Student student4 = new Student("Elizaveta",21,3.4);
        Student[] arrStudents = {student1, student2, student3, student4};

        for (Student student : arrStudents) {
            System.out.print(student + " ");
        }
        System.out.println();

        SortingStudentsByGPA sort = new SortingStudentsByGPA();
        sort.quickSort(arrStudents);

        for (Student student : arrStudents) {
            System.out.print(student + " ");
        }
        System.out.println();

    }

    public static void Exercise3(){
        Student student1 = new Student("Mark",20,3.9);
        Student student2 = new Student("Petya",19,4.2);
        Student student3 = new Student("Maria",18,4.85);
        Student student4 = new Student("Elizaveta",21,3.4);
        Student[] arrStudents1 = {student1, student2, student3, student4};

        Student student5 = new Student("Ilya",23,5.0);
        Student student6 = new Student("Eva",19,3.95);
        Student student7 = new Student("Polina",24,4.5);
        Student student8 = new Student("Egor",18,3.1);
        Student[] arrStudents2 = {student5, student6, student7, student8};

        SortingStudentsByAge sort = new SortingStudentsByAge();
        Student[] arrStudents = sort.mergeSort(arrStudents1, arrStudents2);

        for (Student student : arrStudents) {
            System.out.print(student + " ");
        }
        System.out.println();
    }

    public static void Exercise4(){
        Book book1 = new Book("Harry Potter","Joanne Rowling", 431);
        Book book2 = new Book("War and peace","Lev Tolstoy", 784);
        System.out.println("Book " + book1 + " have "+ ((book1.compareTo(book2) >= 0)? "more ":"less ") + "pages then book " + book2);
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