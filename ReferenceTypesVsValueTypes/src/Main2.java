import java.util.Arrays;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        int[] myEntryArray = readIntegers(4);
        System.out.println("Entry array: " +  Arrays.toString(myEntryArray));
        System.out.println("The minimal value of the typed array is: " + findMin(myEntryArray)[0]);
        System.out.println("Sorted array: " + Arrays.toString(sortArray(myEntryArray)));

    }
    public static int[] readIntegers(int count) {

        //Instantiating an Scanner object that will allow me to read user input;
        Scanner myScanObject = new Scanner(System.in);
        //auxiliary variable that will help the to parse through the array;
        int i = 0;
        //The array that will be filled with the user entries;
        int[] myDummyArray = new int[count];

        while (i < count) {
            myDummyArray[i] = myScanObject.nextInt(); //Read the next line (if it's an Integer) typed by the user;
            i++;
        }

        return myDummyArray;
    }

    public static int[] findMin(int[] array) {
        // creating an holder that will help me find the minimum value of an array:
        // just in case, the first element is already the lowest element on the array, i'll assign this values to my minValue,
        // then, i'll compare it to the other elements;
        int auxMinValue = array[0];
        int minValuePosition = 0;
        for (int i = 1; i < array.length; i++) {
            if (auxMinValue > array[i]) {
                auxMinValue = array[i];
                minValuePosition = i;
            }
        }
        return new int[] {auxMinValue, minValuePosition};
    }

    public static int[] sortArray (int[] array) {
        //instantiating a new array that will get my sorted elements:
        int[] sortedArray = new int[array.length];
        //creating a value that will hold my min value through each iteration;
        //it will be stater with the minimal value of may parameter;
        int auxMinValue = 0;
        while(sumArray(array) > 0) {
            for (int i = 0; i<array.length; i++) {
                sortedArray[i] = findMin(array)[0];
                array[findMin(array)[1]] = Integer.MAX_VALUE;
            }
        }
        return sortedArray;
    }

    public static int sumArray (int[] array) {
        int sum = 0;
        for (int ele: array) {
            sum += ele;
        }
        return sum;
    }
}
