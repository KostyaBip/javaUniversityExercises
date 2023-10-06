package ru.mirea.it.ivt;

public class Shape {

    public String getType(){
        return "Shape";
    }

    public double getArea(){
        return 0;
    }

    public double getPerimeter(){
        return 0;
    }

    public String toString(){
//        if (this instanceof Square) {
//            this.
//        }
        return "Type of shape - " + this.getType() + ", area = "
                + this.getArea() + ", perimeter = " + this.getPerimeter();
    }
}
