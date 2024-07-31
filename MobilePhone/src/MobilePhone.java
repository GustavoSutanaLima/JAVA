import java.util.ArrayList;
import java.util.Scanner;

public class MobilePhone {
    private static ArrayList<Contacts> contactsList = new ArrayList<Contacts>(); // This is an arrayList of Contacts;
    private static Contacts myContact; //This is a Contacts object;
    private static Scanner input = new Scanner(System.in);
    private static boolean loopFlag = true;
    private static int choice;

    public static void main(String[] args) {

        listOfOptions();
        while(loopFlag) {
            System.out.println("What's your choice?");
            switch (checkChoice(choice)) {
                case 1: {
                    storeNewContact();
                    break;
                }

                case 2: {
                    modifyContactsName();
                    break;
                }

                case 3: {
                    modifyContactsNumber();
                    break;
                }

                case 5: {
                    searchContact();
                    break;
                }

                case 6: {
                    listOfContacts();
                    break;
                }

                case 8: {
                    System.out.println("Ending application...");
                    loopFlag = false;
                    break;
                }

                case 7: {
                    listOfOptions();
                    break;
                }

                case 4: {
                    removeContact();
                    break;
                }

                default: case 0: {
                    System.out.println("Invalid option, try again!");
                    break;
                }
            }
        }
    }

    //Methods;
    private static void listOfOptions() {
        System.out.println("Functionalities:");
        System.out.println("1. Add contact");
        System.out.println("2. Update contact's name");
        System.out.println("3. Update contact's phone number");
        System.out.println("4. Remove contact");
        System.out.println("5. Search a contact");
        System.out.println("6. List of contacts");
        System.out.println("7. Help");
        System.out.println("8. Quit");

    }

    private static void storeNewContact() {
        System.out.println("Contact's name:");
        input.nextLine();
        String name = input.nextLine();
        if (searchContact(name)) {
            System.out.println("Contact already exists");
        }
        else {
            System.out.println("Contact's phone number:");
            String phoneNumber = input.nextLine();
            contactsList.add(Contacts.createNewContact(name,phoneNumber));
        }
    }

    private static void listOfContacts() {
        System.out.println("List of Contacts:");
        for (Contacts items : contactsList) {
            System.out.println(items.getName() + "'s phone number is: " + items.getPhoneNumber());
        }
    }

    private static void searchContact() {
        boolean searchFlag = false;
        System.out.println("Which is the Contact's Name?");
        input.nextLine();
        String name = input.nextLine();
        for (Contacts items : contactsList) {
            if (items.getName().equals(name)) {
                System.out.println("Contact's phone number is: " + items.getPhoneNumber());
                searchFlag = true;
                break;
            }
        }

        if(!searchFlag) {
            System.out.println("This contact does not exist.");
        }

    }

    private static boolean searchContact(String name) {
        boolean searchFlag = false;
        for (Contacts items : contactsList) {
            if (items.getName().equals(name)) {
                searchFlag = true;
                break;
            }
        }
        return searchFlag;
    }

    private static Contacts searchContactObject(String name) {
        for (Contacts items : contactsList) {
            if (items.getName().equals(name)) {
                myContact = contactsList.get(contactsList.indexOf(items));
            }
        }
        return myContact;
    }

    private static void modifyContactsNumber() {
        boolean searchFlag = false;
        System.out.println("Which contact phone number you want do modify?");
        input.nextLine();
        String name = input.nextLine();
        for (Contacts items : contactsList) {
            if (items.getName().equals(name)) {
                System.out.println("Contact found!");
                System.out.println("Type the new number:");
                String newNumber = input.nextLine();
                items.setPhoneNumber(newNumber);
                searchFlag = true;
                break;
            }
        }
        if(!searchFlag) {
            System.out.println("This contact does not exist.");
        }
    }

    private static void modifyContactsName() {
        System.out.println("Which contact name you want do modify?");
        input.nextLine();
        String name = input.nextLine();
        if (searchContact(name)) {
                System.out.println("Contact found!");
                System.out.println("Type the new name:");
                String newName = input.nextLine();
                if(!searchContact(newName)){
                    contactsList.set(contactsList.indexOf(searchContactObject(name)),
                            Contacts.createNewContact(newName, searchContactObject(name).getPhoneNumber()));
                }
                else {
                    System.out.println("Contact " + newName +" already exists, updated failed.");
                }

            }
        else {
            System.out.println("This contact does not exist.");
        }

    }

    private static int checkChoice(int choice) {
        try {
            return input.nextInt();
        }
        catch (Exception e) {
            input.nextLine();
            return 0;
        }
    }

    private static void removeContact() {
        boolean searchFlag = false;
        System.out.println("Which contact you want to remove?");
        input.nextLine();
        String name = input.nextLine();
        for (Contacts items : contactsList) {
            if (items.getName().equals(name)) {
                contactsList.remove(items);
                searchFlag = true;
                break;
            }
        }

        if(!searchFlag) {
            System.out.println("This contact does not exist.");
        }
    }
}