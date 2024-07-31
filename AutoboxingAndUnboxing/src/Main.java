import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Arraylists store array objects, like so:
        // String is actually a class on Java (it's not a primitive type like int or double);
        // Therefore it's possible to create a Arraylist using it:

        ArrayList<String> mySimpleArrayListOfStrings = new ArrayList<String>();

        // In the line above we're instancing a a Arraylist of the type String, called
        // mySimpleArrayListOfStrings;

        // One more time, it's only possible to instance this ArrayList because String is actually
        // a Class and not a primitive type;

        // If i'd try to do something like the next line below:

        //    ArrayList<int> myIntArrayList = new ArrayList<int>();

        // I'd be getting an error, because int is a primitive type and not a Class;

        /*
            ***** AUTOBOXING AND UNBOXING *****:

                Autoboxing is the automatic conversion that the Java compiler makes between the primitive types
                and their corresponding object wrapper classes.
                For example, converting an int (primitive type) to an Integer (Class), a double (primitive type) to a Double (Class), and so on.
                If the conversion goes the other way, this is called unboxing.
         */

        Integer myIntValue = 56;
        //When you type the line above on the IDE what actually gets executed is:
                // Integer myIntValue = Integer.valueOf(56) //AUTOBOXING

        int myInt = myIntValue;
        //When you type the line of code above, tye interpreter actually executes:
                // myIntValue.intValue(); //UNBOXING

        ArrayList<Double> myDoubleValues = new ArrayList<Double>();

        for(double dbl = 0.0; dbl <=10.0; dbl+= 0.5) {
            myDoubleValues.add(Double.valueOf(dbl));
        }

        for (Double elements: myDoubleValues) {
            System.out.println("Position #"+ myDoubleValues.indexOf(elements)+ " -> "+elements);
        }

    }
}
