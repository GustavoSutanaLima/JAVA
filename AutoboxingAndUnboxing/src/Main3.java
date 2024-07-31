public class Main3 {
    public static void main(String[] args) {
        Bank bank = new Bank("National Australia Bank");

        bank.addBranch("Adelaide");

        bank.addCustomer("Adelaide", "Tim", 50.05);
        bank.addCustomer("Adelaide", "Mike", 175.34);
        bank.addCustomer("Adelaide", "Percy", 220.12);
        bank.addCustomer("Adelaide", "Gustavo", 1236.65);
        System.out.println(bank.addCustomer("Adelaide", "Maria",99999.99));

        bank.addCustomerTransaction("Adelaide", "Tim", 44.22);
        bank.addCustomerTransaction("Adelaide", "Tim", 12.44);
        bank.addCustomerTransaction("Adelaide", "Mike", 1.65);
        bank.addCustomerTransaction ("Adelaide", "Gustavo", 12.56);
        bank.addCustomerTransaction("Adelaide","Gustavo", 8888.88);

        bank.listCustomers("Adelaide", true);
    }
}
