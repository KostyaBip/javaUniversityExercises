package ru.mirea.it.ivt;

public class Dog {
    private String name;
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int toHumanAge(){
        return this.getAge()*7;
    }

    @Override
    public String toString() {
        return "Name: " + this.getName() + "; age - " +
                this.getAge() + "; human age - " + this.toHumanAge();
    }
}
