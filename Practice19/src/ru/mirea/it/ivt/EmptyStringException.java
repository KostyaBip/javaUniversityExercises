package ru.mirea.it.ivt;

public class EmptyStringException extends IllegalArgumentException {
    public EmptyStringException(){
        super("The line is empty!");
    }
}
