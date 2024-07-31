package com.company;

public class Main {

    public static void main(String[] args) {
	    int result = 1 + 2;
	    // 1 + 2 is an expression;
        // the values 1 and 2 are operands;
        // = is an assignment operator;
        // the result defined as an integer value;
        System.out.println("1 + 2 = " + result );
        int previousResult = result;
        System.out.println("Previous result is = " + previousResult);
        result = result - 1;
        System.out.println("3 - 1 = " + result);
        result = result*10;
        System.out.println(result);
        result = result/5;
        System.out.println((result));

        //modulos operator
        result = result % 3; // this should return the remainder from the division of the last "result" value by 3, the result should be 1
        // as the last value of result, according to the code above is 4;
        System.out.println(result);

        result++; // is the same as result = result + 1;
        System.out.println(result);

        result--; // is the same as result = result - 1;
        System.out.println(result);

        result+= 2; //is the same as result = result + 2;
        System.out.println(result);

        result*= 10; //is the same as result = result*10;
        System.out.println(result);

        result/= 5; //is the same as result = result / 5;
        System.out.println(result);

        result-=2; //is the same as result = result - 2;
        System.out.println(result);

        boolean isAlien = false;

        if (isAlien) { //if isAlien evaluates to true the statement below is executed;
            System.out.println("It's an alien!");
        }
        else { //if isAlien is not true the statement below is executed;
            System.out.println("It's NOT an alien");
        }

        int topScore = 50;

        if (topScore != 100) {
            System.out.println("The top score is: " + topScore);
        }
        else {
            System.out.println("The top score is 100.");
        }

        int secondTopScore = 25;

        if (topScore > secondTopScore && topScore < 100) { // && is the AND operator in Java;
            System.out.println("Greater than the second top score and less than 100");
        }

        if (topScore > 90 || secondTopScore <= 90) { // || (double pipes) is the OR operator in Java;
            System.out.println("either or both of the conditions are true");

        }

        boolean isCarBlue = true; //this is a way for you to say that a Car is blue

        if (!isCarBlue) { // using an exclamation point before the boolean variable name means you are negating it's value
            System.out.println("The car Is NOT blue"); // if a value is true, !value is false and vice-versa; therefore ! is the NOT operator;
        }
        else {
            System.out.println("The car is blue");
        }

        //THIS IS THE TERNARY OPERATOR: basically it's a short cut for an if-else statement, usually used to assign a value to a variable depending
        //of a given condition, example:

        int thisIsMyAge = 27;

        boolean wasMyAge27 = (thisIsMyAge == 27) ? true : false; // this assigns the value true to wasMyAge27 if the condition "thisIsMyAge == 27" is
        // match, otherwise it' assigns flase to the variable wasMyAge27;
        System.out.println(wasMyAge27);

        // ternary operator also works with other data types;
        String thisIsOnlyATest = (thisIsMyAge >= 27) ? "I'm getting old! :(" : "I'm still young! :D";
        System.out.println(thisIsOnlyATest);

        String summaryOfOperators = "https://docs.oracle.com/javase/tutorial/java/nutsandbolts/opsummary.html";
        System.out.println(summaryOfOperators);

        String summaryofOperatoresPrecedence = "https://www.cs.bilkent.edu.tr/~guvenir/courses/CS101/op_precedence.html";
        System.out.println(summaryofOperatoresPrecedence);

        myChallenge();
    }
    public static void myChallenge() {
        double doubleValueOne = 20d;
        double doubleValueTwo = 80d;
        double myValueOne = 100*(doubleValueOne + doubleValueTwo);
        double myRemainder = myValueOne % 40;
        boolean checkMyRemainder = (myRemainder == 0) ? true : false ; // Ternary operator;
        System.out.println(checkMyRemainder);

        if (!checkMyRemainder) {
            System.out.println("Got some remainder");
        }
        else {
            System.out.println("Remainder is equals zero");
        }
    }
}
