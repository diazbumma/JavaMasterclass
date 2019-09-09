package com.diazbumma;

public class Overloading {

    public static void main(String[] args) {
        System.out.println("sum of 2, 6, 5 is " + sumNumber(2, 6, 5));
        System.out.println("sum of 8, 9 is " + sumNumber(8, 9));
        System.out.println("sum of two double " + sumNumber(14.5d, 12.1d));
    }

    public static int sumNumber(int a, int b, int c) {
        return (a + b + c);
    }

    public static int sumNumber(int a, int b) {
        return (a + b);
    }

    public static double sumNumber(double a, double b) {
        return (a + b);
    }
}
