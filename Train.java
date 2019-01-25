package com.company;

public class Train extends Vehicle{
    private int numBoxCars;

    public int getNumBoxCars() {
        return numBoxCars;
    }
    public void setNumBoxCars(int newNum) {
        numBoxCars = newNum;
    }

    public void communicate() {
        System.out.println("I think I can, I think I can!");
    }

    public void toStr() {
        System.out.println("This is a train, all aboard!");
    }
}
