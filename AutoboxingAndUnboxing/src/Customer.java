import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Double> transactions;

    public Customer(String nameOfTheCustomer, double initialTransaction) {
        this.name = nameOfTheCustomer;
        this.transactions = new ArrayList<Double>();
        addTransaction(initialTransaction);

    }

    //Getters:
    public String getName () {
        return this.name;
    }
    public ArrayList<Double> getTransactions() {
        return this.transactions;
    }

    //Other methods:

    public void addTransaction(double transaction) {
        this.transactions.add(transaction);
    }


}
