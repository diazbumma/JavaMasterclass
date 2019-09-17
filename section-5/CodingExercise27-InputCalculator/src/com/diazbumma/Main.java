package com.diazbumma;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage() {
        int i = 0;
        int sum = 0;
        long avg = 0;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int temp;
            if (scanner.hasNextInt()) {
                temp = scanner.nextInt();
                sum += temp;
                i++;
            } else {
                if (i!=0) {
                    avg = (long) Math.round((double) sum/i) ;
                }
                System.out.println("SUM = "+ sum + " AVG = " + avg);
                break;
            }
            scanner.nextLine();
        }
        scanner.close();
    }
}
