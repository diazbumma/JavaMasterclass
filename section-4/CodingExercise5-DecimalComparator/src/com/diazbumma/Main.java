package com.diazbumma;

public class Main {
    public static void main(String[] args) {
//        * areEqualByThreeDecimalPlaces(-3.1756, -3.175); → should return true since numbers are equal up to 3 decimal places.
//        * areEqualByThreeDecimalPlaces(3.175, 3.176); → should return false since numbers are not equal up to 3 decimal places
//        * areEqualByThreeDecimalPlaces(3.0, 3.0); → should return true since numbers are equal up to 3 decimal places.
//        * areEqualByThreeDecimalPlaces(-3.123, 3.123); → should return false since numbers are not equal up to 3 decimal places.
        System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.175));
        System.out.println(areEqualByThreeDecimalPlaces(3.175, 3.176));
        System.out.println(areEqualByThreeDecimalPlaces(3.0, 3.0));
        System.out.println(areEqualByThreeDecimalPlaces(-3.123, 3.123));
        System.out.println(areEqualByThreeDecimalPlaces(3.174, 3.175));
    }

    public static boolean areEqualByThreeDecimalPlaces(double firstValue, double secondValue) {
        float difference = (float) (firstValue - secondValue);
        if (difference < 0) {
            difference *= -1;
        }
        if (difference < 0.001) {
            return true;
        } else {
            return false;
        }
    }
}