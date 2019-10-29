package com.diazbumma;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	    int[] myArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(Arrays.toString(myArray));
        reverse(myArray);
        System.out.println(Arrays.toString(myArray));
    }

    private static void reverse(int[] intArray) {
        int maxIndex = intArray.length-1;
        int midPoint = maxIndex/2;
        for (int i=0; i<midPoint;i++) {
            int temp;
            temp = intArray[i];
            intArray[i] = intArray[maxIndex];
            intArray[maxIndex] = temp;
            maxIndex--;
        }
    }
}
