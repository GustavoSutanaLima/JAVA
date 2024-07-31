public class BarkingDog {
    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if (hourOfDay >= 0 && hourOfDay <= 23) {
            //valid value
            if (barking && (hourOfDay < 8 || hourOfDay > 22)) { //barking == true is redundant, you can simplify it using only barking if it's meant no mean true;
                return true;
            }
        }
        return false;
    }
}
