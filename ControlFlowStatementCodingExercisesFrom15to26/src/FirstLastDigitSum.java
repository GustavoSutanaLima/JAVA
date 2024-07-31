public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit (int number) {

        if (number < 0) {
            return -1;
        }

        if (number < 10) {
            return number*2;
        }
        else {
            int lastDigit = number % 10;
            number /=10;
            int firstDigit = 0;

            while(number > 0){
                firstDigit = number % 10;
                number /=10;
            }
            return firstDigit + lastDigit;
        }
    }
}