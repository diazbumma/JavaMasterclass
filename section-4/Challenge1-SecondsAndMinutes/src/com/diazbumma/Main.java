package com.diazbumma;

public class Main {

    private static final String INVALID_VALUE_MESSAGE = "Invalid Value";
    private static final int HOUR_IN_SECOND = 3600;
    private static final int MINUTE_IN_SECOND = 60;

    public static void main(String[] args) {
        System.out.println(getDurationString(5, 10));
        System.out.println(getDurationString(72, 70));
        System.out.println(getDurationString(72, 56));
        System.out.println(getDurationString(500));
        System.out.println(getDurationString(3601));
    }

    public static String leadingZeroConversion(int value) {
        if (value < 10) {
            return ("0" + value);
        } else {
            return ("" + value);
        }
    }

    public static String getDurationString(int minute, int second) {
        if ((minute < 0) || (second < 0 || second > 59)) {
            return INVALID_VALUE_MESSAGE;
        } else {
            //calculate XXh YYm ZZs
            if (minute < 60) {
                return (leadingZeroConversion(minute) + "m " + leadingZeroConversion(second) + "s");
            } else {
                return (leadingZeroConversion(minute / MINUTE_IN_SECOND) + "h " +
                        leadingZeroConversion(minute % MINUTE_IN_SECOND) + "s " +
                        leadingZeroConversion(second) + "s");
            }
        }
    }

    public static String getDurationString(int second) {
        if (second < 0) {
            return INVALID_VALUE_MESSAGE;
        } else {
            //calculate XXh YYm ZZs
            if (second < MINUTE_IN_SECOND) {
                return (leadingZeroConversion(second)+"s");
            } else if (second < HOUR_IN_SECOND) {
                int minute = second / MINUTE_IN_SECOND;
                return (leadingZeroConversion(minute) + "m " + leadingZeroConversion(second % MINUTE_IN_SECOND) + "s");
            } else {
                int hour = second / HOUR_IN_SECOND;
                second -= (hour * HOUR_IN_SECOND);
                int minute = second / MINUTE_IN_SECOND;
                second -= (minute * MINUTE_IN_SECOND);
                return (leadingZeroConversion(hour) + "h " +
                        leadingZeroConversion(minute) + "m " +
                        leadingZeroConversion(second) + "s");
            }
        }
    }
}
