public class BankAccount {
    //creating fields for bank account
    private int accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    // *** CREATING CONSTRUCTORS FOR THE BankAccount CLASS: ***
    // Constructors are a special method-like part of a class, they don't have a type,
    // only the access modifier (public or private), they can or cannot have parameters and their
    // name is ALWAYS of the SAME name as of the class;
    // Constructors are used for initialization of a class;
    // Besides that, they can be OVERLOADED, just like regular methods;

    // This constructors warns the user that a new account's been created;
    public BankAccount() {
        // The like of code this below is a special type of THIS. It's used to call another constructor from this constructor
        // It is used to ensure that if a user don't type any entry parameters, all of the parameters inside of THIS method will be
        // used instead, basically they are default values; A THIS call like that must be the first line of a constructor;

        /* -> */ this(123456789, 0d,"Default User",
                "defaultemail@default.com","(99) 9 9999-9999"); /* <- */

        System.out.println("An new default BankAccount has been created!");

    }
    //This constructor initializes the fields of a class without the need of setters:
    public BankAccount(int number, double balance, String customerName, String email, String phoneNumber) {
        // ** THIS IS THE MAIN CONSTRUCTOR: IT UPDATES ALL OF THE FIELDS **
        //System.out.println("Account constructor with all the parameters has been called!");
        this.accountNumber = number;
        this.balance = balance;
        // as there are setters for every field you could also do this.setBalance(balance);
        // doing so would be very useful specially if there was any kind of validation of entries inside of the setter;
        // *** BUT IS BEST PRACTICE TO SAVE THE VALUES DIRECTLY TO THE FIELD: this.balance = balance; ***
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public BankAccount(String customerName, String email, String phoneNumber) {
        this(99999, 100.15, customerName, email, phoneNumber);
        //the keyword THIS when used like this calls the main constructor and sets the number of balance as 99999 and the balance as 100.15
        //just like an overload method;
    }

    //creating setters for each field(attribute);
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public void setEmail (String email) {
        this.email = email;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    //creating getters for each field:
    public int getAccountNumber() {
        return this.accountNumber;
    }
    public double getBalance () {
        return this.balance;
    }
    public String getCustomerName() {
        return this.customerName;
    }
    public String getEmail() {
        return this.email;
    }
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    //creating deposit method:
    public void depositFunds(double deposit) {
        this.balance += deposit;
        System.out.println("Deposit amount of " + deposit +" complete! Current funds: " + this.balance);
    }

    //creating withdraw method:
    public void withdrawFunds (double withdraw) {
        if(this.balance - withdraw >= 0){
            this.balance -= withdraw;
            System.out.println("Withdrawn of " +withdraw+ " has been complete! Remaining funds: " + this.balance);
        }
        else {
            System.out.println("Withdrawal not processed. Your balance is: " + this.balance);
        }
    }
}
