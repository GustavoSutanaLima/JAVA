public class Main {
    public static void main(String[] args) {
        System.out.println(calculateInterest(12, 24));


        // *** FOR STATEMENT ***
        // within the for you need to place three parameters,
        // INITIALIZATION; TERMINATION; INCREMENT;
        // the variable within the loop used on the INITIALIZATION, in this case "i", is used only when this FOR is running;
        // after it's finished, this variable erased, the same thing that happens with parameters on methods;

        // while the TERMINATION STILL TRUE, THE LOOP KEEPS GOING ON;

        // INCREMENT, the value of the variable is increased by a rate, and the it's checked on the TERMINATION;
        for (int i = 0; i<5; i++) {
            int j = i + 1;
            System.out.println("Loop " + j + " hello!");
        }
        calculateInterest(10000);
    }

    public static double calculateInterest(double amount, double interestRate){
        return amount*interestRate/100;
    }

    public static void calculateInterest (double amount) {
        for (int interestRate = 2; interestRate<=8; interestRate++) {
            System.out.println(amount + " at an Interest Rate is " + interestRate + "%: " + String.format("%.2f", calculateInterest(amount, interestRate)));
        }
    }

}
