public class Toyota extends Car{
    private String model;
    private int numberOfGears;
    private Car car;

    //creating the constructor number one

    public Toyota(String steeringType, double speed, int numberOfSeats, String color,
                  String typeOfGearChange, int trunk, String typeOfEngine, String nationality, int numberOfDoors,
                  String model, int numberOfGears) {
        super(steeringType, speed, numberOfSeats, color, typeOfGearChange, trunk, typeOfEngine, nationality, numberOfDoors);
        this.model = model;
        this.numberOfGears = numberOfGears;
    }

    public Toyota(Car car,
                  String model, int numberOfGears) {
        super(car.getSteeringType(), car.getSpeed(), car.getNumberOfSeats(), car.getColor(), car.getTypeOfGearChange(),
                car.getTrunk(), car.getTypeOfEngine(), car.getNationality(), car.getNumberOfDoors());
        this.model = model;
        this.numberOfGears = numberOfGears;
        this.car = car;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getNumberOfGears() {
        return numberOfGears;
    }

    public void setNumberOfGears(int numberOfGears) {
        this.numberOfGears = numberOfGears;
    }

    @Override
    public void accelerate() {
        //super.accelerate();
        if(this.getTypeOfEngine().toLowerCase() == "electric") {
            System.out.println("Japanese electric warping...");
        }
        else if (this.getTypeOfEngine().toLowerCase() == "combustion") {
            System.out.println("Japanese combustion car warping...");
        }
    }
}

