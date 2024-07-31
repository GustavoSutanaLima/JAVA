package com.company;

public class Main {

    public static void main(String[] args) {

        int highScore = calculateScore(true, 800,5,100);
        System.out.println("Your final score was: " + highScore);

        int secondHighScore = calculateScore(true, 10000,8,200);
        System.out.println("Your final score was: " + secondHighScore);

        displayHighScorePosition("Gustavo Sutana Lima", 12354);

        displayHighScorePosition("Teste da Silva Primeiro", calculateHighScorePosition(1500));
        displayHighScorePosition("Teste da Silva Segundo", calculateHighScorePosition(900));
        displayHighScorePosition("Teste da Silva Terceiro", calculateHighScorePosition(400));
        displayHighScorePosition("Teste da Silva Quarto", calculateHighScorePosition(50));

        }

    // ***METHODS***
    // Methods have to be inside of your main class; but not inside of your "public static void main(String[] args)" method;
    //A VOID METHOD - also called PROCEDURE (it means it doesn't return anything, it only does some actions);
    //A NON-VOID method HAVE to return a value no matter what: but it has entry parameters, the return value depends on what type of method was defined;
    // ***PARAMETERS OF A METHOD***
    //boolean (data type) gameOver (variable) -> parameter number one;
    //int score -> parameter number two;
    //int levelCompleted -> parameter number three;
    //int bonus -> parameter number four;

    //This is a non-void method of the type int (this means this methods return an int type value);
    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if (gameOver) {
            int finalScore = score  + (levelCompleted * bonus); //this variable was created inside of this code block;
            finalScore += 1500;                                 //therefore it's not accessible out side of it;
            return finalScore;
        }
        return  -1;
        //**INVALID VALUE**: the reason why -1 one was used here it's because it's a convention for an error or invalid value
    }

    public static void displayHighScorePosition (String playersName, int positionInTheHighScoreTable) {
        System.out.println(playersName + " managed to get into postion " + positionInTheHighScoreTable + " on the high score table.");
    }

    public static int calculateHighScorePosition (double playersScore) {
//        if (playersScore >= 1000) {
//            return 1;
//        } else if (playersScore >= 500){
//            return  2;
//        } else if (playersScore >= 100){
//            return  3;
//        }
//            return 4;
        int position = 4;
        if (playersScore >= 1000) {
            position = 1;
        } else if (playersScore >= 500) {
            position = 2;
        } else if (playersScore >= 100) {
            position = 3;
        }
        return position;
    }
}
