public class SpeedConverter {

    public static long toMilesPerHour(double kilometersPerHours) {
        if (kilometersPerHours < 0) {
            return -1;
        }
        return Math.round(kilometersPerHours/1.609);
    }

    public static void printConversion(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
        } else {
            long milesPerHour = toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour + " km/h = " + Math.round(milesPerHour) + " mi/h");
        }
    }

}
