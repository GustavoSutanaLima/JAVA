public class Calculator {
    // creating fields
    private Floor floor;
    private Carpet carpet;

    //defining the main constructor;
    public Calculator (Floor floor, Carpet carpet) {
        this.floor = floor;
        this.carpet = carpet;
    }
    public double getTotalCost () {
        return this.floor.getArea()*this.carpet.getCost();
    }
}
