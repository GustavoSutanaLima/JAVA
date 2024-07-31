public class NumberPalindrome {
    public static boolean isPalindrome(int number) {

        //using the modulus of number in case it's negative;
        if (number < 0) {
            number *= -1;
        }
        int originalNumber = number;

        // this is gonna be the returned value
        int reverse = 0;

        // this is gonna store the last digit of a number;
        int lastDigit;

        // generating the reversed number;
        while(number > 0) {
            lastDigit = number % 10; // extracting the numbers
            reverse *= 10;           // multiplying the aux by 10;
            reverse += lastDigit;    // adding the last lastDigit to the reverse value;
            number /= 10;            // the original number is then divided by 10;
        }

        return originalNumber == reverse;

    }
}
