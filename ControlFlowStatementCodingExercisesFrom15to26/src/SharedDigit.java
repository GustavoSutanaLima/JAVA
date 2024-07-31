public class SharedDigit {
    public static boolean hasSharedDigit(int numberOne, int numberTwo) {
        if (numberOne > 99 || numberTwo < 10 || numberOne < 10 || numberTwo > 99) {
            return false;
        }

        int digitOne;
        int digitTwo;
        int auxNumberTwo = numberTwo;

        while (numberOne > 0) {
            digitOne = numberOne % 10;
            while(numberTwo > 0) {
                digitTwo = numberTwo % 10;
                if (digitOne == digitTwo) {
                    System.out.println("The even digit is: " + digitOne);
                    return true;
                }
                numberTwo /= 10;
            }
            numberOne /= 10;
            numberTwo = auxNumberTwo;
        }

        return false;
    }
}
