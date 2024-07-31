public class SecondsAndMinutes {

    //***CONSTANT DECLARATION***//
    //The keyword "final" means you cannot change the value of the constant after it's been declared;
    //Constants are usually named using all characters UPPER-CASED and underscores in between the words;
    public static final String INVALID_VALUE_MESSAGE = "Invalid value!";

    public static String getDurationString (int minutes, int seconds) {
        //declaring an empty string:
        String result;
        //Data entry validation:
        if (minutes < 0 || seconds < 0 || seconds > 59) {
            return INVALID_VALUE_MESSAGE;
        }
        //calculates the total of seconds;
        int totalSeconds = minutes*60 + seconds;
        //calculates the number of hours, and totalHours is defined as a int variable, only
        //the whole parte of this division is going to be assign to it;
        int totalHours = totalSeconds / 3600;
        int totalMinutes = (totalSeconds % 3600) / 60;
        if (totalHours <= 9) {
            result = "0"+totalHours+"h ";
        }
        else {
            result = totalHours+"h ";
        }
        if (totalMinutes <= 9) {
            result += "0"+totalMinutes+"m ";
        }
        else {
            result += totalMinutes+"m ";
        }
        if (seconds <= 9) {
            result += "0"+seconds+"s";
        }
        else {
            result += seconds+"s";
        }
        return result;
    }
    public static String getDurationString (int seconds) {
        if (seconds < 0 ) {
            return INVALID_VALUE_MESSAGE;
        }
        int totalMinutes = seconds/60;
        int totalSeconds = seconds % 60;
        return getDurationString(totalMinutes,totalSeconds);
    }
}
