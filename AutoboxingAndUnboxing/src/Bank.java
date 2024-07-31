import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<Branch>();
    }

    public boolean addBranch(String nameOfTheBranch) {
        if (findBranch(nameOfTheBranch) != null) {
            return false;
        }
        else if(branches.size() == 0) {
            branches.add(new Branch(nameOfTheBranch));
            return true;
        }
        else {
            for (Branch branch : branches) {
                if(branch.getName().equals(nameOfTheBranch)) {
                    branches.add(new Branch(nameOfTheBranch));
                    return true;
                }
            }
        }
        return false;
    }

    public boolean addCustomer (String branchName, String costumerName, double initialTransaction) {
        if (findBranch(branchName) == null) {
            return false;
        }
        else {
            return findBranch(branchName).newCustomer(costumerName, initialTransaction);
        }
    }


//    public boolean addCustomerTransaction(String nameOfTheBranch, String nameOfTheCostumer, double transaction) {
//        for (Branch branch : branches) {
//            if (branch.getName().equals(nameOfTheBranch)) {
//                for (Customer customer : branch.getCustomers()) {
//                    if(customer.getName().equals(nameOfTheCostumer)){
//                        customer.addTransaction(transaction);
//                        return true;
//                    }
//                }
//            }
//        }
//        return false;
//    }

    public boolean addCustomerTransaction(String nameOfTheBranch, String nameOfTheCostumer, double transaction) {
        if (findBranch(nameOfTheBranch) != null ) {
            findBranch(nameOfTheBranch).addCustomerTransaction(nameOfTheCostumer,transaction);
            return true;
        }
        return false;
    }

    private Branch findBranch (String nameOfTheBranch) {
        for (Branch branch : branches) {
            if(branch.getName().equals(nameOfTheBranch)){
                return branch;
            }
        }
        return null;
    }

    public boolean listCustomers(String nameOfTheBranch, boolean printTransaction) {
        if (findBranch(nameOfTheBranch) != null) {
                if(findBranch(nameOfTheBranch).getName().equals(nameOfTheBranch)){
                    System.out.println("Customer details for branch " + findBranch(nameOfTheBranch).getName());
                    for (int i = 1; i<= findBranch(nameOfTheBranch).getCustomers().size(); i ++) {
                        System.out.println("Customer: " + findBranch(nameOfTheBranch).getCustomers().get(i-1).getName() + "[" + i + "]");
                        if (printTransaction) {
                            System.out.println("Transactions");
                            for (int j = 1; j<=findBranch(nameOfTheBranch).getCustomers().get(i-1).getTransactions().size(); j++) {
                                System.out.println("[" + j + "]  Amount " + findBranch(nameOfTheBranch).getCustomers().get(i-1).getTransactions().get(j-1));
                            }
                        }
                    }
                }
                return true;
        }
        return false;
    }
}
