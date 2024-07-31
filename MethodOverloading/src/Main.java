public class Main {
    public static void main(String[] args) {
        int newScore =  calculateScore("Gustavo", 130407);
        System.out.println(newScore);
        int newScoreTwo = calculateScore(4652);
        System.out.println(newScoreTwo);
        calculateScore();
        System.out.println(MethodOverloadingTraining.calcFeetAndInchesToCentimeters(0,15));
        System.out.println(MethodOverloadingTraining.calcFeetAndInchesToCentimeters(15));

    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("The player " + playerName + " scored " + score + " points.");
        return score;
    }
    //This method below has same name of the above but it has one less parameter;
    public static int calculateScore(int score) {
        System.out.println("An unnamed player scored " + score + " points.");
        return score;
    }

    public static int calculateScore() {
        System.out.println("No players and no score, can't return anything.");
        return 0;
    }

    // *** METHOD OVERLOAD DEFINITION ***
    // In Java, two or more methods MAY HAVE THE SAME NAME if they DIFFER in parameters
    // (different NUMBER of PARAMETERS, different TYPES of PARAMETERS, or both).
    // These methods are called overloaded methods and this feature is called method overloading.

    // ** What makes a method UNIQUE is its NUMBER and TYPE os its PARAMETERS, and NOT its name; **
}
