package com.diazbumma;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(getEvenDigitSum(123456789));
        System.out.println(getEvenDigitSum(252));
        System.out.println(getEvenDigitSum(-22));
    }

    public static int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1;
        } else {
            int sum = 0;
            while (number != 0) {
                sum += ((number % 10) % 2 == 0) ? (number % 10) : 0;
                number /= 10;
            }
            return sum;
        }
    }
}
