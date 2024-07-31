package com.company;

public class Main {

    public static void main(String[] args) {
	    int int2 = 5;  //declaring an int variable with the value of 5;
        // int is a keyword, a reserved word that cannot be used no name variables, classes, methods and so on;
        // it's something native from the language an cannot be changed, there are 53 keywords;
        // new (keyword) is an example of keyword that's used to create new objects;
        // public is another keyword, known as one of the access modifiers;
        // other keywords, true, fall and null;

        //EXPRESSIONS: they're built with values, variables e operators
        double miles = 100d;
        double kilometers = miles*1.609344; //this expression converts miles into kilometers
        System.out.println(kilometers);

        if (kilometers > 100) { //the if statement is not an expression, but the condition within its
            System.out.println("This is a long road to travel!"); // parenthesis are in fact an expression;
            System.out.println("This string right here also considered an expression!!!");
        }
    }
}
