public class Hamburger {
    //Defining the fields of the Class

    private String name;
    private String meat;
    private double price;
    private String breadRollType;

    //Creating Class main constructor
    public Hamburger (String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
        System.out.println(this.name + " hamburger on a " + this.breadRollType + " roll with " + this.meat + ", price is " + this.price );
    }

    //Additional variables;
    private String addition1Name;
    private double addition1Price;

    private String addition2Name;
    private double addition2Price;

    private String addition3Name;
    private double addition3Price;

    private String addition4Name;
    private double addition4Price;

    public void addHamburgerAddition1 (String addition1Name, double addition1Price) {
        this.addition1Name = addition1Name;
        this.addition1Price = addition1Price;
        if (this.addition1Name != null || this.addition1Price != 0) {
            System.out.println("Added " + this.addition1Name + " for an extra " + this.addition1Price);
            this.price += this.addition1Price;
        }
    }

    public void addHamburgerAddition2 (String addition2Name, double addition2Price) {
        this.addition2Name = addition2Name;
        this.addition2Price = addition2Price;
        if (this.addition2Name != null || this.addition2Price != 0) {
            System.out.println("Added " + this.addition2Name + " for an extra " + this.addition2Price);
            this.price += this.addition2Price;
        }
    }

    public void addHamburgerAddition3 (String addition3Name, double addition3Price) {
        this.addition3Name = addition3Name;
        this.addition3Price = addition3Price;
        if (this.addition3Name != null || this.addition3Price != 0) {
            System.out.println("Added " + this.addition3Name + " for an extra " + this.addition3Price);
            this.price += this.addition3Price;
        }
    }

    public void addHamburgerAddition4 (String addition4Name, double addition4Price) {
        this.addition4Name = addition4Name;
        this.addition4Price = addition4Price;
        if (this.addition4Name != null || this.addition4Price != 0) {
            System.out.println("Added " + this.addition4Name + " for an extra " + this.addition4Price);
            this.price += this.addition4Price;
        }
    }

    public double itemizeHamburger () {
        return this.price;
    }
}
