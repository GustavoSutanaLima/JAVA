public class EvenDigitSum {
    public static int getEvenDigitSum (int number) {
        if (number < 0) {
            return -1;
        }

        int digit = 0;
        int sumDigit = 0;

        do {
            digit = number % 10;
            number /= 10;
            if (digit % 2 == 0) {
                sumDigit += digit;
            }
        }
        while(number > 0);

        return sumDigit;
    }
}
