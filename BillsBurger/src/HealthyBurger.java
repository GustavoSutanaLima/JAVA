public class HealthyBurger extends Hamburger {

    private String healthyExtra1Name;
    private double healthyExtra1Price = 0;

    private String healthyExtra2Name;
    private double healthyExtra2Price = 0;
    //private double auxPrice;


    public HealthyBurger(String meat, double price) {
        super("Healthy Burger", meat, price, "Brown");
    }


    public void addHealthyAddition1(String healthyExtra1Name, double healthyExtra1Price) {
        this.healthyExtra1Name = healthyExtra1Name;
        this.healthyExtra1Price = healthyExtra1Price;
        if (this.healthyExtra1Name != null || this.healthyExtra1Price != 0) {
            System.out.println("Added " + this.healthyExtra1Name + " for an extra " + this.healthyExtra1Price);
        }

    }

    public void addHealthyAddition2(String healthyExtra2Name, double healthyExtra2Price) {
        this.healthyExtra2Name = healthyExtra2Name;
        this.healthyExtra2Price = healthyExtra2Price;
        if (this.healthyExtra2Name != null || this.healthyExtra2Price != 0) {
            System.out.println("Added " + this.healthyExtra2Name + " for an extra " + this.healthyExtra2Price);
        }
    }

    @Override
    public double itemizeHamburger() {
        if (this.healthyExtra1Price > 0 || this.healthyExtra2Price > 0) {
            return super.itemizeHamburger() + this.healthyExtra1Price + this.healthyExtra2Price;
        } else {
            return super.itemizeHamburger();
        }
    }
}