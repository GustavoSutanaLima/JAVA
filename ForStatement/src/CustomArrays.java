public class CustomArrays {
    // Function to add x in arr
    public static int[] addingAnElementToAnArray(int[] arr, int x) {
        int i;
        // create a new array of size of the length of the input array plus one
        int[] newArr = new int[arr.length + 1];

        // insert the elements from
        // the old array into the new array
        // insert all elements till n
        // then insert x at n+1
        for (i = 0; i < arr.length; i++)
            newArr[i] = arr[i];

        newArr[arr.length] = x;

        return newArr;
    }
}
