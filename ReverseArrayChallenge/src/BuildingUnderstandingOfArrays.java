import java.util.Arrays;

public class BuildingUnderstandingOfArrays {
    private static int[] testOne = new int[] {12, 13, 14 ,15};

    public static void main(String[] args) {

        int[] testTwo = addElements(testOne, 12);

        System.out.println("Result: " + Arrays.toString(testOne));
        System.out.println("Size: " + testOne.length);

        System.out.println("Result: " + Arrays.toString(testTwo));
        System.out.println("Size: " + testTwo.length);

    }

    public static int[] addElements(int[] array, int newSize) {
        if (newSize > array.length) {
            int[] originalArray = array;

            array = new int[newSize];

            for (int i = 0; i<originalArray.length; i++) {
                array[i] = originalArray[i];
            }
            return array;
        }
        else {
            System.out.println("New size must be greater than the original size");
            return new int[] {};
        }
    }
}
