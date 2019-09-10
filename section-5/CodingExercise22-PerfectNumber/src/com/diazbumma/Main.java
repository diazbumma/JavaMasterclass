package com.diazbumma;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(isPerfectNumber(6));
        System.out.println(isPerfectNumber(28));
        System.out.println(isPerfectNumber(5));
        System.out.println(isPerfectNumber(-1));
    }

    public static boolean isPerfectNumber(int number) {
        if (number < 1) {
            return false;
        } else {
            int perfect = 0;
            int temp = 1;
            while (temp < number) {
                if (number%temp == 0) {
                    perfect += temp;
                }
                temp++;
            }
            if (perfect == number) {
                return true;
            } else {
                return false;
            }
        }
    }
}
