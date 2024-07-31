package com.company;

import java.util.List;

public class NumberInWord {
    public static void printNumberInWord (int wholeNumber) {
        //declaring an array of strings, with each element according to the number;
        String[] numbers = new String[] {"ZERO", "ONE", "TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT", "NINE"};
        //switch statement based on the entry number;
        switch (wholeNumber) {
            case 1: case 2: case 3: case 4: case 5: case 6: case 7: case 8: case 9: case 0: {
                System.out.println(numbers[wholeNumber]);
                break;
            }
            default:
                System.out.println("OTHER");
                break;
        }
    }
}

