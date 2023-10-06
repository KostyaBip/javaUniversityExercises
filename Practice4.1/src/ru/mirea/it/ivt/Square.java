package ru.mirea.it.ivt;

public class Square extends Shape{
    int length;
    int width;

    public Square(int length, int width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public String getType(){
        return "Square";
    }

    @Override
    public double getArea(){
        return length*width;
    }

    @Override
    public double getPerimeter(){
        return length*2 + width*2;
    }

}
