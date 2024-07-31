public class DigitSumChallenge {
    public static void main(String[] args) {
        printSumOfNumber(123);
        printSumOfNumber(12);
        printSumOfNumber(-12);
        printSumOfNumber(32123);
    }

    public static int sumDigits (int number) {
        //if the number is less than 10 the return value must be minus one;
        if (number < 10) {
            return -1;
        }

        //this is my auxiliary variable, it starts at zero;
        int adder = 0;

        //I need to get the remainder of the division of my entry number by 10 and add to my add variable;
        //Then I'll get the original number and assign to its variable the result of the division by 10;
        //and I want to continue doing while (DO-WHILE) number is grater than ZERO;
        do {
            adder += number % 10;
            number /= 10; // is the same as number = number / 10;
        }
        while(number > 0);

        return adder;
    }

    public static void printSumOfNumber (int number) {
        if (number >= 10){
            System.out.println("The sum of the digits of " + number + " is: " + sumDigits(number));
        }
        else {
            System.out.println("The sum of the digits of " + number + " is: INVALID");
        }
    }
}
