public class Circle {
    //instance variables, fields
    private double radius;

    //creating an constructor:
    public Circle (double radius) {
        if (radius < 0) {
            this.radius = 0;
        }
        else {
            this.radius = radius;
        }
    }

    //creating the getter method for radius;
    public double getRadius () {
        return this.radius;
    }

    //creating the getter method for area;
    public double getArea () {
        return Math.PI*Math.pow(this.getRadius(),2);
    }
}
