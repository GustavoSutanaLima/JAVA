public class Main {
    public static void main(String[] args) {

        int myValue = 10000;
        int myMinValue = Integer.MIN_VALUE;
        int myMaxValue = Integer.MAX_VALUE;

        System.out.println("My min value is = " + myMinValue); //when you sum a literal string with an int value the int value is converted into a string;
        System.out.println("My max Value is = " + myMaxValue);
        System.out.println("OVERFLOWED VALUE " + (myMaxValue + 1)); //overflow, the result is not what you expected because you've reached the maximum value and are trying to add this value by one
        System.out.println("UNDERFLOWED VALUE " + (myMinValue - 1)); //underflow, the result is also not what you expected, because you've reached the minimum value this time;

        int myUnderScoreValue = 2_147_483_647; // a different but useful way to declare large number on java (JDK 7 or higher);
        System.out.println("Underscore declaration (but of course its representation is the same when the code runs) "+ myUnderScoreValue);
        System.out.println(myValue);

        byte myMinByteValue = Byte.MIN_VALUE; // Minimum and maximum range for BYTE values;
        byte myMaxByteValue = Byte.MAX_VALUE; //
        System.out.println("My Byte Min value = " + myMinByteValue);
        System.out.println("My Byte Max value = " + myMaxByteValue);

        short myMinShortValue = Short.MIN_VALUE; // Minimum and maximum range for SHORT values;
        short myMaxShortValue = Short.MAX_VALUE; //
        System.out.println("My Short Min value = " + myMinShortValue);
        System.out.println("My Short Max value = " + myMaxShortValue);
        
        long myLongValue = 100L; //to identify and properly declare a long value u have to type and L (usually uppercase) by the end of the value;
                                //therefore, this forces Java to treat it like a long number;
        long myMinLongValue = Long.MIN_VALUE; // Minimum and maximum range for SHORT values;
        long myMaxLongValue = Long.MAX_VALUE; //
        System.out.println("My Long Min value = " + myMinLongValue);
        System.out.println("My Long Max value = " + myMaxLongValue);
        long bigLongLiteralValue = 2_147_473_647_125L; // if you remove the L here you'll get an error because the Java Language
        //understands this value without and L as an integer; You'll be safe if this value in within the range of the the int type
        //but if that's untrue u gonna have to put "L" by its end in order for it to work properly;
        System.out.println(bigLongLiteralValue);

        short myBigShortValue = 32767;
        System.out.println(myBigShortValue);

        //CASTING CONCEPT

        int myTotal = myMaxValue/2;
        System.out.println(myTotal);

        byte myTotalByte = (byte) (myMaxByteValue/2); //when you're performing some kind of arithmetic, Java understands this operation as if was an int, this is just a default setting;
        System.out.println(myTotalByte); //therefore you need to cast (convert this value to the correct data type);
        // this is done by typing the the correct type of number in front of the expression - THE EXPRESSION MUST BE WITHIN PARENTHESES;
        // if you type "(byte)" out of the statement java wont interpret the value and a byte but as an int;

        short myNewShortValue = (short) (myMinShortValue*2);
    }
}