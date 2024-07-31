import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int myIntValue = 10;
        int anotherIntValue = myIntValue;

        System.out.println("My int value: "+ myIntValue);
        System.out.println("Another int value: " + anotherIntValue);

        anotherIntValue++;

        System.out.println("My int value: "+ myIntValue);
        System.out.println("Another int value: " + anotherIntValue);

        // *** TIP ***
        // Whenever you see the keyword "new", a new object is being created;

        int[] myIntArray  = new int[5];
        // this array has got 5 elements, you can also say that this array's size is 5;

        // Different from single variables (or VALUE TYPES), arrays are of the REFERENCE TYPE;

        int[] anotherIntArray = myIntArray;
        // As arrays are of the Reference type, I am now creating anotherIntArray, but I am
        // assign to it the "value" (or better, the REFERENCE) o the new int[5];
        // Therefore those two arrays are referencing the same object;
        // This is the same as aliasing on Python. An array is also an object,
        // creating two different variable but assign them to the same array
        // means that you have two different variables representing the same value;

        int i = 3;
        myIntArray[i] = 4; // assigning the value of 4 to myIntArray (position 3)
                            // also assigns the same value of 4 to the position 3
                            // of the anotherIntArray. This happens because they are
                            // REFERENCING the SAME object;
                            // an array is an object in Java;

        System.out.println("myIntArray #"+i+" : " + myIntArray[i]);
        System.out.println("anotherIntArray #"+i+" : " + anotherIntArray[i]);

        System.out.println("myIntArray: " + Arrays.toString(myIntArray));
        System.out.println("anotherIntArray: " + Arrays.toString(anotherIntArray));

//        If I don't want this aliasing to happen what you can do is to create to different
//        objects instead of reassign the arrays like previously;

//        anotherIntArray = new int[5];

//        System.out.println();
//        System.out.println("After creating a new object:");
//
//        System.out.println("myIntArray #"+i+" : " + myIntArray[i]);
//        System.out.println("anotherIntArray #"+i+" : " + anotherIntArray[i]);
//
//        System.out.println("myIntArray: " + Arrays.toString(myIntArray));
//        System.out.println("anotherIntArray: " + Arrays.toString(anotherIntArray));

        //REFERENCE TYPES: DON'T reference the data itself but its place in memory;
        //VALUE TYPES: reference the data itself, therefore aliasing is less likely;

        modifyArray(anotherIntArray);

        System.out.println("myIntArray: " + Arrays.toString(myIntArray));
        System.out.println("anotherIntArray: " + Arrays.toString(anotherIntArray));

    }

    private static void modifyArray (int[] array) {
        array[0] = 2;
        int[] copyArray = new int[array.length];
        int i = 0;
        for (int ele: array) {
            copyArray[i] = ele;
            i ++;
        }
        System.out.println("Copied array: " + Arrays.toString(copyArray));
    }
}
