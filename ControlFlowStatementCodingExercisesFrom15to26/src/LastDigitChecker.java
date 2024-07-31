public class LastDigitChecker {
    public static boolean hasSameLastDigit (int numberOne, int numberTwo, int numberThree) {
        if(!isValid(numberOne) || !isValid(numberTwo) || !isValid(numberThree)) {
            return false;
        }

        int[] lastDigits = new int[3]; //creates an empty array with the size 3;
        int[] numbers = {numberOne, numberTwo, numberThree};

        for (int i = 0; i < 3; i++) {
            lastDigits[i] = numbers[i] % 10;
        }

        int i = 0;
        int j = 0;

        while(i < lastDigits.length) {
            System.out.println(lastDigits[i]);
                while(j+1 < lastDigits.length) {
                    System.out.println(" -> " +lastDigits[j+1]);
                        if (lastDigits [i] == lastDigits [j + 1]) {
                            return true;
                        }
                    j++;
                }
            i++;
            j = i;
        }

        return false;
    }

    public static boolean isValid(int number) {
        return number >= 10 && number <= 1000;
    }

    public static boolean hasSameLastDigit (int[] numbers) {
        for (int elements : numbers) {
            if(!isValid(elements)) {
                return false;
            }
        }

        //generates the arrays of with the last number;
        int[] lastDigits = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            lastDigits[i] = numbers[i] % 10;
        }

        int i = 0;
        int j = 0;

        while(i < lastDigits.length) {
            System.out.println(lastDigits[i]);
            while(j+1 < lastDigits.length) {
                System.out.println(" -> " +lastDigits[j+1]);
                if (lastDigits [i] == lastDigits [j + 1]) {
                    return true;
                }
                j++;
            }
            i++;
            j = i;
        }

        return false;
    }
}


