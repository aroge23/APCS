package com.company;

public class Shape {
    private final int NUMBER_OF_SIDES;

    public double area() {
        return 1;
    }
    public double perimeter() {
        return 1;
    }

    public Shape() {
        NUMBER_OF_SIDES = 0;
    }

    public Shape(final int NEW_NUMBER_OF_SIDES) {
        NUMBER_OF_SIDES = NEW_NUMBER_OF_SIDES;
    }

    public int getNUMBER_OF_SIDES() {
        return NUMBER_OF_SIDES;
    }

    public String toStr() {
        return "" + NUMBER_OF_SIDES;
    }
}
