import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class UnderstandingClass {
    public static void main(String[] args) {

        // Creates an empty new LinkedList that holds objects of the type String;
        LinkedList<String> playlist = new LinkedList<String>();

        // Add objects to this very same LinkedList;
        playlist.add("Smells Like Teen Spirit - Nirvana");
        playlist.add("Lilium Cruentus - Pain of Salvation");
        playlist.add("Spiritual Migration - Persefone");
        playlist.add("One - Metallica");
        playlist.add("Wasted Years - Iron Maiden");

        playingSongs(playlist);
        }

        private static void printPlaylist (LinkedList<String> playlist) {

            // Creates a ListIterator that will help me to parse through the LinkedList;
            // (assigning the listIterator() to a variable of this type;
            ListIterator<String> playlistIterator = playlist.listIterator();
            //                                                ^ Creates a listIterator for a LinkedList you invoke it upon;

            //this loop works only if there's at least one element on my iterator;
            //next() returns the elements while there's still elements to return;
            while (playlistIterator.hasNext()) {
                //hasNext() checks if there's more elements going forward in a list (but in order to check elements in a list, you
                //need a list iterator);
                System.out.println("Current song playing: " + playlistIterator.next()); //next() returns the element and advances to next position;
            }
        }

        private static void playingSongs (LinkedList<String> playlist) {
            //Create the object that will allow me to read user's input:
            Scanner userInput = new Scanner(System.in);
            //Create the object to allow me parse through my LinkedList:
            ListIterator<String> playListIterator = playlist.listIterator();
            boolean quit = false;
            int decision = 0;
            boolean isForward = true;

            //Let's say that the 1st song of the list always plays when you start the playlist:

            System.out.println("Current song playing: " + playlist.getFirst());
            printMenu();

            while(!quit) {
                System.out.println("What's your next decision?");
                decision = userInput.nextInt(); //gets the next int from the input console;
                userInput.nextLine(); // clears the console buffer;

                switch (decision) {
                    case 0: {
                        System.out.println("Ending playlist...");
                        quit = true;
                        break;
                    }
                    case 1: {
                        if (playListIterator.hasNext()) {
                            if (isForward) {
                                playListIterator.next();
                                //next() returns the next element of a iterator, but when it run for 1st
                                //it actually returns the first;
                                //cause the cursor of the Linked list is positioned between the element and not as an index of an element:

                                // LinkedList:      Element1    >     Element2    >    Element3    >    Element4    >    Element5    >    Element6
                                // *Cursor:     *^

                                // Cursor after first listIterator.next()
                                // LinkedList:      Element1    >     Element2    >    Element3    >    Element4    >    Element5    >    Element6
                                // *Cursor:                       *^

                                // IMPORTANT: That's why when you use listIterator.next() you get the next element by referencing
                                isForward = false;
                            }
                                System.out.println("Current song playing: " + playListIterator.next());
                            }
                        else {
                            System.out.println("This is the last song of your playlist.");
                        }
                        break;
                    }
                    case 2: {
                        if(playListIterator.hasPrevious()) {
                            if (!isForward) {
                                playListIterator.previous();
                                isForward = true;
                            }
                            System.out.println("Current song playing: " + playListIterator.previous());
                        }
                        else {
                            System.out.println("This is the first song of your playlist.");
                        }
                        break;
                    }
                    case 3: {
                        printMenu();
                        break;
                    }
                }
            }
        }

        private static void printMenu() {
            System.out.print("0 - Quit playlist ");
            System.out.print("| 1 - Next song ");
            System.out.println("| 2 - Previous song | 3 - For help");
        }

}
