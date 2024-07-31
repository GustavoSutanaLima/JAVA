import java.util.Arrays;

public class PerfectNumber {
    public static boolean isPerfectNumber (int number) {
        if (number < 1) {
            return false;
        }
        else {
            int[] divisors = new int[number];

            int auxDivision = 1;
            int auxArray = 0;

            while(true) {
                if (number % auxDivision == 0) {
                    divisors[auxArray] = auxDivision;
                }
                auxArray++;
                auxDivision++;
                if (number / auxDivision == 1) {
                    break;
                }
            }
            return Arrays.stream(divisors).sum() == number;
        }
    }
}
