// Using an interface is actually similar to the using the concept of inheritance, but
// instead of the EXTENDS keyword you have to use the IMPLEMENTS keyword;

public class DeskPhone implements ITelephone {

    // if you don't implement any method from the interface (Itelephone) it's not gonna be
    // seen as a valid class in Java;

    // IMPORTANT: IF A CLASS IS IMPLEMENTING AN INTERFACE, THIS CLASS MUST HAVE ALL OF THE
    // METHODS IN THAT INTERFACE;

    private int myNumber;
    private boolean isRinging;

    //in order for you to implement a method from an interface you can use
    //intelliJ's feature "Implement methods" (keybinding = ALT + INSERT)

   public DeskPhone (int phoneNumber) {
       this.myNumber = phoneNumber;
       this.isRinging = false;
   }

    @Override
    public void powerOn() {
        System.out.println("No action taken, desk phone does not have a power button.");
    }

    @Override
    public void dial(int phoneNumber) {
        System.out.println("Now ringing " + phoneNumber + " on desk phone.");
    }

    @Override
    public void answer() {
        if(this.isRinging) {
            System.out.println("Answering the desk phone.");

            this.isRinging = false;
        }
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if (phoneNumber == this.myNumber) {
            this.isRinging = true;
            System.out.println("Ring ring");
        }
        else {
            this.isRinging = false;
        }

        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return this.isRinging;
    }
}
