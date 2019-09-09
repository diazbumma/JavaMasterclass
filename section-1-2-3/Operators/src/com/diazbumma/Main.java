package com.diazbumma;

public class Main {

    public static void main(String[] args) {

        int result = 15 + 10; // 15 + 10 = 25
        System.out.println("15 + 10 = " + result);

        int previousResult = result;
        result = result - 5; // 25 - 5 = 20
        System.out.println("25 - 5 = " + result);
        System.out.println("Previous result = " + previousResult);

        result = result * 4; // 20 * 4 = 80
        System.out.println("20 * 4 = " + result);

        result = result / 5; // 80 / 5 = 16
        System.out.println("80 / 5 = " + result);

        result = result % 5; // 16 % 5 = 1
        System.out.println("16 % 5 = " + result);

        //abbreviating operators
        System.out.println("Abbreviating operators");
        result++; // increment
        System.out.println("1 + 1 = " + result);

        result--; // decrement
        System.out.println("2 - 1 = " + result);

        result += 2; // 1 + 2 = 3
        System.out.println("1 + 2 = " + result);

        result -= 2; // 3 - 2 = 1
        System.out.println("3 - 2 = " + result);

        result *= 10; // 1 * 10 = 10
        System.out.println("1 * 10 = " + result);

        result /= 2; // 10 / 2 = 5
        System.out.println("10 / 2 = " + result);

        boolean isAlien = false;
        if (isAlien) {
            System.out.println("I'm afraid of alien");
        } else {
            System.out.println("Nothing to worry");
        }

        int score = 100;
        if (score == 100) {
            System.out.println("High score! Congratulations!");
        } else {
            System.out.println("Please try again");
        }

        int newScore = 60;
        if ((newScore <= 80) && (newScore > 50)) {
            System.out.println("Not bad");
        } else {
            System.out.println("Try again");
        }

        boolean isCar = true;
        if (!isCar) {
            System.out.println("Please use helmet for your own safety");
        } else {
            System.out.println("Please fasten your seatbelt for safety");
        }

        //ternary operator
        boolean wasCar = isCar ? true : false;
        if (wasCar) {
            System.out.println("wasCar is true");
        } else {
            System.out.println("wasCar is false");
        }
        int age = 16;
        boolean isUnderAge = age >= 18 ? false : true;
        if (isUnderAge) {
            System.out.println("Don't drive");
        } else {
            System.out.println("Get a driver license");
        }

        int myNumber = 10;
        String mark = myNumber > 100 ? "Excelent point" : "Need improvement" ;
        System.out.println(mark);

        // summary of all operators
        // https://docs.oracle.com/javase/tutorial/java/nutsandbolts/opsummary.html
    }
}
