package com.diazbumma;

public class Main {

    public static void main(String[] args) {
	// write your code here
        char value = 'G';
        switch (value) {
            case 'A':
                System.out.println("Found A");
                break;
            case 'B':
                System.out.println("Found B");
                break;
            case 'C':
                System.out.println("Found C");
                break;
            case 'D':
                System.out.println("Found D");
                break;
            case 'E':
                System.out.println("Found E");
                break;
            case 'F': case 'G': case 'H':
                System.out.println(value + " was found");
                break;
            default:
                System.out.println("Not Found");
                break;
        }
        String monthValue = "January";
        switch (monthValue.toLowerCase()) {
            case "january":
                System.out.println("jan");
                break;
            case "september":
                System.out.println("Happy Birthday");
                break;
            default:
                System.out.println("not sure");
                break;
        }
    }

    // Create a new switch statement using char instead of int
    // create a new char variable
    // create a switch statement testing for
    // A, B, C, D, or E
    // display a message if any of these are found and then break
    // Add a default which displays a message saying not found
}
