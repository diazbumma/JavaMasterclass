package com.company;

public class Main {

    public static void main(String[] args) {
	    int value = 1;
	    switch (value) {
            case 1:
                System.out.println("This value is one");
                break;
            case 2:
                System.out.println("This value is two");
                break;
            case 3:
                System.out.println("This value is three");
                break;
            case 4: case 5: case 6:
                System.out.println("This value can be 4, 5, or 6");
                System.out.println("But actually " + value);
                break;
            default:
                System.out.println("Unidentified value");
                break;
        }
    }
}
