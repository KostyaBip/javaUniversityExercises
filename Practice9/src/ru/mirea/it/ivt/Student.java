package ru.mirea.it.ivt;

public class Student {

    public String name;
    public int age;
    public double averageMark;

    public Student(String name, int age, double averageMark) {
        this.name = name;
        this.age = age;
        this.averageMark = averageMark;
    }

    public String toString(){
        return "Name - " + this.name + ", age - " + this.age + ", average mark = " + this.averageMark + ";";
    }
}
