import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {

        // The LinkedList class is almost identical to the ArrayList;
        // The LinkedList class is a collection which can contain many objects of the same type, just like the ArrayList;
        // The LinkedList class has all of the same methods as the ArrayList class because they both implement the List interface
        // (in other words they both extend (or inherit) from the super class List;
        // This means that you can add items, change items, remove items and clear the list (LinkedList) in the same way.
        // LINKED LIST MEANS THAT THE ELEMENTS ARE STRINGED TOGETHER IN A SEQUENCE JUST LIKE THE REPRESENTATION BELOW:

        // LinkedList: "Ast" -> "Cat" -> "Don" -> "Rio" -> "Juz"

        //Whereas an ArrayList would be elements in a sequence but not linked:

        //             _______    _______   _______   _______   _______
        // ArrayList: | "Ast" |  | "Cat" | | "Don" | | "Rio" | | "Juz" |
        //             -------    -------   -------   -------   -------

        LinkedList<String> placesToVisit = new LinkedList<String>();
//
//        addInOrder(placesToVisit, "Sydney");
//        addInOrder(placesToVisit, "Brisbane");
//        addInOrder(placesToVisit, "Perth");
//        addInOrder(placesToVisit, "Canberra");
//        addInOrder(placesToVisit, "Adelaide");
//        addInOrder(placesToVisit, "Darwin");

//        printList(placesToVisit);

        placesToVisit.add("Ast");
        placesToVisit.add("Cat");
        placesToVisit.add("Don");
        placesToVisit.add("Rio");
        placesToVisit.add("Juz");
//

//        printList(placesToVisit);

        visit(placesToVisit);

    }
    // hasNext() has to be used with the next() method or else you gonna have problems running this loop;
    // it only returns false if the iterator.next() hits an exception, therefore allowing you to go out of your loop;
    private static boolean addInOrder(LinkedList<String> linkedList, String addingElement) {

        ListIterator<String> stringListIterator = linkedList.listIterator(); //creates an object that helps me loop through an LinkedList;

        while (stringListIterator.hasNext()) {
            int comparison = stringListIterator.next().compareTo(addingElement);
            if (comparison == 0) {
                System.out.println("This element is already here");
                return false;
            }
            else if(comparison > 0) {
                stringListIterator.previous(); //"moves" me to the previous element of my LinkedList
                stringListIterator.add(addingElement); //adds the element to this position;
                return true;
            }
        }
        stringListIterator.add(addingElement);
        return true;
    }

    public static void printList(LinkedList<String> dummyLinkedList) {
        Iterator<String> i = dummyLinkedList.iterator();
        while(i.hasNext()){
            System.out.println("Now visiting: " + i.next());
        }
        System.out.println();
    }

    private static void visit(LinkedList<String> cities) {

        boolean quit = false;

        Scanner scanner = new Scanner(System.in); //an object that helps me to input values;

        ListIterator<String> listIterator = cities.listIterator(); //an object that helps me to navigate through my list in proper sequence;

        if (cities.isEmpty()) {
            //if the LinkedList has no elements;
            System.out.println("No cities in my list!");
            return;
            // this RETURN won't allow the rest of the code to be executed,
            // getting me out of the method therefore returning me to main;
        }
        else {
            System.out.println("Now visiting " + listIterator.next()); // This is gonna print the first element? Yes it is.
            //although the word "next" is used here, it prints the elements in sequence;
            printMenu();
        }
        while(!quit) {
            int action = scanner.nextInt(); //gets the next integer input from the console;
            scanner.nextLine(); //cleans the buffer;
            switch (action) {
                case 0: {
                    System.out.println("Holiday (Vacation) over");
                    quit = true;
                    break;
                }
                case 1: {
                    if(listIterator.hasNext()) {
                        System.out.println("Now visiting " + listIterator.next());
                    }
                    else {
                        System.out.println("Reached the end of the list.");
                    }
                    break;
                }
                case 2: {
                    if(listIterator.hasPrevious()) {
                        System.out.println("Now visiting " + listIterator.previous());
                    }
                    else {
                        System.out.println("We're at the start of the list.");
                    }
                }
            }
        }
    }

    private static void printMenu() {
        System.out.println("Select your option:");
        System.out.println("0 - End vacation!");
        System.out.println("1 - Go to the forward");
        System.out.println("2 - Go to the back");
    }
}