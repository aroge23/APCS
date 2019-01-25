package com.company;

public class Car extends Vehicle {
    private int numOfDoors;
    private String motorType;

    public int getNumOfDoors() {
        return numOfDoors;
    }
    public String getMotorType() {
        return motorType;
    }
    public void setNumOfDoors(int newNum) {
        numOfDoors = newNum;
    }
    public void setMotorType(String newMotor) {
        motorType = newMotor;
    }

    public void communicate() {
        System.out.println("Honk honk!");
    }

    public void toStr() {
        System.out.println("This is a " + motorType + " car with " + numOfDoors + " doors.");
    }




}
