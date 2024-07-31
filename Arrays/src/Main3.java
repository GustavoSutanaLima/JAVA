public class Main3 {
    public static void main(String[] args) {
        int[] array1 = Arrays.getIntegers(10);
        Arrays.printArray(array1);
        int[] sortedList = Arrays.sortIntegers(array1);
        System.out.println("Sorted array below:");
        Arrays.printArray(sortedList);
    }
}
