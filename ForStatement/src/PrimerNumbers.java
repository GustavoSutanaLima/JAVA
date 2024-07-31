import java.util.Arrays;

public class PrimerNumbers {
    public static void main(String[] args) {
        challengeThree(375, 589, 1);
    }
    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }
        for (int i = 2; i <= n/2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void challengeThree(int start, int finish, int incrementer) {
        if (finish - start < 0) {
            System.out.println("Invalid range");
        }
        else {
            int numberOfPrimeNumber = 0;
            //declaring an empty array of ints for the prime numbers;
            int[] primeNumbers = {};
            //declaring an empty array of ints for all the numbers checked;
            int[] numbers = {};
            for (int i = start; i<=finish; i+=incrementer) { //i+=incrementer == i = i + incrementer
                numbers = CustomArrays.addingAnElementToAnArray(numbers, i);
                if(isPrime(i) && i != 0) {
                    numberOfPrimeNumber++; //count the number of prime numbers;
                    primeNumbers = CustomArrays.addingAnElementToAnArray(primeNumbers,i); // store the value of the number on my array;

                }
                if(numberOfPrimeNumber>= 3) { //if the number of prime number is grater of equals 3, break out of the loop;
                    break;
                }
            }
            System.out.println("The maximum number of prime number has been reached!");
            System.out.println("For all the numbers checked: " + Arrays.toString(numbers));
            System.out.println("The prime numbers were: " + Arrays.toString(primeNumbers));
        }

    }

}
