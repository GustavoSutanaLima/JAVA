package com.company;

public class Main {

    public static void main(String[] args) {

        char myChar = 'D';
        // you can only store one character at a time, if u type more than one character, you will get an
        // error;
        // ALSO THIS IS IMPORTANT
        // single quotes are used for defining characters and double quotes are used
        // to define strings;
        char myUnicode = '\u0044'; // Internation Standard Code for representing more than the 26 conventional
        //character;
        char myCopyright = '\u00A9'; //as this is an char data type, it has to be typed with single quotes;
        System.out.println(myUnicode);
        System.out.println(myCopyright);

        boolean myTrueBooleanValue = true;
        boolean myFalseBooleanValue = false;

        //example of boolean variable usage:
        boolean isTheCustomerOverTwentyOneYearsOld = false;
        //this represents that the customer is not over TwentyOne Years old;
        //it's more useful when u use conditional value;

    }
}
