public class VipCustomer {
    //creating FIELDS;
    private String name;
    private double creditCardLimit;
    private String email;

    // creating getters using intelliJ code generation feature (CODE > GENERATE > GETTERS)

    public String getName() {
        return name;
    }

    public double getCreditCardLimit() {
        return creditCardLimit;
    }

    public String getEmail() {
        return email;
    }

    //CREATING CONSTRUCTORS

    // Creating a main constructor that sets all custom values for all of this class fields:

    public VipCustomer (String name, double creditCardLimit, String email) {
        // this is just like the __init__ special method in Python;
        this.name = name;
        this.creditCardLimit = creditCardLimit;
        this.email = email;
    }

    // Creating an empty constructor that sets all field to a default value;
    // ->When an object is creating using this class, and any attribute has been passed to it;
    // this constructor will set default values to the object;
    public VipCustomer () {
        this("Default user", 1000, "defaultuser@email.com");
    }

    //Creating a third constructor that allows the user to set only the name when instancing the class;
    public VipCustomer (String name) {
        this(name,1000, "defaultuser@email.com");

    }

    //Creating a fourth constructor that allows the user to set his name and credit card limit;
    public VipCustomer (String name, double creditCardLimit) {
        this(name,creditCardLimit, "defaultuser@email.com");

    }
}
