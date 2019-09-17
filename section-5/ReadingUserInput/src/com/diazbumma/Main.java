package com.diazbumma;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your year of birth: ");


        int year = scanner.nextInt();
        scanner.nextLine(); // handle the enter key character

        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        int age = 2019-year;

        System.out.println("Your name is " + name + " and you are " + age + " years old.");
        scanner.close();
    }
}
