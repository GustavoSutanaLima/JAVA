public interface ITelephone {
    // An interface is a completely "abstract class" that is used to GROUP RELATED METHODS with empty bodies:
    // To access the interface methods, the interface must be "implemented" (kinda like inherited) by another class
    // with the implements keyword (instead of extends). The body of the interface method is provided by the "implement" class:

    //Defining methods of this interface: basically you're gonna create the method's name and parameters; the body of the
    //method is going to be implemented within the class;

    void powerOn();
    void dial(int phoneNumber);
    void answer();
    boolean callPhone(int phoneNumber);
    boolean isRinging ();

    //*** ACCESS MODIFIERS DON'T MAKE SENSE FOR INTERFACES, BECAUSE THE METHODS ARE GOING TO BE IMPLEMENTED WITHIN THE CLASS. ***
}
