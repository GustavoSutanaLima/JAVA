public class Main {
    public static void main(String[] args) { //I need a main method inside my Class, to test my
                                             //other methods, even though they are from the same class;
    // the main method will start your applications;
        SpeedConverter.printConversion(10.5);
        System.out.println(SpeedConverter.toMilesPerHour(10.5));
    }
}
