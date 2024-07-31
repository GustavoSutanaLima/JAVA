public class MinutesToYearsDaysCalculator {
    public static void printYearsAndDays (long minutes) {
        int numberOfYears = 0;
        int remainingDays = 0;
        //getting the int part of it;
        int numberOfDays = (int) minutes/60/24;

        if (numberOfDays >= 365) {
            numberOfYears = numberOfDays/365;
            remainingDays = numberOfDays % 365;
        }
        else {
            remainingDays = numberOfDays;
        }

        if (minutes < 0 ) {
            System.out.println("Invalid Value");
        }
        else {
            System.out.println(minutes + " min = " + numberOfYears + " y and " + remainingDays + " d");
        }

    }
}
