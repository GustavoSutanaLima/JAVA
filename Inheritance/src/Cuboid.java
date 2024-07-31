public class Cuboid extends Rectangle{
    // creating a new field for the Cuboid class;
    private double height;

    public Cuboid (double width, double length, double height) {
        super(width,length);
        if (height < 0) {
            this.height = 0;
        }
        else {
            this.height = height;
        }
    }

    //creating getters
    public double getHeight () {
        return this.height;
    }
    public double getVolume () {
        return super.getArea()*this.getHeight();
    }
}
