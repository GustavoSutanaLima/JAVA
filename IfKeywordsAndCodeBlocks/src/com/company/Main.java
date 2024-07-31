package com.company;

public class Main {

    public static void main(String[] args) {

        boolean gameOver = true;
	    int score = 5000;
	    int levelCompleted = 5;
	    int bonus = 500;

// **CODE BLOCK**
	    // within an if statement you need to add curly braces ({}) for form a CODE BLOCK;
        // when you have a if statement with only one line of execution, its OK not to add the braces,
        // but otherwise you'll run into problems if you don't do that;

// **COMMENTING MULTIPLE LINES ON WINDOWS => CTRL + /;**
//	    if (score > 5000) {
//            System.out.println("Your score was greater than 5000");
//        }
//	    else if (score == 5000) {
//            System.out.println("Your score was 5000!");
//        }
//	    else {
//            System.out.println("Your score was grater than 5000. Good job!");
//        }

        if (gameOver) {
            int finalScore = score  + (levelCompleted * bonus); //this variable was created inside of this code block;
            System.out.println("Your final score was: " + finalScore); //therefore it's not accessible out side of it;
         }
            // finalScore = 1; if i try to do that, java wont allow me to, cause the variable finalScore was created inside of the
            // if statement and because of that it's only accessible inside of it. after the if statement is finished running,
            // the variable is deleted, similar to functions where you don't define global variables inside of it (python programming language);

        generalGameScore(10000, 8, 200, true);

    }
        public static void generalGameScore(int score, int levelCompleted, int bonus, boolean gameOver) {
            if (gameOver) {
                int finalScore = score + (levelCompleted * bonus);
                System.out.println("Your final score was: " + finalScore);
            }
        }
}
