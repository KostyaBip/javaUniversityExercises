package ru.mirea.it.ivt;

public class MathFunc implements MathCalculable{
    @Override
    public double exponentiation(double numToExp, double degree) {
        return Math.pow(numToExp,degree);
    }

    @Override
    public double absoluteOfComplexNum(double realPart, double miraclePart) {
        return Math.sqrt(exponentiation(realPart,2) + exponentiation(miraclePart,2));
    }

    public double areaOfCircle(double radius){
        return PI*exponentiation(radius,2);
    }

    public double lengthOfCircle(double radius){
        return 2*PI*radius;
    }
}
