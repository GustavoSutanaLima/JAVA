import java.util.concurrent.TimeUnit;

class Car {
    //defining fields for the Car class;
    private String name;
    private boolean engine = true; //default value for engine;
    private int cylinders;
    private int wheels = 4; //default value for wheels;

    //defining it's constructor;

    public Car (String name, int cylinders) {
        this.name = name;
        this.cylinders = cylinders;
    }

    //simple getters for the fields


    public String getName() {
        return name;
    }

    public boolean isEngine() {
        return engine;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getWheels() {
        return wheels;
    }

    public void startEngine () throws InterruptedException {
        if (this.engine) {
            System.out.println("The engine is being started...");
            for(int i = 1; i<=5; i++) {
                System.out.println(i);
                TimeUnit.SECONDS.sleep(1);
            }
            System.out.println("Engine running!");
        }
    }

    public void accelerate() {
        System.out.println("Car is now accelerating!");
    }

    public void brake () {
        System.out.println("Car is now breaking!");
    }
}

class Toyota extends Car {

    private String model;
    private int year;
    private boolean electric;

    public Toyota (String model, int year, boolean electric, int cylinders) {
        super("Toyota", cylinders);
        this.model  = model;
        this.year = year;
        this.electric = electric;
    }

class Ford extends Car {

    private String model;
    private int year;
    private boolean electric;

    public Ford(String model, int year, boolean electric, int cylinders) {
        super("SideClassOne.Ford", cylinders);
        this.model  = model;
        this.year = year;
        this.electric = electric;
    }

    @Override
    public void accelerate() {
        if (this.electric) {
            System.out.println("Electric " + getClass().getSimpleName() + " Car Accelerating");
        }
        else {
            System.out.println("Regular model accelerating...");
        }
    }
}

    @Override
    public void accelerate() {
        if (this.electric) {
            System.out.println("Electric Toyota Car Accelerating");
        }
        else {
            System.out.println("Regular model accelerating...");
        }
    }
}

class Volkswagen extends Car {

    private String model;
    private int year;

    public Volkswagen (String model, int year, int cylinders) {
        super("Volkswagen", cylinders);
        this.model  = model;
        this.year = year;
    }

    @Override
    public void accelerate() {
        System.out.println("Regular Volkswagen model accelerating...");
    }
}

public class SideClassOne {
    public static void main(String[] args) {
        //this is where your main code is gonna be executed;

        System.out.println(Math.random() + 1);
    }

    //this is where other methods of this class can be created;
    public Car newCar () {
        return new Toyota("Corolla", 2012,false,4);
    }
}

/*
    REFACTOR (intelliJ's built in function) also allows us to copy entire classes
 */

