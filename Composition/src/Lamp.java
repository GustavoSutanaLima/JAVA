public class Lamp {
    //defining its fields;
    private String style;
    private boolean battery;
    private int globRating;

    //main constructor: which initializes the class;
    public Lamp(String style, boolean battery, int globRating) {
        this.style = style;
        this.battery = battery;
        this.globRating = globRating;
    }

    public void turnOn () {
        System.out.println("Lamp -> Turning on");
    }

    public String getStyle () {
        return this.style;
    }

    public boolean isBattery () {
        return this.battery;
    }

    public  int getGlobRating () {
        return this.globRating;
    }
}
