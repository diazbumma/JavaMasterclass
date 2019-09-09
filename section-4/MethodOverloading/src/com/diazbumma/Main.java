package com.diazbumma;

public class Main {

    public static void main(String[] args) {
        System.out.println(calcFeetAndInchesToCentimeters(8));
        System.out.println(calcFeetAndInchesToCentimeters(6, 0));
    }


    // 1cm is equivalent to 0.39370 inches.
    // 1 inch = 2.54cm
    // 1 feet = 12 inch

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if (feet < 0 || (inches < 0 || inches > 12) ) {
            System.out.println("Invalid Data");
            return -1d;
        } else {
            double result = (inches * 2.54d);
            result += (feet * 12d * 2.54d);
            return result;
        }
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches < 0) {
            System.out.println("Invalid Data");
            return -1d;
        } else {
            return (inches * 2.54d);
        }
    }
}
