public class Circle {
    //creating Circle's fields;
    private double radius;

    //overloading the constructor method:
    public Circle () {
        this.radius = 1;
    }

    public Circle (double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea () {
        return this.radius*this.radius*Math.PI;
    }

    public double getCircumference () {
        return 2*this.radius*Math.PI;
    }

    // toString() is been overriding because it's already a native method from Java with the same name;
    // in Java every class inherits from a class called Objects.java which allows all users to use the basic and
    // default methods;
    @Override
    public String toString(){
        return "Circle[radius="+this.radius+"]";
    }

    // Using toString() as a overridden method allows us to print the object from this class
    // actually returning a string, (just like in the return statement), without this method
    // trying to print this object out would probably return the location in memory that object's
    // been stored;
}
