package com.company;

public class Main {

    public static void main(String[] args) {

        // primitive types challenge
        byte myByteValue = 123;
        short myShortValue = 30_000;
        int myIntValue = 7_000_000;

        long resLongValue = (50_000 + (10 * (myByteValue + myShortValue + myIntValue)));
        System.out.println(resLongValue);

        double pound = 42d;
        double kilogram = (pound * 0.45359237);
        System.out.println("42 pound is equal to " + kilogram + " kilograms");

        // operator precedence challenge
        // http://www.cs.bilkent.edu.tr/~guvenir/courses/CS101/op_precedence.html
        double firstValue = 20.00d;
        double secondValue = 80.00d;
        double result = (firstValue + secondValue) * 100.00d;
        double remainder = result % 40.00;
        boolean hasRemainder = remainder != 0.00d ? true : false;
        System.out.println("isZeroRemainder " + hasRemainder);
        if (hasRemainder) {
            System.out.println("Got some remainder");
        } else {
            System.out.println("No Remainder");
        }
    }
}
