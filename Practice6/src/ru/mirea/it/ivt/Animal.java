package ru.mirea.it.ivt;

public class Animal implements Nameable{

    public String getName() {
        return this.getClass().getSimpleName();
    }
}
