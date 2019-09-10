package com.diazbumma;

public class Main {

    public static void main(String[] args) {
	// write your code here
        printFactors(6);
        printFactors(32);
        printFactors(10);
        printFactors(-1);
    }

    public static void printFactors(int number) {
        if (number < 1) {
            System.out.println("Invalid Value");
        } else {
            int i = 1;
            while (i <= number) {
                if (number%i == 0) {
                    System.out.println(i);
                }
                i++;
            }
        }
    }
}
