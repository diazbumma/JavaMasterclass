package com.diazbumma;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int i = 1;
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        while (i<=10) {
            System.out.println("Enter number #" + i + ": ");
            if (scanner.hasNextInt()) {
                sum += scanner.nextInt();
                i++;
            } else {
                System.out.println("Invalid Number");
            }
            scanner.nextLine();
        }
        System.out.println(sum);
        scanner.close();
    }
}
