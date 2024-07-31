public class Main {
    public static void main(String[] args) {
//        House blueHouse = new House("blue");
//        // ^ this is an NEW instance of the Class House, therefore we are creating a new object called blueHouse;
//        House anotherHouse = blueHouse;
//        // ^ here we are creating a variable of the type House called anotherHouse, this is referencing to the same object blueHouse;
//
//        System.out.println(blueHouse.getColor());
//        System.out.println(anotherHouse.getColor());
//        System.out.println();
//
//        anotherHouse.setColor("yellow");
//        //setting the color yellow to anotherHouse ends up modifying the blueHouse, because they refer to the same object;
//        //this is similar to aliasing in Python;
//        // if instead of creating a variable of the type House I had created a new object of that same Class this wouldn't have happened;
//        // only anotherHouse would be yellow;
//
//        System.out.println(blueHouse.getColor());
//        System.out.println(anotherHouse.getColor());
//        System.out.println();
//
//        House greenHouse = new House("green");
//        anotherHouse = greenHouse;
//        // referencing an object like that makes them technically the same, they have like
//        // two names, or as we called in Python two aliases for the same object;
//
//        System.out.println(blueHouse.getColor());
//        System.out.println(anotherHouse.getColor());
//        System.out.println(greenHouse.getColor());
//
//        Vehicle yukon = new Vehicle ("handle bar", 40,1,"grey");
//
//        Car brandLessCar = new Car ("steering wheel", 110,4, "manual", "blue", 0,
//                "electric","brazilian", 2);
//
//        Toyota corolla = new Toyota(brandLessCar, "corolla", 6);
//
//        yukon.accelerate();
//        brandLessCar.accelerate();
//        corolla.accelerate();

//        Circle circle = new Circle(3.75);
//        System.out.println("circle.radius= " + circle.getRadius());
//        System.out.println("circle.area= " + circle.getArea());
//        Cylinder cylinder = new Cylinder(5.55, 7.25);
//        System.out.println("cylinder.radius= " + cylinder.getRadius());
//        System.out.println("cylinder.height= " + cylinder.getHeight());
//        System.out.println("cylinder.area= " + cylinder.getArea());
//        System.out.println("cylinder.volume= " + cylinder.getVolume());

        Rectangle rectangle = new Rectangle(5, 10);
        System.out.println("rectangle.width= " + rectangle.getWidth());
        System.out.println("rectangle.length= " + rectangle.getLength());
        System.out.println("rectangle.area= " + rectangle.getArea());
        Cuboid cuboid = new Cuboid(5,10,5);
        System.out.println("cuboid.width= " + cuboid.getWidth());
        System.out.println("cuboid.length= " + cuboid.getLength());
        System.out.println("cuboid.area= " + cuboid.getArea());
        System.out.println("cuboid.height= " + cuboid.getHeight());
        System.out.println("cuboid.volume= " + cuboid.getVolume());


    }
}
