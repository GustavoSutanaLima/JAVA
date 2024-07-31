import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner firstScan = new Scanner(System.in);
        //Scanner is one of Java's built in classes and it allows us to read user input;
        //The keyword "new" creates an instance of the class Scanner ("new Scanner()").
        //This new instance is name "firstScan" and it is of the same type, Scanner;
        //System.in is one of the attributes passed to this new instance;

        //Primitive types don't need the keyword new to be declared;
        System.out.println("Enter your year of birth: ");

        boolean hasNextInt = firstScan.hasNextInt();

        //This Scanner type method checks if the nextInt() entered by the user is actually an int and then returns true of false;
        if(hasNextInt) {
            int yearOfBirth = firstScan.nextInt();

            // This is similar to nextLine(), which reads, literally the next string typed by the user;
            // The Class Scanner has already got a method nextInt(), which read the next int;
            // therefore you wont need to parse a string (from nextLine()) using Integer.parseInt(String s)

            //*** IMPORTANT ***
            // After reading A NUMBER (int, float, double, long) , there must be an nextLine() method applying to the object of the type Scanner to
            // handle the (enter key) problem;
            firstScan.nextLine();

            System.out.println("Enter your name: ");
            String name = firstScan.nextLine();
            //The nextLine() method from the type Scanner reads the next line of input (String) from the console;

            int age = 2022 - yearOfBirth;

            if (age >= 0 && age <=100){
                System.out.println("Your name is " + name + " , and you are "+ age + " years old!");
            }
            else {
                System.out.println("Invalid year of birth.");
            }
        }
        else {
            System.out.println("Wrong data type!");
        }
        firstScan.close(); //closes an scan, allow the user to enter another kind of data? ;
    }

    //          *** ABOUT Scanner.hasNextInt() ***
/*
I think I know what you actually wanted to know.



nextInt(), "awaits" the user to type a value of type int and assigns it to the variable yearOfBirth, if the value entered is not an int you get an expection; (nextInt(), does't have to run beforehand for us to check if the next typed value is actually an int, it only assings the value to the variable - also after checking the value);



Before all of that, the Scanner type method hasNextInt() checks if the value typed (the FIRST action you do) is a number (int). As nothing happens right after the message (the first print), I guess the console "freezes" because of hasNextInt(), as it's a Scanner method it also "awaits" for data to be entered (passed to the flow).



The next data in the flow is the number the user typed, as it's an int then it gets true and only then nextInt() assings that value to the variable;*/
}
