package com.diazbumma;

public class Main {
    public static void main(String[] args) {
//        * hasTeen(9, 99, 19);  should return true since 19 is in range 13 - 19
//        * hasTeen(23, 15, 42);  should return true since 15 is in range 13 - 19
//        * hasTeen(22, 23, 34);  should return false since numbers 22, 23, 34 are not in range 13-19
        System.out.println(hasTeen(9, 99, 19));
        System.out.println(hasTeen(23, 15, 42));
        System.out.println(hasTeen(22, 23, 34));
    }

    public static boolean hasTeen(int firstValue, int secondValue, int thirdValue) {
        if (isTeen(firstValue)) {
            return true;
        } else if (isTeen(secondValue)) {
            return true;
        } else if (isTeen(thirdValue)) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isTeen(int value) {
        if ((value >= 13) && (value <= 19)) {
            return true;
        } else {
            return false;
        }
    }
}
