import java.util.Scanner;

public class Main2 {


    // Instantiating an Scanner object with the name "scanner"
    // that will actually allows us to get input from a user;
    private static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
       int[] myIntegers = getIntegers(5);
       arrayPrinter(myIntegers);
        System.out.println(getArrayAverage(myIntegers));
    }

    //the SQUARE BRACKETS mean that this method will be returning an ARRAY;
    public static int[] getIntegers(int number) {
        //This is the message the user will be seeing when he loads this method;
        System.out.println("Enter " + number + " integers values.\r");

        //Creating a new array that we will use to store the elements the users types in;
        int[] myDummyArray = new int[number]; //<- this array will have the size equals of the value number (user's entry);

        for (int i = 0; i<myDummyArray.length; i++) {
            //myDummyArray[i] = Integer.parseInt(scanner.nextLine());
            //scanner.nextLine() reads the next line of input from a user (from the console, actually);
            //Integer.parseInt() converts the user input(from the Scanner type method, which is a String, into a Integer Type);

            myDummyArray[i] = scanner.nextInt();

        }

        return myDummyArray;

    }

    public static void arrayPrinter(int[] entryArray) {
        for (int i = 0; i < entryArray.length; i ++) {
            System.out.println("Element number "+"#"+ i+ ":" +  entryArray[i]);
        }
    }

    public static double getArrayAverage(int[] dummyArray) {
        int sum = 0;
        for (int element : dummyArray) {
            sum += element;
        }
        return (double) sum/dummyArray.length;
    }
}
