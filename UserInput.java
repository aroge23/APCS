package com.company;
import java.util.Scanner;

public class UserInput {
    public void methodNoInput(int age) {
        System.out.println("Your age: " + age);
    }

    public void methodInput() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter");
    }

    public static void pressEnterToContinue() {
        System.out.println("Press enter to continue.");
        try {
            System.in.read();
        } catch (Exception e) {
        }
    }

}
