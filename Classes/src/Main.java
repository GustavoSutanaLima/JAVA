public class Main {
    public static void main(String[] args) {
        VipCustomer defaultCustomer = new VipCustomer();
        VipCustomer customCustomer = new VipCustomer("Gustavo");
        VipCustomer customCompleteCustomer = new VipCustomer("Huston", 25000, "hustonjackson@yahoo.com");


        System.out.println(defaultCustomer.getName());
        System.out.println(defaultCustomer.getEmail());
        System.out.println(defaultCustomer.getCreditCardLimit());
        System.out.println(".");

        System.out.println(customCustomer.getName());
        System.out.println(customCustomer.getEmail());
        System.out.println(customCustomer.getCreditCardLimit());
        System.out.println(".");

        System.out.println(customCompleteCustomer.getName());
        System.out.println(customCompleteCustomer.getEmail());
        System.out.println(customCompleteCustomer.getCreditCardLimit());
        System.out.println(".");
    }
}
