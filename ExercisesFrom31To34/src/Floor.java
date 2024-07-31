public class Floor {
    //class fields;
    private double width;
    private double length;

    //creating a constructor that initialises the fields;
    public Floor (double width, double length) {
        if (width >= 0) {
            this.width = width;
        }
        else {
            this.width = 0;
        }
        if (length >= 0) {
            this.length = length;
        }
        else {
            this.length = 0;
        }
    }

    public double getArea () {
        return this.length*this.width;
    }
}
