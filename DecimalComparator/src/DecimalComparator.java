public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double numberOne, double numberTwo) {
        int checkValueOne = (int) (numberOne*1000) % 1000;
        int checkValueTwo = (int) (numberTwo*1000) % 1000;
        int numberOneCasted = (int) numberOne;
        int numberTwoCasted = (int) numberTwo;
        boolean result;
        System.out.println("Value one: "+ checkValueOne + " Value two: " + checkValueTwo);
        if (checkValueOne == checkValueTwo && numberOneCasted == numberTwoCasted) {
            result = true;
        }
        else {
            result = false;
        }
        return result;
    }
}
