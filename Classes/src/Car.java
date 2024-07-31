//*** GOOD NAME DEFINING PRACTICES: ***
// Classes usually begin with an Upper Case letter whilst
// methods, variables and so on start with a lower case letter;
// They're all usually typed using camelcasing;

// ** PUBLIC keyword **
// it's an ACCESS MODIFIER in which other classes can have access to this very same without any
// restriction;

// ** a CLASS is a blueprint (or sometimes called template) for an object you'll be creating;
// Unlike methods, variables created inside of a class can be accessed anywhere inside of that class;
// You cannot access a variable from a method inside of another method (method variables are local),
// but it's possible to access class variables (also known as FIELDS) from anywhere within the
// class and therefore including all of its methods;
public class Car {
    //creating some FIELDS (initialization of a class: not exactly, but you can change it's attributes BUT ONLY IF THEY'RE PUBLIC);
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String colour;
    // Defining variables created within the body of a class;
    // variables defined like that are also known as FIELDS the private;
    // access modifier means you cannot access this FIELD from outside of this class;

    // Also, these FIELDS define the characteristics (also known as STATES) of this class;

    public void setModel(String model) {
        this.model = model;
    }
    /*
    The THIS keyword refers to the current object in a METHOD or CONSTRUCTOR.
    The most common use of the this keyword is to eliminate the confusion between
    class ATTRIBUTES and method PARAMETERS with the same name
    (because a class attribute is shadowed by a method or constructor parameter).

    The method above has a parameter named "model" but the class Car also has an "attribute" named model, as they're exactly the same,
    you have to use this (this refers to the object attribute and not the parameter os the method "setModel";
     */

    public String getModel () {
        return this.model;
    }

}
