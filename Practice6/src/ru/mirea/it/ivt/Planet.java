package ru.mirea.it.ivt;

public class Planet implements Nameable{

    public String getName() {
        return this.getClass().getSimpleName();
    }
}
