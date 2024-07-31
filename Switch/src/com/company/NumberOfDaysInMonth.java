package com.company;
import java.util.List;

public class NumberOfDaysInMonth {
    public static boolean isLeapYear (int year) {
        boolean myAuxValue;
        if (year < 1 || year > 9999) {
            myAuxValue = false;
        }
        else if (year % 4 == 0 && ((year % 100 == 0 && year % 400 == 0) || (year % 100 != 0)) ){
            myAuxValue = true; //if all this conditions are met the year is a leap year (366 days);
        }
        else if (year % 4 != 0){
            myAuxValue = false;
        }
        else if (year % 100 == 0 && year % 400 == 0) {
            myAuxValue = true;
        }
        else {
            myAuxValue = false;
        }
        return myAuxValue;
    }
    public static int getDaysInMonth(int month, int year) {
        if (month <= 0 || month > 12 || year < 1 || year > 9999 ) {
            return -1;
        }
        if (isLeapYear(year) && month == 2) {
            return 29;
        }
        else if (!isLeapYear(year) && month == 2) {
            return 28;
        } else {
            switch (month) {
                case 1: case 3: case 5: case 7: case 8: case 10: case 12: {
                    return 31;
                }
                default:
                    return 30;
            }
        }

    }
}