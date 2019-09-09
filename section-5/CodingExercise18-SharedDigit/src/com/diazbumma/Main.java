package com.diazbumma;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(hasSharedDigit(12, 23));
        System.out.println(hasSharedDigit(9, 99));
        System.out.println(hasSharedDigit(15, 55));
    }

    public static boolean hasSharedDigit(int firstValue, int secondValue) {
        if (((firstValue < 10) || (firstValue > 99)) || ((secondValue < 10) || (secondValue > 99))) {
            return false;
        } else {
            int firstValueHead = (firstValue / 10);
            int firstValueTail = (firstValue % 10);
            int secondValueHead = (secondValue / 10);
            int secondValueTail = (secondValue % 10);
            if ((firstValueHead == secondValueHead) || (firstValueHead == secondValueTail)) {
                return true;
            } else if ((firstValueTail == secondValueHead) || (firstValueTail == secondValueTail)) {
                return true;
            } else {
                return false;
            }
        }
    }
}
