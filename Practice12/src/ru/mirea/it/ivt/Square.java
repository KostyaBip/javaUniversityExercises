package ru.mirea.it.ivt;

public class Square extends Shape{
    int height;
    int width;

    public Square(int height, int width, int positionX, int positionY, int color) {
        this.height = height;
        this.width = width;
        this.positionX = positionX;
        this.positionY = positionY;
        this.color = color;
    }

    @Override
    public String getType(){
        return "Square";
    }

    @Override
    public double getArea(){
        return height*width;
    }

    @Override
    public double getPerimeter(){
        return height*2 + width*2;
    }

}
