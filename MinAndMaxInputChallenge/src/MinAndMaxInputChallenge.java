import java.util.Scanner;

public class MinAndMaxInputChallenge {
    public static void minMax() {
        //creating a Scanner class;
        Scanner readingValues = new Scanner(System.in);

        int minValue = 0;
        int maxValue = 0;
        int current;
        boolean firstInput = true; // flag used to define the first entry value;

        while(true) {
            System.out.println("Enter number:");
            boolean isIntValue = readingValues.hasNextInt(); //checks if the value on the console is of the type int;
            if (isIntValue) {
               current = readingValues.nextInt(); //gets this value and assigns it to current;
               if (firstInput) {
                   maxValue = current;
                   minValue = current;
                   firstInput = false;
               }
               else {
                   if (current >= maxValue) { // if current value is greater than the max value (previous), the maxValue's value is updated;
                       maxValue = current;
                   }
                   else if (current <= minValue) { // same as before but when the current value is smaller;
                       minValue = current;
                   }
               }
            }
            else { // if isIntValue is not a number (int), we break out of the loop;
                break;
            }
            readingValues.nextLine(); //if the code reaches this line we "skip" the enter key entry line to read the correct next value;
        }
        readingValues.close();

        System.out.println("The min and max values entered were, respectively: " + minValue +" and " + maxValue);
    }
}
