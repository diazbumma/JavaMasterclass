package com.diazbumma;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(hasSameLastDigit(1, 1, 2));
        System.out.println(hasSameLastDigit(41, 22, 71));
        System.out.println(hasSameLastDigit(23, 32, 42));
        System.out.println(hasSameLastDigit(9, 99, 999));
    }

    public static boolean hasSameLastDigit(int firstValue, int secondValue, int thirdValue) {
       if (!(isValid(firstValue) && isValid(secondValue) && isValid(thirdValue))) {
            return false;
        } else {
            firstValue %= 10;
            secondValue %= 10;
            thirdValue %= 10;

            return (firstValue == secondValue || firstValue == thirdValue) || secondValue == thirdValue;
        }
    }

    public static boolean isValid(int value) {
        return value >= 10 && value <= 1000;
    }
}
