package ru.mirea.it.ivt;

public class Car implements Nameable{
    public String getName() {
        return this.getClass().getSimpleName();
    }
}
