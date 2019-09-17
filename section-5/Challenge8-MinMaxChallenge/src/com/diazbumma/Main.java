package com.diazbumma;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    int min = 0;
	    int max = 0;
        int i = 0;
        Scanner scanner = new Scanner(System.in);
	    while (i<10) {
            System.out.println("Enter number: ");
	        if (scanner.hasNextInt()) {
	            int temp = scanner.nextInt();
	            if (i==0) {
	                min = temp;
	                max = temp;
                }
	            if (temp > max) {
                    max = temp;
                }
	            if (temp < min) {
	                min = temp;
                }
                i++;
            } else {
                System.out.println("Invalid Value");
            }
	        scanner.nextLine();
        }
        System.out.println("Minimun value is " + min);
        System.out.println("Maximum value is " + max);
	    scanner.close();
    }
}
