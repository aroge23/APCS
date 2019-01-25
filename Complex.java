package com.company;

public class Complex {
    //Class Variables
    //Instance Variables
    //Constructors
    //Getters/Setters
    //Other Methods

    //c = a + bi

    //Instance Variables
    private double a;
    private double b;

    //Constructors
    public Complex() {
    }
    public Complex(double newA, double newB) {
        setA(newA);
        setB(newB);
    }

    //Getters/Setters
    public double getA() {
        return a;
    }
    public void setA(double newA) {
        a = newA;
    }
    public double getB() {
        return b;
    }
    public void setB(double newB) {
        b = newB;
    }

    //Other Methods
    public String toStr() {
        //2 + 3i
        return a + " + " + b + "i";
    }

    //Convention
    //add - verb, changes the object
    //sum - noun, returns new object
    public void add(Complex c) {
        c.setA(c.getA() + a);
        c.setB(c.getB() + b);
    }
    public Complex sum(Complex c) {
        //returns a new object, with this complex value + c
        return new Complex(c.getA() + a, c.getB() + b);
    }

    //makeNegative()
    //negative()
    public void makeNegative() {
        setA(-getA());
        setB(-getB());
    }
    public Complex negative() {
        return new Complex(-getA(), -getB());
    }

    //difference(Complex c)
    //subtract(Complex)
    public Complex difference(Complex c) {
        return new Complex(c.getA() - getA(), c.getB() - getB());
    }
    public void subtract(Complex c) {
        add(c.negative());
    }
}
