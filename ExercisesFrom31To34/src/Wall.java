/* ***IMPORTANT STUFF ABOUT THIS KEYWORD***

     When the keyword this is used with a field in a dot notation-like syntax,
     it refers to the object you'll be instantiating later when using the class to
     create objects;

     When the keyword this is used as a function (or method) it refers to its own class,
     specifically to the main constructor that initialises the class;

 */

public class Wall {
    //declaring fields;
    private double height;
    private double width;

    //creating getters and setters with intelliJ's feature:

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height < 0) {
            this.height = 0;
        }
        else {
            this.height = height;
        }
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width < 0) {
            this.width = 0;
        }
        else {
            this.width = width;
        }
    }

    //creating a method to get the area:
    public double getArea () {
        return this.height*this.width;
    }

    //Creating the main constructor;
    public Wall (double width, double height) {
        setHeight(height);
        setWidth(width);
    }

    //creating an empty constructor that calls the main constructor to se default values
    //using THIS as as method;
    public Wall() {
        this(0,0);
    }
}



