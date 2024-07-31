import java.util.Scanner;

public class ReadingUserInputChallenge {
    public static void loopRead(int howManyNumbersShouldItRead) {

        //The 1st thing I'm going to do, is create a Scanner instance which will allow me to read users' input;
        Scanner loopScan = new Scanner(System.in);

        //This is gonna be my result:
        int result = 0;

        //Creating the loop;
        int count = 1;

        while (count <= howManyNumbersShouldItRead) {
            System.out.println("Enter number #" + count + ":");
            boolean checkingNextInt = loopScan.hasNextInt(); // if the next data entered by the user is int, the boolean variable checkingNextInt will be assign the TRUE value;
            if(checkingNextInt) {
                result += loopScan.nextInt();
                count++;
            }
            else {
                System.out.println("Entry number #" + count + " is invalid and won't be added!");
            }
            //After reading the entry data, whether this data is a number or not, that next thing that is exhibited is
            // a String: ("Enter number #" + count + ":") OR ("Entry number #" + count + " is invalid and won't be added!").
            // In order to prevent our code to interpreter one of those as "hasNextInt() == true" I've added loopScan.nextLine()
            // after the IF-ELSE statement.
            // If we hadn't loopScan.NextLine() it would go back to the beginning of the loop
            // and it would've tried to check if the next thing is a INT, as wouldn't have been, it would've
            // repeated the same over and over again until the end of the loop because hasNextInt() would've been false;

            //Basically loopScan.nextLine is preventing the misreading
            // by "skipping" the printed message and "awaiting" for the next data entry instead;

            loopScan.nextLine(); // this next Line is also handling ENTER KEY at the ending of the line;
        }
        loopScan.close();

        System.out.println("");
        System.out.println("The sum of the numbers is: " + result);

    }
}
