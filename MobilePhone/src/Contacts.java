public class Contacts {
    //Fields:
    private String name;
    private String phoneNumber;

    //Constructor:
    public Contacts (String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    //Getters:
    public String getName() {
        return this.name;
    }
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    //Setters:
    public void setName(String name) {
        this.name = name;
    }
    public void setPhoneNumber (String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    //Static Method for creating a new Contact
    public static Contacts createNewContact(String name, String phoneNumber) {
        return new Contacts(name, phoneNumber);
    }
}
