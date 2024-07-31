// Creating another parent class (named Fish) that inherits from animal;
public class Fish extends Animal {

    private int gills;
    private int eyes;
    private int fins;

    public Fish(String name, int brain, int body, int size, int weight, int gills, int eyes, int fins) {
        super(name, brain, body, size, weight);
        // ^ this calls the Animal parent Class constructor therefore initializing it within the child class Fish;
        this.gills = gills;
        this.eyes = eyes;
        this.fins = fins;
        // ^ these initialize all of the Fish class fields;
    }

    private void swim (int yards) {
        System.out.println(this.getName() +" swum " + yards + " yards.");
    }

    //overriding the Animal's method move so it can fit properly with the child class Fish;
    @Override
    public void moveForward(int yards) {
        swim(yards);
    }
}
