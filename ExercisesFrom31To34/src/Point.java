public class Point {
    // class fields:
    private int x;
    private int y;

    // creating constructors:
    // Main constructor;
    public Point (int x, int y) {
        this.x = x;
        this.y = y;
    }
    // Empty default constructor;
    public Point () {
        this(0,0); //this is calling the main constructor passing
    }

    //creating getters and setters:

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance() {
        return Math.sqrt(Math.pow(this.x,2) + Math.pow(this.y,2));
    }
    public double distance(int xCustom, int yCustom) {
        int auxX = xCustom - this.x;
        int auxY = yCustom - this.y;
        return Math.sqrt(Math.pow(auxX,2) + Math.pow(auxY,2));
    }
    public double distance(Point customPoint) {
        int auxX = customPoint.x - this.x;
        int auxY = customPoint.y - this.y;
        return Math.sqrt(Math.pow(auxX,2) + Math.pow(auxY,2));
    }
}

