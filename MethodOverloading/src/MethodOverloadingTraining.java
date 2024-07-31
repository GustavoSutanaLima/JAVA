public class MethodOverloadingTraining {
    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if (feet < 0 || (inches > 12 || inches < 0)) {
            System.out.println("Invalid value(s)");
            return -1;
        }
        double centimeters = feet * 12 * 2.54;
        centimeters += inches * 2.54;
        System.out.println(feet + " feet + " + inches + " inches = " + centimeters + " cm");
        return centimeters;
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches < 0) {
            return -1;
        }
        //Converting the inches value to feet, plus the remainder
        //for example: 15 inches / 12 = 1 + (3 inches of remainder)
        int feet = (int) inches / 12;
        int remainderInches = (int) inches % 12;
        return calcFeetAndInchesToCentimeters(feet, remainderInches);
    }
}