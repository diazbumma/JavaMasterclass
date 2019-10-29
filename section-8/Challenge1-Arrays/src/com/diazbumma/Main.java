package com.diazbumma;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    // Create a program using arrays that sorts a list of integers in descending order.
    // Descending order is highest value to lowest.
    // In other words if the array had the values in it 106, 26, 81, 5, 15 your program should
    // ultimately have an array with 106,81,26, 15, 5 in it.
    // Set up the program so that the numbers to sort are read in from the keyboard.
    // Implement the following methods - getIntegers, printArray, and sortIntegers
    // getIntegers returns an array of entered integers from keyboard
    // printArray prints out the contents of the array
    // and sortIntegers should sort the array and return a new array containing the sorted numbers
    // you will have to figure out how to copy the array elements from the passed array into a new
    // array and sort them and return the new sorted array.

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myIntArray = getIntegers(scanner.nextInt());
        myIntArray = sortIntegers(myIntArray);
        printArray(myIntArray);
    }

    public static int[] getIntegers(int totalIndex) {
        int[] array = new int[totalIndex];
        for (int i=0; i<totalIndex; i++)
            array[i] = scanner.nextInt();
        return array;
    }

    public static void printArray(int[] values) {
        for (int val : values)
            System.out.println(val);
    }

    public static int[] sortIntegers(int[] values) {
        Arrays.sort(values);
        int[] descendingCopy = new int[values.length];
        int j = values.length-1;
        for (int i=0; i<values.length; i++) {
            descendingCopy[i] = values[j];
            j--;
        }
        return descendingCopy;
    }
}
