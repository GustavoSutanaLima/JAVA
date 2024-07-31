public class NumberToWords {
    public static void numberToWords (int number) {
        if (number < 0 ) {
            System.out.println("Invalid Value");
        }
        else {

            // getting the number of digits of the original number;
            int digitCounter = getDigitCount(number);

            //auxiliary variable for loop count;
            int loopCounter = 0;

            //reverting number: we have to do this because of the way we are typing the string;
            number = reverse(number);

            //array of words:
            String[] arrayOfWords = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};

            //extracting the last digit:
            int digits;

            while(number > 0) {
                digits = number % 10;
                number /= 10; // number = number / 10 ;
                for(int i = 0; i<=9; i++){
                    if (digits == i) {
                        System.out.print(arrayOfWords[i] + " ");
                    }
                }
                loopCounter++;
            }
            if(digitCounter > loopCounter){
                int auxPrint = digitCounter - loopCounter;
                for (int i = 0; i < auxPrint; i++) {
                    System.out.print(arrayOfWords[0] + " ");
                }
            }
            System.out.println(" ");
        }
    }
    public static int reverse(int number) {
        boolean flagNegativeNumber = false;
        if (number < 0) {
            number *= -1;
            flagNegativeNumber = true;
        }
        int digits;
        String stringDigits = ""; //defining am empty string;
        while(number > 0) {
            digits = number % 10;
            number /= 10;
            stringDigits += digits;
        }
        //the class Integer has a method called parseInt witch converts a String to an Integer primitive type;
        int result = Integer.parseInt(stringDigits);
        if(flagNegativeNumber) {
            result *= -1;
        }
        return result;
    }
    public static int getDigitCount (int number) {
        if (number < 0) {
            return -1;
        }
        int count = 0;
        do {
            number /= 10;
            count++;
        }
        while(number > 0);
        return count;
    }
}

