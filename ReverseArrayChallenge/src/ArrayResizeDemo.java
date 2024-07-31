import java.util.Scanner;

public class ArrayResizeDemo {

    //this is creating a new scanner object, called s that will help me get entries from a user;
    private static Scanner s = new Scanner(System.in);

    //this is creating an empty array with the size 10, every value of this array is set as
    //zero when defined like this;
    private static int[] baseData = new int[10];

    public static void main(String[] args) {
        System.out.println("Enter 10 integers:");
        getInput();
        printArray(baseData);
        resizeArray();
        System.out.println("Enter 12 integers:");
        getInput();
//        baseData[10] = 67;
//        baseData[11] = 34;
        printArray(baseData);

    }

    private static void getInput()
    {
        for(int i = 0; i < baseData.length; i++)
            baseData[i] = s.nextInt();
    }

    private static void printArray(int[] arr)
    {
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    private static void resizeArray()
    {
        int[] original = baseData;

        baseData = new int[12];
        for (int i = 0; i < original.length; i++)
            baseData[i] = original[i];
    }

}
