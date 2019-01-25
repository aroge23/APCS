//package com.company;
//import java.util.Scanner;
//import com.company.UserInput;
//
//public class Main {
//    public static void main(String args[]) {
//        //First shape
//        System.out.println("How many sides is your shape 1? (Pick 0, 3, or 4)");
//        Scanner scan = new Scanner(System.in);
//        int numOfSides = scan.nextInt();
//        Shape[] shapes = new Shape[3];
//
//        if (numOfSides == 0) {
//            Circle shape1 = new Circle();
//            System.out.println("What is the radius of the circle");
//            shape1.setRad(scan.nextDouble());
//            System.out.println("Where is the x-coordinate of the center of your circle?");
//            double centerX = scan.nextDouble();
//            System.out.println("Where is the y-coordinate of the center of your circle?");
//            double centerY = scan.nextDouble();
//            shape1.setCenter(new Point(centerX, centerY));
//            shapes[0] = shape1;
//        } else if (numOfSides == 3) {
//            Triangle shape1 = new Triangle();
//            System.out.println("What is the length of the first side of the triangle?");
//            shape1.setSideA(scan.nextDouble());
//            System.out.println("What is the length of the second side of the triangle?");
//            shape1.setSideB(scan.nextDouble());
//            System.out.println("What is the length of the third side of the triangle?");
//            shape1.setSideC(scan.nextDouble());
//            System.out.println("What is the length of the base of the triangle?");
//            shape1.setBase(scan.nextDouble());
//            System.out.println("What is the length of the height of the triangle?");
//            shape1.setHeight(scan.nextDouble());
//            shapes[0] = shape1;
//        } else {
//            Rectangle shape1 = new Rectangle();
//            System.out.println("What is the length of the rectangle?");
//            shape1.setLength(scan.nextDouble());
//            System.out.println("What is the width of the rectangle?");
//            shape1.setWidth(scan.nextDouble());
//            shapes[0] = shape1;
//        }
//
//        //Second Shape
//        System.out.println("How many sides is your shape 2? (Pick 0, 3, or 4)");
//        int numOfSides2 = scan.nextInt();
//
//        if (numOfSides2 == 0) {
//            Circle shape2 = new Circle();
//            System.out.println("What is the radius of the circle");
//            shape2.setRad(scan.nextDouble());
//            System.out.println("Where is the x-coordinate of the center of your circle?");
//            double centerX = scan.nextDouble();
//            System.out.println("Where is the y-coordinate of the center of your circle?");
//            double centerY = scan.nextDouble();
//            shape2.setCenter(new Point(centerX, centerY));
//            shapes[1] = shape2;
//        } else if (numOfSides2 == 3) {
//            Triangle shape2 = new Triangle();
//            System.out.println("What is the length of the first side of the triangle?");
//            shape2.setSideA(scan.nextDouble());
//            System.out.println("What is the length of the second side of the triangle?");
//            shape2.setSideB(scan.nextDouble());
//            System.out.println("What is the length of the third side of the triangle?");
//            shape2.setSideC(scan.nextDouble());
//            System.out.println("What is the length of the base of the triangle?");
//            shape2.setBase(scan.nextDouble());
//            System.out.println("What is the length of the height of the triangle?");
//            shape2.setHeight(scan.nextDouble());
//            shapes[1] = shape2;
//        } else {
//            Rectangle shape2 = new Rectangle();
//            System.out.println("What is the length of the rectangle?");
//            shape2.setLength(scan.nextDouble());
//            System.out.println("What is the width of the rectangle?");
//            shape2.setWidth(scan.nextDouble());
//            shapes[1] = shape2;
//        }
//
//        //Third shape
//        System.out.println("How many sides is your shape 3? (Pick 0, 3, or 4)");
//        int numOfSides3 = scan.nextInt();
//
//        if (numOfSides3 == 0) {
//            Circle shape3 = new Circle();
//            System.out.println("What is the radius of the circle");
//            shape3.setRad(scan.nextDouble());
//            System.out.println("Where is the x-coordinate of the center of your circle?");
//            double centerX = scan.nextDouble();
//            System.out.println("Where is the y-coordinate of the center of your circle?");
//            double centerY = scan.nextDouble();
//            shape3.setCenter(new Point(centerX, centerY));
//            shapes[2] = shape3;
//        } else if (numOfSides3 == 3) {
//            Triangle shape3 = new Triangle();
//            System.out.println("What is the length of the first side of the triangle?");
//            shape3.setSideA(scan.nextDouble());
//            System.out.println("What is the length of the second side of the triangle?");
//            shape3.setSideB(scan.nextDouble());
//            System.out.println("What is the length of the third side of the triangle?");
//            shape3.setSideC(scan.nextDouble());
//            System.out.println("What is the length of the base of the triangle?");
//            shape3.setBase(scan.nextDouble());
//            System.out.println("What is the length of the height of the triangle?");
//            shape3.setHeight(scan.nextDouble());
//            shapes[2] = shape3;
//        } else {
//            Rectangle shape3 = new Rectangle();
//            System.out.println("What is the length of the rectangle?");
//            shape3.setLength(scan.nextDouble());
//            System.out.println("What is the width of the rectangle?");
//            shape3.setWidth(scan.nextDouble());
//            shapes[2] = shape3;
//        }
//
//
//        //Part 6: Printing
//        for (int i = 0; i < 3; i++) {
//            System.out.print(shapes[i].toStr());
//            System.out.print(", perimeter = " + shapes[i].perimeter());
//            System.out.println(", area = " + shapes[i].area());
//        }
//    }
//}