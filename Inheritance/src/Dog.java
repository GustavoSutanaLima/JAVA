// ** INHERITANCE **
// The keyword that we use in Java to make a class that heirs methods/attributes from another class
// is EXTEND; In the statement below, Dog "extends" Animal, this means Dog is heiring all methods
// and states (characteristics) off of the Animal class;

public class Dog extends Animal {

    // creating field that are specific to the dog class;
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    // When you first declare a class this way (using EXTEND), you HAVE TO create a constructor
    // that calls the parent class, or else you'll get an error;

    // Here we are initialising the basic characteristics of an animal (BASIC CHARACTERISTICS OF AN CHILD CLASS;
    public Dog(String name, int brain, int body, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) { // <- Defining the Dog constructor that calls the parent constructor;

        super(name, brain, body, size, weight); // <-- Super here is calling the parent class Animal's constructor,
        // therefore i'm initializing it within the parent class Dog;

        // initializing all of the fields from dog, as you normally do when creating a class;
        this.coat = coat; // the keyword THIS here is referring to the object;
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;

    }

    // After the constructor's been created the error is fixed;
    // * TIP you can use Generate (intelliJ's feature) to create the constructor above *;
    // The keyword SUPER is similar to the keyword THIS but it refers to the parent class;
    // Whilst THIS refers to the current class you working with
    // ** OBS: WHEN USING BOTH OF THEM AS METHODS **;

    // *** In this case, SUPER that's actually calling the parent class constructor, thus removing the
    // the ERROR mentioned above ***;

    //MOVING ON... every method that is of the public access modifier type on the parent class is automatically extended to the
    // child class (hence the word - extended - when working with inheritance int Java;

    public void chew() { // This method is defined as private because not all animals chew food, but dogs do;
        System.out.println(this.getName() + " the dog is now chewing his food.");
    }

    // *** METHOD OVERRIDING ***
    // It is possible within inheritance, to create an exclusive method
    // from a parent class inside of the child class by overriding (not overloading) a method
    // this method will be exclusive to the child class (although it also exists within the parent class, it'll be kinda custom
    // method within the child class;

    // IntelliJ's Generate feature also overrides methods automatically for us:
    // go to CODE > GENERATE (alt + insert) > OVERRIDE METHODS (ctrl + O);
    // then select the method you want to overload;

    @Override
    public void eat() {
       //super.eat(); // <-- super when used with dot notation refers to the parent class;
        chew();
    }

    private void stroll (int yards) {
        System.out.println(this.getName() +" strolled " + yards + " yards.");
    }

    @Override
    public void moveForward(int yards) {
        stroll(yards);
    }
}
