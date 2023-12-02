package ru.mirea.it.ivt;

public class Circle extends Shape{

    int radius;

    public Circle(int radius,int positionX, int positionY, int color) {
        this.radius = radius;
        this.positionX = positionX;
        this.positionY = positionY;
        this.color = color;
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
