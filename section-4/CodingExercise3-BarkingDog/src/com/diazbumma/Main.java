package com.diazbumma;

public class Main {

    public static void main(String[] args) {
        System.out.println(shouldWakeUp(true, 1));
        System.out.println(shouldWakeUp(false, 2));
        System.out.println(shouldWakeUp(true, 8));
        System.out.println(shouldWakeUp(true, 23));
    }

    public static boolean shouldWakeUp(boolean isBarking, int hourOfDay) {
        if (isBarking && ((hourOfDay >= 0) && (hourOfDay <=23))) {
            if ((hourOfDay < 8) || (hourOfDay > 22)) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}
