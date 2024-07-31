import java.util.Scanner;
public class InputCalculator {
    public static void inputThenPrintSumAndAverage() {

        int sum = 0;
        int counter = 0;

        Scanner loopScan = new Scanner(System.in);  //i have to instance this Scanner class cause it's not

        while(true) {
            boolean isEntryInt = loopScan.hasNextInt(); // checks if the console has int;
            if(isEntryInt) {
                sum += loopScan.nextInt(); // gets the value from the console and assign it to a variable;
                counter++;
            }
            else {
                if (counter == 0) {
                    counter = 1;
                }
                break;
            }
        }
        loopScan.close();

        long average = Math.round((double) sum/counter);

        System.out.println("SUM = " + sum + " AVG = " + average);
    }
}

