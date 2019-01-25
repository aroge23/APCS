package com.company;

public class Circle extends Shape{
    //Instance Variables
    private double rad;
    private Point center;

    //Getters and Setters
    public double getRad() {
        return rad;
    }

    public void setRad(double newRad) {
        if (newRad < 0) {
            System.out.println("Error: radius of circle cannot be negative");
            rad = -1;
        } else {
            rad = newRad;
        }
    }//end setRad

    public Point getCenter() {
        return center;
    }
    public void setCenter(Point newCenter) {
        center = newCenter;
    }

    //Constructors
    public Circle() {
    }
    public Circle(double newRad, Point newCenter) {
        setRad(newRad);
        setCenter(newCenter);
    }

    public String toStr() {
        return ("Circle with 0 sides, radius = " + rad + " and center = " + center.toStr());
    }

    public double area() {
        return (3.14 * getRad() * getRad());
    }

    public double perimeter() {
        return (3.14 * 2 * getRad());
    }
}//end class Circle
