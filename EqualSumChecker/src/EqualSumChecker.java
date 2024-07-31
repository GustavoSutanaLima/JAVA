public class EqualSumChecker {
    public static boolean hasEqualSum(int firstValue, int secondValue, int thirdValue) {
        //boolean checkValue = firstValue + secondValue == thirdValue;
        //it's possible to verify if a certain condition is true or false
        //without actually using if else;

        //in the statement above, i have a condition that checks if the thirdValue is
        //equals the sum of the first and second values. if the sum is equal to third value,
        //checkValue BOOLEAN variable is assigned with value TRUE, if not it gets the value
        //FALSE;
        return firstValue + secondValue == thirdValue;
    }
}
