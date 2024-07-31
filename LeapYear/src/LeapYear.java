public class LeapYear {
    public static boolean isLeapYear (int year) {
        boolean myAuxValue;
        if (year < 1 || year > 9999) {
            myAuxValue = false;
        }
        else if (year % 4 == 0 && ((year % 100 == 0 && year % 400 == 0) || (year % 100 != 0)) ){
            myAuxValue = true; //if all this conditions are met the year is a leap year (366 days);
        }
        else if (year % 4 != 0){
            myAuxValue = false;
        }
        else if (year % 100 == 0 && year % 400 == 0) {
            myAuxValue = true;
        }
        else {
            myAuxValue = false;
        }
        return myAuxValue;
    }
}
