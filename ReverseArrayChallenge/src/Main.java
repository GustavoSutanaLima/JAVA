import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println("Regular version.:");
        int[] testyArray = {12, 13, 28, 34, 51, 29, 128};
        reverse(testyArray);
        System.out.println(Arrays.toString(testyArray));
        System.out.println("Enhanced version.:");
        int[] testyArray2 = {12, 13, 28, 34, 51, 29, 128};
        enhancedReversed(testyArray2);
        System.out.println(Arrays.toString(testyArray2));

    }

    public static void reverse(int[] array) {
        //creating a dummy array that will store the reversed array:
        int[] reversedArray = new int[array.length];
        int reversedIndex = array.length - 1;
        for (int ele : array) {
            reversedArray[reversedIndex] = ele;
            reversedIndex --;
        }
        for (int i = 0; i< array.length; i++) {
            array[i] = reversedArray[i];
        }
    }

    public static void enhancedReversed(int[] array) {
        int lastIndex = array.length - 1;
        int auxHolder;
        for (int i = 0; i < array.length/2; i++) {
            auxHolder = array[i];
            array[i] = array[lastIndex-i];
            array[lastIndex-i] = auxHolder;
        }
    }

}
