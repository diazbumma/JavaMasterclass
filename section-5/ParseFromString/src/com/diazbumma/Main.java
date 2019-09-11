package com.diazbumma;

public class Main {

    public static void main(String[] args) {
        String numberAsString = "2018";
        int number = Integer.parseInt(numberAsString);
        number += 22;
        numberAsString += 1;
        System.out.println(number);
        System.out.println(numberAsString);
    }
}
