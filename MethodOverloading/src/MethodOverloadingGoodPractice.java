public class MethodOverloadingGoodPractice {

    /*
    METHOD OVERLOADING GOOD PRACTICE;
        #ADVENTAGES:
        1 - facilitate method re-use;
        2 - you only have to remember a single method name;
        3 - name consistence;
        4 - flexibility: same method name that may allow different types or numbers of data entry;

        System.out.println() is also another example of method overloading;
     */

    public static int sum(int a, int b) {
        return  a + b;
    }
    public static int sum(int a, int b, int c) {
        return a + b + c;
    }
    public static int sum(int a, int b, int c, int d) {
        return a + b + c + d;
    }
}
