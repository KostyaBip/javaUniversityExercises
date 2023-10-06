package ru.mirea.it.ivt;

public class Person {

    String fullName;
    int age;

    public Person() {
        //fullName = "Name";
        //int age = 0;
    }

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public void talk(){
        System.out.println("Person " + this.fullName + " is talking");
    }

    public void move(){
        System.out.println("Person " + this.fullName + " is moving");
    }

    @Override
    public String toString(){
        return "Full name - " + this.fullName + ", age - " + this.age;
    }
}
