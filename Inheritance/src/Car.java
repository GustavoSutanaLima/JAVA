public class Car extends Vehicle {
    //defining car fields;

    private String typeOfGearChange;
    private int trunk;
    private String typeOfEngine;
    private String nationality;
    private int numberOfDoors;

    //defining the car constructor (as car inherits Vehicle, the initialization has to have super in it);

    public Car(String steeringType, double speed, int numberOfSeats,String typeOfGearChange, String color,
               int trunk, String typeOfEngine, String nationality, int numberOfDoors) {
        super(steeringType, speed, numberOfSeats, color);
        // ^ super is calling the constructor of the parent class (the class that's being extended);
        this.typeOfGearChange = typeOfGearChange;
        this.trunk = trunk;
        this.typeOfEngine = typeOfEngine;
        this.nationality = nationality;
        this.numberOfDoors = numberOfDoors;

    }
    public void openTrunk () {
        System.out.println("Opening trunk.");
    }
    public void turnRadioOn () {
        System.out.println("Turning radio on.");
    }

    public String getTypeOfGearChange() {
        return typeOfGearChange;
    }

    public void setTypeOfGearChange(String typeOfGearChange) {
        this.typeOfGearChange = typeOfGearChange;
    }

    public int getTrunk() {
        return trunk;
    }

    public void setTrunk(int trunk) {
        this.trunk = trunk;
    }

    public String getTypeOfEngine() {
        return typeOfEngine;
    }

    public void setTypeOfEngine(String typeOfEngine) {
        this.typeOfEngine = typeOfEngine;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public void accelerate() {
       // super.accelerate();
       if (this.getTypeOfEngine().toLowerCase() == "electric") {
           System.out.println("Hitting the electric");
       }
       else if (this.getTypeOfEngine().toLowerCase() == "combustion") {
           System.out.println("Hitting the gas");
       }
    }
}
