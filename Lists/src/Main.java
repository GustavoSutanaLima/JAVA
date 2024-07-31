import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // One of the big differences between LISTS and ARRAYS is that LISTS handle
        // size automatically, you DON'T need to define a length for a list when you're defining or assigning it;

        // A LIST can also hold objects, while an simple array only handles variables;

        // The ArrayList class is a resizable array, which can be found in the java.util package.
        /*
        The difference between a built-in array and an ArrayList in Java, is that the size of an array cannot be modified (if you want to add or remove elements to/from an array, you have to create a new one).
        While elements can be added and removed from an ArrayList whenever you want. The syntax is also slightly different:
         */
        ArrayList<String> groceryList = new ArrayList<String>(); // Create an ArrayList object (if you're creating an ArrayList object it is a class);

        groceryList.add("Carrots");
        groceryList.add("Potatoes");
        groceryList.add("Beetroot");

        System.out.println(groceryList);


        System.out.println("Enhanced for: ");
        for (String ele : groceryList) {
            System.out.println(ele);
        }

        System.out.println("Regular for: ");
        for (int i = 0; i<groceryList.size(); i++) {
            System.out.println(groceryList.get(i));
        }


    }
}
