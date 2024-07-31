package com.company;

import java.util.Locale;

public class Challenges {
    public static void switchChar (char entryCharacter) {
        switch (entryCharacter) {
            // these case statements are the same as if ( entryCharacter == A || ... || entryCharacter == E )
            case 'A': case 'B': case 'C': case 'D': case 'E': {
                System.out.println("The character "+ entryCharacter + " was found!");
                break; //<<-- DON'T FORGET ABOUT THE BREAK STATEMENT OR ELSE IT WON'T WORK CORRECTLY;
            }
            default:
                System.out.println("Character not found");
                break;
        }
    }
    public static void switchString (String entryString) {
        switch (entryString.toLowerCase()) { //toLowerCase() is a String method that gets my string and converts every character of it to a lower case;
            case "my name":{
                System.out.println("My name is Gustavo!");
                break;
            }
            case "her name": {
                System.out.println("Her name is Letícia");
                break;
            }
            default: {
                System.out.println("Neither name was found!");
                break;
            }
        }
    }
    public static void printDayOfTheWeek (int day) {
        switch (day) {
            case 0: {
                System.out.println("Sunday");
                break;
            }
            case 1: {
                System.out.println("Monday");
                break;
            }
            case 2: {
                System.out.println("Tuesday");
                break;
            }
            case 3: {
                System.out.println("Wednesday");
                break;
            }
            case 4: {
                System.out.println("Thursday");
                break;
            }
            case 5: {
                System.out.println("Friday");
                break;
            }
            case 6: {
                System.out.println("Saturday");
                break;
            }
            default: {
                System.out.println("Invalid day.");
                break;
            }
        }
    }
    static public void printDayOfTheWeekTwo (int day) {
        if (day == 0) {
            System.out.println("Sunday");
        }
        else if (day == 2) {
            System.out.println("Tuesday");
        }
        else if (day == 3) {
            System.out.println("Wednesday");
        }
        else if (day == 4) {
            System.out.println("Thursday");
        }
        else if (day == 5) {
            System.out.println("Friday");
        }
        else if (day == 6) {
            System.out.println("Saturday");
        }
        else if (day == 1) {
            System.out.println("Monday");
        }
        else {
            System.out.println("Invalid day.");
        }
    }
}
