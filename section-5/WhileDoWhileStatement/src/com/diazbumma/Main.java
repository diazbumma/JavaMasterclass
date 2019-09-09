package com.diazbumma;

public class Main {

    public static void main(String[] args) {

        int i = 0;
        while (i != 7) {
            System.out.println("Loop count " + i);
            i++;
        }
        System.out.println("====================");

        // identical with this
        for (i=1; i<7; i++) {
            System.out.println("Loop count " + i);
        }
        System.out.println("====================");

        i=0;
        do {
            System.out.println("Loop count " + i);
            i++;
        } while(i != 1);
    }
}
