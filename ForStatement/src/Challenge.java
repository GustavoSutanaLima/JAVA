public class Challenge {
    public static void main(String[] args) {
        System.out.println(SumOddRange.sumOdd(1,100));
        System.out.println(SumOddRange.sumOdd(-1,100));
        System.out.println(SumOddRange.sumOdd(100,100));
        System.out.println(SumOddRange.sumOdd(13,13));
        System.out.println(SumOddRange.sumOdd(100,-100));
        System.out.println(SumOddRange.sumOdd(100,1000));

    }

    public static void forChallenge () {
        int iAux = 0;
        int loopCounter = 0;
        for (int i = 1; i <= 1000; i++){
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("Numbers that match condition: " + i);
                iAux += i;
                loopCounter++;
                if (loopCounter >= 5) {
                    break;
                }
            }
        }
        System.out.println("Sum of the numbers: " + iAux);
    }
}
