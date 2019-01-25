package com.company;

public abstract class AbstractShapeClass {
    private final int NUMBER_OF_SIDES;

    public abstract double area();
    public abstract double perimeter();
    public AbstractShapeClass() {
        NUMBER_OF_SIDES = 0;
    }

    public AbstractShapeClass(final int NEW_NUMBER_OF_SIDES) {
        NUMBER_OF_SIDES = NEW_NUMBER_OF_SIDES;
    }

    public int getNUMBER_OF_SIDES() {
        return NUMBER_OF_SIDES;
    }

    public String toStr() {
        return "Shape with " + NUMBER_OF_SIDES + " sides.";
    }
}
