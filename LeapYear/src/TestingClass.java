public class TestingClass {
    public static void main(String[] args) {
        for (int i = -10; i<12000; i++){
            System.out.println("The year is: " + i + " Is it leap year? " + LeapYear.isLeapYear(i));
        }
    }
}
