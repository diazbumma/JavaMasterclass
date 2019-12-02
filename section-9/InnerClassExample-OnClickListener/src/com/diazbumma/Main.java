package com.diazbumma;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static Button myButton = new Button("Android App");

    public static void main(String[] args) {
	    myButton.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(String title) {
                System.out.println(title + " button clicked");
            }
        });
	    action();
    }

    public static void action() {
        boolean quit = false;
        while (!quit) {
            System.out.println("0. Quit\n" +
                    "1. Touch button\n" +
                    "Select: ");
            int select = scanner.nextInt();
            switch (select) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    myButton.onClick();
                    break;
            }
        }
    }
}
