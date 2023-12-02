package ru.mirea.it.ivt;

public class StudentNotFoundException extends Exception{
    public StudentNotFoundException(String name) {
        super("Student with name \"" + name + "\" not found ");
    }
}
