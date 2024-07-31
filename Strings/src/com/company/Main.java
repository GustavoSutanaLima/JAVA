package com.company;

public class Main {

    public static void main(String[] args) {
	    //byte; <
        //short; <
        //int; <<<
        //long; <<
        //float; <<
        //double; <<<
        //char; <
        //boolean; <<<

        // <<< - most used data types;
        // << - rarely used data types;
        // < - hardly ever used if used at all data types;

        //Strings in Java are not a primitive datatype but actually a Class;

        String myFirstStringEver = "This is me learning Java, I fell a little bit worried! ";
        System.out.println("my string is this: " + myFirstStringEver);

        myFirstStringEver = myFirstStringEver + "So much worried! ";
        System.out.println("my string is this: " + myFirstStringEver);

        myFirstStringEver = myFirstStringEver + "\u00A9 2022";
        System.out.println("my string is this: " + myFirstStringEver);

        String numberedString = "250.55";
        String numberedString2 = numberedString + "49.95"; // the plus sign, when operating Strings,
        // doesn't "add" the strings, you are actually appending them together;
        System.out.println(numberedString2); //besides that, everything between double quotes are
        //considered strings;

        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println(lastString);
        //when you try do add a string to an integer, the Java interpreter
        //converts this int value automatically into a string, that's why the result is 1050;
        double doubleNUmber = 120.35d;
        lastString = lastString + doubleNUmber;
        System.out.println(lastString);



    }
}
