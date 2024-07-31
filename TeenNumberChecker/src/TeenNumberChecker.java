public class TeenNumberChecker {
    public static boolean hasTeen (int numberOne, int numberTwo, int numberThree) {
        if ( (numberOne >= 13 && numberOne <= 19) || (numberTwo >= 13 && numberTwo <= 19)
                || (numberThree >= 13 && numberThree <= 19)) {
          return true;
        }
        return false;
    }
    public static boolean isTeen(int numberOne) {
        return hasTeen(numberOne,99,99);
    }
}
