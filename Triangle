package com.company;

public class Triangle extends Shape{
    private double sideA;
    private double sideB;
    private double sideC;
    private double base;
    private double height;

    public double getSideA() {
        return sideA;
    }
    public double getSideB() {
        return sideB;
    }
    public double getSideC() {
        return sideC;
    }
    public double getBase() {
        return base;
    }
    public double getHeight() {
        return height;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }
    public void setSideB(double sideB) {
        this.sideB = sideB;
    }
    public void setSideC(double sideC) {
        this.sideC = sideC;
    }
    public void setBase(double base) {
        this.base = base;
    }
    public void setHeight(double height) {
        this.height = height;
    }

    public Triangle() {
    }

    public Triangle(double newSideA, double newSideB, double newSideC, double newBase, double newHeight) {
        sideA = newSideA;
        sideB = newSideB;
        sideC = newSideC;
        base = newBase;
        height = newHeight;
    }

    public String toStr() {
        return ("Triangle with 3 sides, side lengths = " + sideA + ", " + sideB + ", " + sideC + ", base = " +
                base + ", height = " + height);
    }

    public double area() {
        return ((getBase() * getHeight()) / 2);
    }

    public double perimeter() {
        return getSideC() + getSideB() + getSideA();
    }
}
