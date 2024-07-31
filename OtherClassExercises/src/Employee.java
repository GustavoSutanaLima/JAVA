public class Employee {

    //creating Class fields
    private int id;
    private String firstName;
    private String lastName;
    private int salary;
    private String name;

    //Creating the constructor to initialise the class's attributes;
    public Employee (int id, String firstName, String lastName, int salary) {
        this.id  = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.name = firstName + " " + lastName;
    }

    //Creating getters;


    public int getID() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getName() {
        return this.name;
    }

    public int getSalary() {
        return salary;
    }

    public int getAnnualSalary() {
        return this.salary*12;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int raiseSalary (int percent) {
        // This is the new salary a raise in percent, an then the new value is updated to the field variable;
        double additional = 1 + (double) percent/100;
        double newSalary = this.salary * additional;
        this.salary = (int) newSalary;
        return this.salary;
    }

    public String toString() {
        return "Employee[ID ="+this.getID()+", name="+ this.getName()+", salary="+this.getSalary()+"]";
    }
}
