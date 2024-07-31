public class Vehicle {
    //declaring fields;
    private String steeringType;
    private double speed;
    private int numberOfSeats;
    private String color;


    //creating a constructor to initialise the class Vehicle;
    public Vehicle(String steeringType, double speed, int numberOfSeats, String color) {
        this.steeringType = steeringType;
        this.speed = speed;
        this.numberOfSeats = numberOfSeats;
        this.color =  color;
        // ^ this refers to an object (or instance) of the class;
    }

    public void accelerate () {
        System.out.println("Gaining speed...");
    }
    public void breaking () {
        System.out.println("Loosing speed...");
    }

    public String getSteeringType() {
        return steeringType;
    }

    public void setSteeringType(String steeringType) {
        this.steeringType = steeringType;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
