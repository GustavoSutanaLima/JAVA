public class ChallengeOne {

    public static void main (String[] args) {
        byte thisIsMyByteValue = 10;
        short thisIsMyShortValue = 20;
        int thisIsMyIntValue = 50;

        byte thisIsMyByteValue2 = (byte) (50000 + 10 * (thisIsMyIntValue + thisIsMyByteValue + thisIsMyShortValue));
        //the byte casting is necessary here because the expression value is way higher the the maximum value of the byte data type;

        long thisIsMyLongValue = 50000L + 10L * (thisIsMyIntValue + thisIsMyByteValue + thisIsMyShortValue);
        // this expression within parentheses is considered to be an whole number (int type); as a long number can "absorb" int numbers
        // (their range is greater then a int value's range) there's no need for casting here

        short thisIsMyShortValue2 = (short) (50000 + 10 + (thisIsMyIntValue + thisIsMyByteValue + thisIsMyShortValue));

        //as 50000 is already greater the the upper limit of the short type, casting will be necessary here

        System.out.println("My long value result was " + thisIsMyLongValue);
        System.out.println("My byte value result was " + thisIsMyByteValue2 );
        System.out.println("My shot value result was " + thisIsMyShortValue2);

        //IMPORTANT STUFF: keep in mind that casting, although it allows us to perform an operation without any syntax errors,
        //it doesn't necessarily means that arithmetic will actually work. In summary if you're working with different that types
        //you'll have to think about what kind of expressions you are actually dealing with, cause larger ranges can absorb lower
        //ranges but not the other way around?

        other();
    }
    static void other() {
        byte valueOne = 60;
        short valueTwo = 1000;
        int valueThree = valueOne + valueTwo;
        byte valueFour = (byte) valueThree; //although we casted this value to be a byte the sum is not mathematically correct;
        long valueFive = valueThree; // there's no need for casting int values to long values
        short valueSix = (short) valueThree; //here, we casted the value and the mathematical operation was correct, the
        //result was 1060 as expect because valueThree has a value within the range of short data type;
        System.out.println( "Testing value 1 = " + valueThree);
        System.out.println( "Testing value 2 = " + valueFour);
        System.out.println( "Testing value 3 = " + valueFive);
        System.out.println( "Testing value 4 = " + valueSix);
    }

}
