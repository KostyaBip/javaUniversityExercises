package ru.mirea.it.ivt;

public class Rectangle extends Shape{

    private int side1;
    private int side2;
    private int side3;

    public Rectangle(int side1, int side2, int side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public String getType(){
        return "Rectangle";
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
