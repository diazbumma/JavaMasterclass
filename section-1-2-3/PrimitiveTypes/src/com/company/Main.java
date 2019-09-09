package com.company;

public class Main {

    public static void main(String[] args) {

        //byte
        //short
        //int
        //long
        //float
        //double
        //char
        //boolean
        //most used primitive data types are int, double, boolean
        //rarely used primitive data types are long, char
        //unrecommended primitive data types are byte, short, float. you must have a good reason to use these data types

	    int minValue = Integer.MIN_VALUE;
	    int maxValue = Integer.MAX_VALUE;
        System.out.println("The minimum value of Integer is: " + minValue);
        System.out.println("The maximum value of Integer is: " + maxValue);
        System.out.println("Busted MAX value of Integer: " + (maxValue+1)); //This case is called Overflow
        System.out.println("Busted MIN value of Integer: " + (minValue-1)); //This case is called Underflow
        int myValue = 2_147_483_647;
        System.out.println("Assigning value of integer literal with underscore: " + myValue);

        byte minByteValue = Byte.MIN_VALUE;
        byte maxByteValue = Byte.MAX_VALUE;
        System.out.println("The smallest value of Byte is: " + minByteValue);
        System.out.println("The bigest value of Byte is: " + maxByteValue);

        short minShortValue = Short.MIN_VALUE;
        short maxShortValue = Short.MAX_VALUE;
        System.out.println("The smallest value of Short is: " + minShortValue);
        System.out.println("The biggest value of Short is: " + maxShortValue);

        long minLongValue = Long.MIN_VALUE;
        long maxLongValue = Long.MAX_VALUE;
        System.out.println("The smallest value of Long is: " + minLongValue);
        System.out.println("The bigest value of Long is: " + maxLongValue);
        long myLongLiteralValue = 2_147_483_647_456L;
        System.out.println("Assigning value of long literal with underscore: " + myLongLiteralValue);

        short resultShortValue = (short) (maxShortValue / 2); //must cast to short because default literal value is integer
        System.out.println("Casted integer to short: " + resultShortValue);

        long resultLongValue = (maxShortValue / 2);
        System.out.println("Casted integer to long: " + resultShortValue);

        //recommended to use integer, instead of short or byte because its a default literal value by Java
        //you must have a good reason to not use integer
        //so we may not using too much casting in the code
        //this way also work in double precision float
        //we recommended to use double instead of float

        float floatMinValue = Float.MIN_VALUE;
        float floatMaxValue = Float.MAX_VALUE;
        System.out.println("Float min value is: " + floatMinValue);
        System.out.println("Float max value is: " + floatMaxValue);

        double doubleMinValue = Float.MIN_VALUE;
        double doubleMaxValue = Float.MAX_VALUE;
        System.out.println("Double min value is: " + doubleMinValue);
        System.out.println("Double max value is: " + doubleMaxValue);

        float myFloatValue = 5.25f;
        double myDoubleValue = 5.25d;
        float newFloat = (float) myDoubleValue;
        int myIntValue = (int) myFloatValue;
        int mySecondIntValue = (int) myDoubleValue;
        System.out.println("Casted float from double: " + newFloat);
        System.out.println("Casted int from float: " + myIntValue);
        System.out.println("Casted int from double: " + mySecondIntValue);

        char myChar = 'G';
        char myUnicode = '\u0047';
        char myAscii = 71;
        char copyright = '\u00A9';

        System.out.println("Char by character literal " + myChar);
        System.out.println("Char by unicode literal " + myUnicode);
        System.out.println("Char by ascii integer literal " + myAscii);
        System.out.println("Char by unicode literal, print copyright " + copyright);

        boolean isCustomerOverTwentyOne = false;
        System.out.println(isCustomerOverTwentyOne);

        if (isCustomerOverTwentyOne) {
            System.out.println("Customer is over twenty one years old");
        } else {
            System.out.println("Customer is not over twenty one years old");
        }
    }
}
