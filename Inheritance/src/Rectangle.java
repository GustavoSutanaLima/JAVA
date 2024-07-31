public class Rectangle {
    //creating the class fields:
    private double width;
    private double length;

    //creating the rectangle's class constructor:
    public Rectangle (double width, double length) {
        if (width < 0) {
            this.width = 0;
        }
        else {
            this.width = width;
        }
        if (length < 0) {
            this.length = 0;
        }
        else {
            this.length = length;
        }
    }

    //creating getters
    public double getWidth() {
        return width;
    }
    public double getLength() {
        return length;
    }
    public double getArea() {
        return width*length;
    }
}

