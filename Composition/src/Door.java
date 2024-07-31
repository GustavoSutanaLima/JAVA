public class Door {
    //fields
    private String model;
    private String color;

    //constructor
    public Door(String model, String color) {
        this.model = model;
        this.color = color;
    }

    //default getters and setters
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void openDoor() {
        System.out.println("The door is now opened!");
    }
    public void closeDoor() {
        System.out.println("The door is now closed!");
    }
}
