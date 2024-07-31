public class Cylinder extends Circle{
    // The Cylinder class is extending the Circle class;
    // in other words, Cylinder is inheriting all methods and fields from Circle;

    // Creating fields for Circle:
    private double height;

    // When using inheritance you have to initialise the parent class inside the child class;
    // This is done by calling the parent's constructor class within the child's using super();

    //defining the Cylinder constructor;

    public Cylinder(double radius, double height) {
        super(radius); // <- super is calling the main parent constructor;

        // the field height is being initialised;
        if (height < 0) {
            this.height = 0;
        }
        else {
            this.height = height;
        }
    }

    public double getHeight() {
        return this.height;
    }

    public double getVolume() {
        return this.getHeight()*super.getArea();
    }

}
