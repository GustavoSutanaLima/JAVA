// Start off by creating a class normally.

public class Animal {
    //defining fields : characteristics (or states) of this class (animal); and Methods are the behaviours of an class;
    private String name;
    private int brain;
    private int body;
    private int size;
    private int weight;

    //Creating the main constructor by using intelliJ's feature (alt + insert)
    public Animal(String name, int brain, int body, int size, int weight) {
        this.name = name;
        this.brain = brain;
        this.body = body;
        this.size = size;
        this.weight = weight;
    }

    //Creating getters and setters using intelliJ's feature (alt + insert)

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBrain() {
        return brain;
    }

    public void setBrain(int brain) {
        this.brain = brain;
    }

    public int getBody() {
        return body;
    }

    public void setBody(int body) {
        this.body = body;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void eat () {
        System.out.println(this.getName() + " has started eating.");
    }
    public void moveForward (int yards) {
        System.out.println(this.getName() + " has moved " + yards + " yards forward.");
    }
}
