package com.company;

public class Main {

    public static void main(String[] args) {
	    int value = 3;
	    if (value == 1) {
            System.out.println("Value was One");
        }
	    else if (value == 2) {
            System.out.println("Value was Two");
        }
	    else {
            System.out.println("Neither One or Two;");
        }

	    //*** SWITCH STATEMENT ***
        // The SWITCH statement is equivalent to the IF-ELSE statement;
        // in order for it to be used you have to type the keyword switch;
        // value you want to analyse must come inside the parentheses;
        // in the example below i'm testing the value of the variable "valueSwitch";


        //SWITCH IS USEFUL TO CHECK DIFFERENT VALUES FOR THE SAME VARIABLE;

        int valueSwitch = 4;

	    switch(valueSwitch) {
            case 1: { //in case of the value of the variable is '1', the follow is executed;
                System.out.println("The value of the variable 'valueSwitch' is one");
                break; //<< the break keyword makes you jump out of the switch statement;
            }
            case 2: {
                System.out.println("The value of the variable 'valueSwitch' is two");
                break;
            }
            //shortcut for multiples cases: this is similar to an IF statement with OR args;
            case 3: case 4: case 5: {
                System.out.println("The value of the variable is either 3 or 4 or 5");
                break; //<<-- the importance of break:
                //            if this wasn't here, the code would've executed this case section;
                //            and the default case as well because, and everything that was below it;
                //            basically the break statement makes us jump out of the switch case;

                // *** BREAKS ARE VITAL DO END EACH CASE; ***
            }

            default: { //this is similar to 'else' (IF-ElSE statement);
                System.out.println("If the value is neither '1' or '2', the default value returned");
                break;
            }
        }
    }
}
