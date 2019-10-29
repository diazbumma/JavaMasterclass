package com.diazbumma;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int result = findMin(readIntegers(scanner.nextInt()));
        System.out.println("min = " + result);
    }

    private static int findMin(int[] intArray) {
        int min = intArray[0];
        for (int value : intArray)
            if (value < min)
                min = value;
        return min;
    }

    private static int[] readIntegers(int totalIndexes) {
        int[] intArray = new int[totalIndexes];
        for (int i=0; i<intArray.length; i++)
            intArray[i] = scanner.nextInt();
        return intArray;
    }
}
