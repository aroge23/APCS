package com.company;

public class Rectangle extends Quadrilateral{

    public double getLength() {
        return getSideA();
    }
    public double getWidth() {
        if (getSideA() == getSideC())
            return getSideB();
        else
            return getSideC();
    }

    public void setLength(double length) {
        setSideA(length);
    }
    public void setWidth(double width) {
        setSideB(width);
    }

    public Rectangle() {
    }

    public Rectangle(double newLength, double newWidth) {
        setSideA(newLength);
        setSideB(newWidth);
    }

    public String toStr() {
        String rv = "Rectangle with 4 sides, length = " + getSideA() + " and width = " + getSideB();
        return rv;
    }

    public double area() {
        return getWidth() * getLength();
    }

    public double perimeter() {
        return (2 * (getWidth() + getLength()));
    }
}
