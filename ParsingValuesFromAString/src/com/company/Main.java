package com.company;

public class Main {

    public static void main(String[] args) {
	    /*
	    *** PARSING IN JAVA ***
	    Parsing is to read the value of one object to convert it to another type.
	    For example you may have a string with a value of "10".
	    Internally that string contains the Unicode characters '1' and '0' not the actual number 10.
	    The method "Integer.parseInt" takes that string value and returns a real number.
	     */

        /*
        Casting is changing the type of the variable.

        Parsing is 'examining' the string and assigning its logical value to some variable.

        (ADDITION: Well, they are related in a sense, because from far far away both can serve to 'convert' data,
        however, data is really converted ONLY in case of parsing)
         */

        String numberAsString = "2018";
        System.out.println("numberAsString= " + numberAsString);

        int number = Integer.parseInt(numberAsString); //<- Parsing a String into an Integer type: this is actually a number not a string;
        double numberTwo = Double.parseDouble(numberAsString); // <- Parsing a String into a Double type: this is actually a number not a string anymore;

        numberAsString += 1; //<- as numberAsString is actually a String, Java concatenates 1 to it;

        number += 1; // as number is a integer number Java adds 1 to it;

        System.out.println("numberAsString= " + numberAsString);
        System.out.println(number);

        //Parsing a string as an integer can result in an EXCEPTION if you try the following bellow:

        String numberAsStringTwo = "2823b";  // "2823b" is a valid string but it's not a valid number
        //trying to parse this string into an integer will result in a exception;
        // | | | |
        // | | | |
        // V V V V
        // *** TRY CATCH STATEMENT ***
        // It works similarly to IF-ELSE statement, but it's going to allow you continue with your code;
        // if your code hits an exception CATCH will run instead;
        // A A A A
        // | | | |
        // | | | |
        try {
            int tryingNumber = Integer.parseInt(numberAsStringTwo);
            System.out.println(tryingNumber);
        }
        catch (Exception e) {
            int tryingNumber = 0;
            System.out.println("An exception was caught therefore the value of the parsed number was set to: " + tryingNumber);
        }
    }
}
