package com.diazbumma;

public class Main {
    
    public static void main(String[] args) {
        //primitive recap
        byte byteValue = 8;
        byte byteMinValue = Byte.MIN_VALUE; //Wrapper class
        byte byteMaxValue = Byte.MAX_VALUE; //Wrapper class
        byte underflowMinvalue = (byte) (byteMinValue - 1);
        byte overflowMaxValue = (byte) (byteMaxValue + 1);
        System.out.println("Byte value is " + byteValue);
        System.out.println("Byte minimum value is " + byteMinValue);
        System.out.println("Byte maximum value is" + byteMaxValue);
        System.out.println("Underflow byte value " + underflowMinvalue);
        System.out.println("Overflow byte value " + overflowMaxValue);
        
        short shortValue = 9;
        short shortMinValue = Short.MIN_VALUE;
        short shortMaxValue = Short.MAX_VALUE;
        System.out.println("Short value is " + shortValue);
        System.out.println("Short minimum value is " + shortMinValue);
        System.out.println("Short maximum value is" + shortMaxValue);
        
        int intValue = 10;
        int intMinValue = Integer.MIN_VALUE;
        int intMaxValue = Integer.MAX_VALUE;
        System.out.println("Integer value is " + intValue);
        System.out.println("Integer minimum value is " + intMinValue);
        System.out.println("Integer maximum value is" + intMaxValue);
        
        long longValue = 15L;
        long longMinValue = Long.MIN_VALUE;
        long longMaxValue = Long.MAX_VALUE;
        System.out.println("Long value is " + longValue);
        System.out.println("Long minimum value is " + longMinValue);
        System.out.println("Long maximum value is" + longMaxValue);
        
        float floatValue = 34.7f;
        float floatMinValue = Float.MIN_VALUE;
        float floatMaxValue = Float.MAX_VALUE;
        System.out.println("Float value is " + floatValue);
        System.out.println("Float minimum value is " + floatMinValue);
        System.out.println("Float maximum value is" + floatMaxValue);
        
        double doubleValue = 35.9d;
        double doubleMinValue = Double.MIN_VALUE;
        double doubleMaxValue = Double.MAX_VALUE;
        System.out.println("Double value is " + doubleValue);
        System.out.println("Double minimum value is " + doubleMinValue);
        System.out.println("Double maximum value is" + doubleMaxValue);
        
        char charByAsciiValue = 71;
        char charByUnicodeValue = '\u0047';
        char charByCharLiteralValue = 'G';
        int charMinValue = Character.MIN_VALUE; //by Ascii integer
        int charMaxValue = Character.MAX_VALUE; //by Ascii integer
        System.out.println("Assigning char by Ascii value " + charByAsciiValue);
        System.out.println("Assigning char by Unicode value " + charByUnicodeValue);
        System.out.println("Assigning char by Char literal value " + charByCharLiteralValue);
        System.out.println("Char minimum value is " + charMinValue);
        System.out.println("Char maximum value is " + charMaxValue);

        boolean isMyAgeIsOver21 = true;
        System.out.println("Is my age over 21?" + isMyAgeIsOver21);

        String stringValue = "Hello World!";
        System.out.println(stringValue);
        String stringValueMore = "I am Diaz";
        System.out.println(stringValue + " " + stringValueMore);
        String copyright = "\u00A9 2019";
        System.out.println(stringValue + " " + stringValueMore + " " + copyright);
        String numberString = "10";
        int intConvertString = 20;
        System.out.println(numberString + intConvertString);
        double doubleConvertString = 98.23d;
        System.out.println(numberString + doubleConvertString);
    }
}
