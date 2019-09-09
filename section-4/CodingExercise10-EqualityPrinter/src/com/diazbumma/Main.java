package com.diazbumma;

public class Main {

    private static final String INVALID_VALUE_MESSAGE = "Invalid Value";
    private static final String ALL_EQUAL_MESSAGE = "All numbers are equal";
    private static final String ALL_DIFFERENT_MESSAGE = "All numbers are different";
    private static final String NEITHER_EQUAL_OR_DIFFERENT = "Neither all are equal or different";

    public static void main(String[] args) {
        printEqual(1, 1, 1);
        printEqual(1, 1, 2);
        printEqual(-1, -1, -1);
        printEqual(1, 2, 3);
    }

//    Write a method printEqual with 3 parameters of type int. The method should not return anything (void).
//    If one of the parameters is less than 0, print text "Invalid Value".
//    If all numbers are equal print text "All numbers are equal"
//    If all numbers are different print text "All numbers are different".
//    Otherwise, print "Neither all are equal or different".
//
//    EXAMPLES OF INPUT/OUTPUT:
//            * printEqual(1, 1, 1); should print text All numbers are equal
//            * printEqual(1, 1, 2); should print text Neither all are equal or different
//            * printEqual(-1, -1, -1); should print text Invalid Value
//            * printEqual(1, 2, 3); should print text All numbers are different
//
//    TIP: Be extremely careful about spaces in the printed message.
//            NOTES
//            * The solution will not be accepted if there are extra spaces.
//            * The method printEqual needs to be defined as public static like we have been doing so far in the course.
//            * Do not add main method to solution code.

    public static void printEqual(int a, int b, int c) {
        if ((a < 0) || ((b < 0) || (c < 0))) {
            System.out.println(INVALID_VALUE_MESSAGE);
        } else {
            if (a == b) {
                if (b == c) {
                    System.out.println(ALL_EQUAL_MESSAGE);
                } else {
                    System.out.println(NEITHER_EQUAL_OR_DIFFERENT);
                }
            } else {
                if (b == c) {
                    System.out.println(NEITHER_EQUAL_OR_DIFFERENT);
                } else {
                    if (a == c) {
                        System.out.println(NEITHER_EQUAL_OR_DIFFERENT);
                    } else {
                        System.out.println(ALL_DIFFERENT_MESSAGE);
                    }
                }
            }
        }
    }
}
