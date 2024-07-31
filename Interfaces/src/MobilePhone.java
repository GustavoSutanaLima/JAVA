public class MobilePhone implements ITelephone{

    // defining fields
    private int myNumber;
    private boolean isRinging;
    private boolean isOn;

    // creating the class' constructor:


    public MobilePhone(int phoneNumber) {
        this.myNumber = phoneNumber;
    }

    @Override
    public void powerOn() {
        this.isOn = true;
        System.out.println("Mobile phone powered up!");
    }

    @Override
    public void dial(int phoneNumber) {
        if(this.isOn) {
            System.out.println("Now ringing " + phoneNumber + " on mobile phone");
        }
        else {
            System.out.println("Phone is switched off");
        }

    }

    @Override
    public void answer() {
        if(this.isRinging) {
            System.out.println("Answering the mobile phone.");

            this.isRinging = false;
        }
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if (phoneNumber == this.myNumber && this.isOn) {
            this.isRinging = true;
            System.out.println("Melody playing");
        }
        else {
            this.isRinging = false;
            System.out.println("Mobile phone is off or number is different");
        }

        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return this.isRinging;
    }
}
