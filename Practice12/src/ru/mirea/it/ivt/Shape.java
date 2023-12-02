package ru.mirea.it.ivt;

public abstract class Shape {
    public int color;
    public int positionX;
    public int positionY;

    public abstract String getType();

    public abstract double getArea();

    public abstract double getPerimeter();

}
