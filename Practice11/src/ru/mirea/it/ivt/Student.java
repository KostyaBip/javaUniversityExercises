package ru.mirea.it.ivt;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class Student {
    public String name;
    public int age;
    public double averageMark;
    public Calendar dateOfBirthday;

    public Student(String name, int age, double averageMark, Calendar dateOfBirthday) {
        this.name = name;
        this.age = age;
        this.averageMark = averageMark;
        this.dateOfBirthday = dateOfBirthday;
    }

    public String toString(){
        Scanner scan = new Scanner(System.in);
        SimpleDateFormat dateFormatter;

        System.out.println("Enter format of date. 1 - short, 2 - long: ");
        int format = scan.nextInt();

        if (format==1) dateFormatter = new SimpleDateFormat("dd/MM/yy");
        else dateFormatter = new SimpleDateFormat("E yyyy.MM.dd 'at' HH:mm:ss a zzz");

        return "Name - " + this.name + ", age - " + this.age + ", average mark = " + this.averageMark +
                "; date of birthday - " + dateFormatter.format(dateOfBirthday.getTime());
    }
}
