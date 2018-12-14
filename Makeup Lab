package com.company;

public class MakeUpLab {
    // Instance Variables
    private int binNumber;
    private int[] binArray = new int[8];

    // Constructors
    public MakeUpLab(int binaryNumber) {
        for (int i = 0; i < 8; i++){
            binArray[i] = binaryNumber / (int) Math.pow(10, 7 - i) % 10;
        }
    }

    public MakeUpLab(String binaryNumber){
        for (int i = 0; i < 8; i++) {
            String digit = binaryNumber.substring(i, i + 1);
            if (digit.compareTo("O") == 0)
                binArray[i] = 0;
            if (digit.compareTo("1") == 0)
                binArray[i] = 1;
        }
    }

    // Accessor Functions
    public int intValue() {
        int rv = 0;
        int digit = 64;

        if (binArray[0] == 1)
            rv += -128;

        for (int i = 1; i < 8; i++) {
            if (binArray[i] == 1)
                rv = rv + digit;
            digit /= 2;
        }
        return rv;
    }

    public int[] doubleValue(){
        int[] rv = new int[2];
        int exponent = 0;
        int mantissa = 0;

        if (binArray[0] == 1)
            exponent = -8;
        if (binArray[4] == 1)
            mantissa = -8;

        int digit1 = 4;
        for (int i = 1; i < 4; i++) {
            if (binArray[i] == 1)
                exponent += digit1;
            digit1 /= 2;
        }

        int digit2 = 4;
        for (int j = 5; j < 8; j++) {
            if (binArray[j] == 1)
                mantissa += digit2;
            digit2 /= 2;
        }

        rv[0] = exponent;
        rv[1] = mantissa;

        return rv;
    }

    // Conversion Functions
    public void setIntValue(int a){
        int store = a;

        if (a < 0) {
            binArray[0] = 1;
            store += 128;
            for (int i = (binArray.length - 1); i >= 0; i--) {
                if (Math.abs(store) % 2 == 1)
                    binArray[i] = 1;
                store /= 2;
            }
        } else {
            for (int i = (binArray.length - 1); i >= 0; i--) {
                if (Math.abs(store) % 2 == 1)
                    binArray[i] = 1;
                store /= 2;
            }
        }
    }

    public static int[] appendArray(int[] a, int[] b) {
        int[] newArray = new int[a.length + b.length];
        for (int i = 0; i < a.length; i++) {
            newArray[i] = a[i];
        }

        for (int i = a.length; i < newArray.length; i++) {

            newArray[i] = b[i - a.length];
        }
        return newArray;
    }

    public static int[] mantisExpArray(int a){
        int[] rvArray = new int[4];
        int sum = 0,subNum;
        if (a < 0) {
            rvArray[0] = 1;
            sum -= 8;
        }
        for (int i = 1;i<rvArray.length;i++) {
            subNum = (int) Math.pow(2, 3 - i);
            if (a >= sum + subNum){
                sum += subNum;
                rvArray[i] = 1;
            }
            else
                rvArray[i] = 0;
        }
        return rvArray;
    }

    public void setDoubleValue(double a){
        double b=a,exp=0,mantis;
        System.out.println(b);
        while(b!=(int)b){
            b = b*2;
            exp -= 1;
        }
        mantis = b;
        System.out.println(exp);
        int[] mantisArray,expArray;
        mantisArray = mantisExpArray((int)mantis);
        expArray = mantisExpArray((int)exp);

        binArray = appendArray(expArray,mantisArray);

    }
}
