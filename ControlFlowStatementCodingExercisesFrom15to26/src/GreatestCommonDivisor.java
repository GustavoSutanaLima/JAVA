public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10) {
            return -1;
        }
        else {
        int minimumNumber;
        int auxFirst = first;
        int auxSecond = second;
        int auxDivision = 2;
        int divisor;

        //doing the LCM:
        int leastCommonMultiple = 1 ;

        while(true) {
            if (first != 1 && second != 1) {
                minimumNumber = Math.min(first, second);// gets the lowest value between first and second;
            }
            else {
                minimumNumber = Math.max(first, second);
            }

            if (minimumNumber % auxDivision == 0) { // checking if my minimum number is divisible by 2 (at first);
                divisor = auxDivision;              // if it is in fact divisible by 2, divisor is assigned with that value;
            }                                       // if it's not divisible by two, i'm going to add 1 to my auxDivision;
            else {                                  // and then i'm starting the loop from the beginning, with the CONTINUE statement;
                auxDivision++;
                continue;
            }
            if (first % divisor == 0 || second % divisor == 0){
                leastCommonMultiple *= divisor;
            }

            if (first % divisor == 0 && first != 1) {
                first /= divisor;
            }

            if (second % divisor == 0 && second != 1) {
                second /= divisor;
            }

            if (second == 1 && first == 1) {
                break;
            }
        }
            return (auxFirst * auxSecond)/leastCommonMultiple;
        }
    }
}
