package com.diazbumma;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(sumFirstAndLastDigit(252));
        System.out.println(sumFirstAndLastDigit(257));
        System.out.println(sumFirstAndLastDigit(0));
        System.out.println(sumFirstAndLastDigit(5));
        System.out.println(sumFirstAndLastDigit(-10));
    }

    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        } else if (number < 10) {
            return (number*2);
        } else {
            int temp = 0;
            int rear = (number % 10);
            while (number != 0) {
                temp = (number % 10);
                number /= 10;
            }
            return (temp + rear);
        }
    }
}
