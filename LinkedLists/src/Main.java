import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Tim", 54.96);
        Customer anotherCustomer;
        anotherCustomer = customer;
        anotherCustomer.setBalance(12.18);

        System.out.println("Balance for customer " + customer.getName() + " is " + customer.getBalance());

        ArrayList<Integer> intList = new ArrayList<Integer>();

        intList.add(14214);
        intList.add(2654);
        intList.add(2442363);
        intList.add(4897);

        for (int intElement : intList) {
            System.out.println("#"+intList.indexOf(intElement)+":" + intElement);
        }

        System.out.println(" - - - ");

        intList.add(1,2);

        for (int intElement : intList) {
            System.out.println("#"+intList.indexOf(intElement)+":" + intElement);
        }


    }

}
