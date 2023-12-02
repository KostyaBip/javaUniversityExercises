package ru.mirea.it.ivt;

public class Triangle extends Shape{

    public int side1;
    public int side2;
    public int side3;

    public Triangle(int side1, int side2, int side3, int positionX, int positionY, int color) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.positionX = positionX;
        this.positionY = positionY;
        this.color = color;
    }

    @Override
    public String getType(){
        return "Triangle";
    }

    @Override
    public double getArea(){
        double p = this.getPerimeter()/2.0;
        return Math.sqrt(p*(p-side1)*(p-side2)*(p-side3));
    }

    @Override
    public double getPerimeter(){
        return side1+side2+side3;
    }
}
