public class Main {

    public static void main(String[] args) {
        firstWhileLoop();
        secondWhileLoop();
        thirdWhileLoop();
        forthWhileLoop(4,100, 2);
    }

    public static void firstWhileLoop (){
        int count = 0;
        while(count != 5) {
            System.out.println("Count value is: " + count);
            count++;
        }
    }
    public static void secondWhileLoop () {
        int count = 0;
        while(true) {
            System.out.println("Count value is = " + count);
            count ++;
            if (count >= 5) {
                break; //<- the keyword break here also makes me jump out of the while loop;
                       //just like when i was using it on the switch statement;
            }
        }
    }
    public static void thirdWhileLoop() {
        // *** DO WHILE ***
        // This is the DO-WHILE loop, it basically executes everything that's inside the
        // do CODE-BLOCK, while the condition right after it is true;
        // the difference between do-while loop to the conventional while loop is that the do-while
        // loop runs at least one time it's do part branch;
        int count  = 0;
        do {
            System.out.println("Count value was: " + count);
            count ++;
        }
        while (count < 10);
    }
    public static void forthWhileLoop(int start, int finish, int maximumEvenNumbers) {
        int evenCount = 0;
        //int start = 4;
        //int finish = 20;
        while (start <= finish) {
            if(!isEvenNumber(start)) {
                start++;
                continue; //<- this keyword is similar to the BREAK keyword;
            }             // but instead of jumping out of the loop it goes back to the beginning of the loop;
                          // if the start number of not even, it's gonna add 1 to the start variable, then it goes back to the beginning of the loop;
                          // the number start+1 is now check, if its an even number it's not gonna hit the continue keyword, therefore it's gonna print the value of start;
                          // and only then, it's adding the number, then;

            // *** CONTINUE *** in a nutshell: it allow the loop to continue but once it hits this keyword it doesn't process anymore code downward, an goes back to the beginning;
            // *** BREAK *** in this case, break completely stops the loop;

            System.out.println("The even number is: " + start);
            start++;
            evenCount++; // if the number is NOT even it gets added by one;
                         // if the number is EVEN it gets added by one and also the auxiliary variable (evenCount) is added by one;
                         // this only happens if the number is EVEN;

            if (evenCount >= maximumEvenNumbers) {
                System.out.println(evenCount + " even numbers counted!");
                break; // <- if evenCount hits the value of 5 or greater it BREAKS out of the loop;
            }
        }
    }

    public static boolean isEvenNumber (int number) {
        if (number < 0 ) {
            return false;
        }
        else if (number % 2 == 0) {
            return true;
        }
        return false;
    }



}
