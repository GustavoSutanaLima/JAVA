import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String nameOfTheBranch) {
        this.name = nameOfTheBranch;
        this.customers = new ArrayList<Customer>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return this.customers;
    }

    public boolean newCustomer(String nameOfTheCustomer, double initialTransaction) {
        if (findCustomer(nameOfTheCustomer) == null) {
            this.customers.add(new Customer(nameOfTheCustomer, initialTransaction));
            return true;
        }
        return false;
    }

    public boolean addCustomerTransaction(String nameOfTheCustomer, double transaction) {
        if (findCustomer(nameOfTheCustomer) != null) {
            findCustomer(nameOfTheCustomer).addTransaction(transaction);
            return true;
        }

        return false;
    }

    private Customer findCustomer(String nameOfTheCustomer) {
        for (Customer items : customers) {
            if (items.getName().equals(nameOfTheCustomer)) {
                return items;
            }
        }
        return null;
    }
}
