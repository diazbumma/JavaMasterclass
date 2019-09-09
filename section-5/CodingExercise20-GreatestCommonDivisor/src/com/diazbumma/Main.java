package com.diazbumma;

public class Main {

    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(25, 15));
        System.out.println(getGreatestCommonDivisor(12, 30));
        System.out.println(getGreatestCommonDivisor(9, 18));
        System.out.println(getGreatestCommonDivisor(81, 153));
    }

    public static int getGreatestCommonDivisor(int firstValue, int secondValue) {
        if (firstValue < 10 || secondValue < 10) {
            return -1;
        } else {
            if (firstValue > secondValue) {
                int temp = firstValue;
                firstValue = secondValue;
                secondValue = temp;
            }
            int gcd = 1;
            for (int i=1; i<=firstValue; i++) {
                if ((firstValue%i==0) && (secondValue%i==0)) {
                    gcd = i;
                }
            }
            return gcd;
        }
    }
}
