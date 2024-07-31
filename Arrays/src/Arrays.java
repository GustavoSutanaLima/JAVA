import java.util.Scanner;

public class Arrays {
    // Dealing with the entries:

    public static int[] getIntegers(int size) {
        // Instancing an object that allows me to get input from a user;
        Scanner myScanObject = new Scanner(System.in);

        int[] dummyArray = new int[size];
        for (int i = 0; i<size; i++) {
            // Using next line to get every entry from a user (entry in the console);
            dummyArray[i] = myScanObject.nextInt();
        }

        return dummyArray;
    }

    public static void printArray (int[] array) {
        for (int i = 0; i<array.length; i++) {
            System.out.println("Element #"+i+": "+ array[i]);
        }
    }

    public static int[] sortIntegers(int[] array) {

        int auxMaxValue = 0;
        int auxMaxPosition = 0;
        int[] auxArray = new int[array.length];
        int j = 0;

        while(arrayAverage(array) > 0) {
            for (int i = 0; i<array.length; i++) {
                if (array[i] > auxMaxValue) {
                    auxMaxValue = array[i];
                    auxMaxPosition = i;
                }
            }
            array[auxMaxPosition] = 0;
            auxArray[j] = auxMaxValue;
            auxMaxPosition = 0;
            auxMaxValue = 0;
            j++;
            if(j > array.length) {
                break;
            }
        }

        return auxArray;
    }
    public static double arrayAverage(int[] array) {
        int sum = 0;
        for (int ele : array) {
            sum += ele;
        }
        return (double)sum/array.length;
    }
}
