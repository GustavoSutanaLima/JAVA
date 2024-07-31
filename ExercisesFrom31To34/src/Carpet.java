public class Carpet {
    // creating field
    private double cost;

    // defining the main constructor;
    public Carpet (double cost) {
        if (cost >=0) {
            this.cost = cost;
        }
        else {
            this.cost = 0;
        }
    }

    //defining the getter;
    public double getCost() {
        return this.cost;
    }
}

