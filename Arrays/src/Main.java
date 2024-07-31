public class Main {
    public static void main(String[] args) {

        /*
        ARRAYS are a data structure that allow us to store multiple values in a single variable;
         */

        //declaring a variable that hold only one value:
        int mySingleValue = 12;

        //declaring an Array of values of the type int;

        int[] myArrayOfValues; //<- basic definition of an EMPTY array (with size zero);

        int[] mySecondArrayOfValues = {12, 13, 14, 15}; //<- basic definition of an array (with values being INITIALIZED);
        // this definition is ONLY allowed during the initialization of a new array, you can't do the following:
        // mySecondArrayOfValues = {16, 17, 18, 19, 20};

        int[] myThirdArrayOfValues = new int[10]; //<- this creates an new array (of ZEROS) of the type INT with the SIZE ten;

        //Initializing the values of an array using a for loop:
        for (int i = 0; i< myThirdArrayOfValues.length; i++) {
            myThirdArrayOfValues[i] = i*10;
        }

        //LENGTH is a FIELD within the ARRAY class that returns the size of an array, it's useful when you need to get the;
        // number of elements within an array, or when you looping through an array;

        for (int i = 0; i<myThirdArrayOfValues.length; i++) {
            System.out.println("Element #"+ i+ " has the value " + myThirdArrayOfValues[i]); //prints every element of the myThirdArrayOfValues
        }

        System.out.println("Looping through an array:");

        //Looping through an array: this for loops gets every elements of the array and prints them out;
        for (int element : mySecondArrayOfValues) {
            System.out.println(element);
        }

        myThirdArrayOfValues[5] = 123; //this lines assigns the value 123 for the sixth element of the myThirdArrayOfValues;
        //the POSITION of an ELEMENT within the array starts at 0. An array of 10 elements has it's first in the position;

        arrayPrinter(myThirdArrayOfValues);
    }

    public static void arrayPrinter(int[] array) {
        int i = 0;
        for (int ele : array) {
            System.out.println( i + "#: "+ ele);
            i++;
        }
    }
}
