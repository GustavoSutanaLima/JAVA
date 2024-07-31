public class FactorPrinter {
    public static void printFactors(int number) {
        if (number < 1) {
            System.out.println("Invalid Value");
        }
        else {
            int auxWhileLoop = 1;

            while(true) {
                if (number % auxWhileLoop == 0) {
                    System.out.print(auxWhileLoop + " ");
                }

                auxWhileLoop++;

                if (number / auxWhileLoop < 1){
                    break;
                }
            }
        }
    }
}
