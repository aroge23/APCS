package com.company;

public class Vehicle {
    //Instance variables
    private int numOfSeats;
    private int currentNumOfPass;
    private Point currentPosition;
    private Point destination;
    private int topSpeed;

    //Constructors
    public Vehicle() {
    }
    public Vehicle(Point newPos, Point newDest) {
        currentPosition = newPos;
        destination = newDest;
    }

    //Getters/Setters
    public int getNumOfSeats() {
        return numOfSeats;
    }
    public int getCurrentNumOfPass() {
        return currentNumOfPass;
    }
    public int getTopSpeed() {
        return topSpeed;
    }
    public Point getCurrentPosition() {
        return currentPosition;
    }
    public Point getDestination() {
        return destination;
    }


    public void setNumOfSeats(int z) {
        numOfSeats = z;
    }
    public void setCurrentNumOfPass(int z) {
        currentNumOfPass = z;
    }
    public void setCurrentPosition(Point z) {
        currentPosition = z;
    }
    public void setDestination(Point z) {
        destination = z;
    }
    public void setTopSpeed(int z) {
        topSpeed = z;
    }

    public void communicate() {
        System.out.println("Hey you!");
    }

    public void toStr() {
        System.out.println("This is a vehicle");
    }

    public int speedCompareTo(Vehicle v) {
        return v.getTopSpeed() - topSpeed;
    }

    public int speedCompareTo(Car c) {
        return c.getTopSpeed() - topSpeed;
    }

    public int speedCompareTo(Airplane a) {
        return a.getTopSpeed() - topSpeed;
    }

    public int speedCompareTo(Train t) {
        return t.getTopSpeed() - topSpeed;
    }

    /*You need 4 different methods because they all contain different parameters. If you pass this method, it will search for the
    method that has the correct paramter that you passed through. It just allows the same function to different classes. You don't
    duplicate these methods within classes, because the parent class has to access this to get the difference in speed. When the
    method is in the parent, all the child classes inherits the functions as well*/

    /*You can't put these methods in the child classes because the methods need to access the vehicle top speed (the top speed of
    the parent class. If the method is in the child, it cannot access the instance variables of methods of the parent.*/


}
