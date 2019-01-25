package com.company;

public abstract class Quadrilateral extends AbstractShapeClass {
    private double sideA;
    private double sideB;
    private double sideC;
    private double sideD;
    private String sides; //"1.1, 2.3, 4.56, 7.8901"

    public void setSideA(double sideA) {
        int firstComma = sides.indexOf(",");
        String subStr = sides.substring(firstComma);
        sides = sideA + subStr;
    }
    public void setSideB(double sideB) {
        String subL, subR, subStr;
        int firstComma = sides.indexOf(",");
        int secondComma;
        subL = sides.substring(0, firstComma + 1);
        subStr = sides.substring(firstComma + 1);
        secondComma = subStr.indexOf(",");
        subR = subStr.substring(secondComma);
        sides = subL + sideB + subR;
    }
    public void setSideC(double sideC) {
        String subL, subR, subStr;
        int firstComma = sides.indexOf(",");
        subL = sides.substring(0, firstComma);
        subStr = sides.substring(firstComma) + 1;
        firstComma = subStr.indexOf(",");
        subL += "," + subStr.substring(0, firstComma);
        subStr = sides.substring(firstComma) + 1;
        firstComma = subStr.indexOf(",");
        subR = sides.substring(firstComma + 1);
        sides = subL + sideC + subR;


    }
    public void setSideD(double sideD) {
        this.sideD = sideD;
    }

    public double getSideA() {
        int firstComma = sides.indexOf(",");
        //"1.1, 2.3, 4.56, 7.8901"
        String subStr = sides.substring(0, firstComma);
        return Double.parseDouble(subStr);
    }
    public double getSideB() {
        int firstComma = sides.indexOf(",") + 1;
        String newStr = sides.substring(firstComma); //"2.3, 4.56, 7.8901"
        firstComma = newStr.indexOf(",");
        String subStr = newStr.substring(0, firstComma);
        return Double.parseDouble(subStr);
    }
    public double getSideC() {
        int firstComma = sides.indexOf(",") + 1;
        String newStr = sides.substring(firstComma); //"2.3, 4.56, 7.8901"
        firstComma = newStr.indexOf(",");
        newStr = sides.substring(firstComma);
        firstComma = newStr.indexOf(",");
        String subStr = newStr.substring(0, firstComma);
        return Double.parseDouble(subStr);
    }
    public double getSideD() {
        int firstComma = sides.indexOf(",") + 1;
        String newStr = sides.substring(firstComma); //"2.3, 4.56, 7.8901"
        firstComma = newStr.indexOf(",");
        newStr = sides.substring(firstComma);
        firstComma = newStr.indexOf(",");
        newStr = sides.substring(firstComma);
        firstComma = newStr.indexOf(",");
        String subStr = newStr.substring(0, firstComma);
        return Double.parseDouble(subStr);
    }

    public Quadrilateral() {
        this(0, 0, 0, 0);
    }
    public Quadrilateral(double sideA, double sideB, double sideC, double sideD) {
        super(4);
        sides = sideA + "," + sideB + "," + sideC + "," + sideD;
    }

    public abstract double area();

    public double perimeter() {
        return getSideA() + getSideB() + getSideC() + getSideD();
    }


}
