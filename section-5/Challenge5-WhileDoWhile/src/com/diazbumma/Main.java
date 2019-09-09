package com.diazbumma;

public class Main {

    public static void main(String[] args) {

        /*int i = 0;
        int counter = 0;
        do {
            i++;
            if (isEvenNumber(i)) {
                System.out.println("Even number " + i);
                counter++;
            }
        } while (counter != 5);*/

        int number = 4;
        //int finishNumber = 20;
        int counter = 0;

        while (counter < 5) {
            number++;
            if (!isEvenNumber(number)) {
                continue;
            }

            System.out.println("Even number " + number);
            counter++;
        }
    }

    // Create a method called isEvenNumber that takes a parameter of type int
    // Its purpose is to determine if the argument passed to the method is
    // an even number or not.
    // return true if an even number, otherwise return false;

    public static boolean isEvenNumber(int value) {
        if (value % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
