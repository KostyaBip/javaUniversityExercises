package ru.mirea.it.ivt;

public class Circle extends Shape{

    int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public String getType(){
        return "Circle";
    }

    @Override
    public double getArea(){
        return Math.PI * Math.pow(radius,2);
    }

    @Override
    public double getPerimeter(){
        return 2 * Math.PI * radius;
    }
}
