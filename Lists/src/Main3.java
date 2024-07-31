import java.util.ArrayList;
import java.util.Scanner;
public class Main3 {
    //Class fields
    private static Scanner myScanObject = new Scanner(System.in);
    private static GroceryList mySimpleGroceryList = new GroceryList();
    private static boolean loopFlag = true;

    public static void main(String[] args) {

        startListOptions();

        while(loopFlag) {

            switch (decision()) {

                case 1: {
                    addingANewGrocery();
                    break;
                }

                case 2:{
                    removingAnItem();
                    break;
                }

                case 3: {
                    switchingAnItem();
                    break;
                }

                case 4: {
                    printingList();
                    break;
                }

                case 5: {
                    printingList();
                    System.out.println();
                    System.out.println("Application ended.");
                    loopFlag = false;
                    break; // ->this break refers to the CASE break no the WHILE loop break;
                }

                case 6: {
                    startListOptions();
                    break;
                }

                case 7: {
                    makingACopyOfTheList();
                }
                case -1: {
                    loopFlag = false;
                    break;
                }
            }
        }
    }

    private static void startListOptions() {
        System.out.println("Select one of this options:");
        System.out.println("1 - Add new grocery");
        System.out.println("2 - Remove a grocery");
        System.out.println("3 - Switch grocery");
        System.out.println("4 - Print complete Grocery List");
        System.out.println("5 - Exit");
        System.out.println("6 - Help");
        System.out.println("7 - Making a copy of the list.");
    }

    private static void addingANewGrocery() {
        System.out.println("Type the name of the new item:");
        myScanObject.nextLine();
        mySimpleGroceryList.addItem(myScanObject.nextLine());
    }

    private static int decision() {
        System.out.println("What do you want to do?");
        int aux;
        try {
            aux = myScanObject.nextInt();
        }
        catch (Exception e) {
            System.out.println("Invalid option: application's been terminated.");
            aux = -1;
        }
        return aux;
    }

    private static void removingAnItem () {
        System.out.println("Which item do you want to remove?");
        mySimpleGroceryList.printArrayList();
        mySimpleGroceryList.removeItem(myScanObject.nextInt());
        System.out.println("Item removed successfully!");
    }

    private static void switchingAnItem () {
        System.out.println("Which item do you want to replace?");
        mySimpleGroceryList.printArrayList();
        int auxReplace = myScanObject.nextInt();
        System.out.println("Which is the new grocery?");
        myScanObject.nextLine();
        // Advances the Scanner to the next line because i'm not assigning the console input
        // to any variable; This doest not clean the console but it acts like the console is free from
        // unwanted input into the Scanner object (because there's a print right before the Scanner);
        String line = myScanObject.nextLine();
        mySimpleGroceryList.switchItem(auxReplace, line);
        System.out.println("Item switched");
    }

    private static void printingList() {
        System.out.println("Complete grocery list:");
        mySimpleGroceryList.printArrayList();
    }

    private static void makingACopyOfTheList() {
        // This is how you can make a copy of an Arraylist

        //You can instance a new Arraylist and then add of the elements of another ArrayList to it, like so:
        ArrayList<String> copiedArrayList = new ArrayList<String>();
        copiedArrayList.addAll(mySimpleGroceryList.getGroceryList());

        //You can also "assign one array list to another like so:
        ArrayList<String> copiedArrayListTwo = new ArrayList<String>(mySimpleGroceryList.getGroceryList());
    }
}
