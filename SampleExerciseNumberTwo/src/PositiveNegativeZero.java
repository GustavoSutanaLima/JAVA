public class PositiveNegativeZero {

    public static void main(String[] args) {//PSVM is a shortcut for adding an pubic static void MAIN METHOD;
                                            //just as SOUT is a shortcut for System.out.println();

        checkNumber(0); //another method with my class that's been invoked on my main method;
        checkNumber(-25);
        checkNumber(123);
    }

    public static void checkNumber (int number) {
        if (number > 0) {
            System.out.println("positive");
        } else if (number < 0) {
            System.out.println("negative");
        } else {
            System.out.println("zero");
        }
    }
}
