public class Main {
    public static void main(String[] args) {
        // Encapsulation is used to make your class's fields and methods a bit more secure
        // by using different access modifiers like private (methods and variables will be only
        // accessible from within the class);

//        Player playerOne = new Player();
//        //As the Player class has no constructor, all values are set to default;
//        // If in fact there were a constructor, you'd have to pass these values for the fields
//        // which the class "argument" (class's parameters);
//
//
//        EnhancedPlayer playerTwo = new EnhancedPlayer("Gustavo",300, "Spear");
//
//        System.out.println(playerTwo.getHealthBar());
//
//        playerTwo.looseHealth(31);
//        System.out.println(playerTwo.getHealthBar());
//
//        playerTwo.looseHealth(29);
//        System.out.println(playerTwo.getHealthBar());
//
//        playerTwo.looseHealth(0);
//        System.out.println(playerTwo.getHealthBar());

        Printer myWorkPrinter = new Printer("Brother", "HL1202", 50, false);

        myWorkPrinter.print(625);

        System.out.println(myWorkPrinter.getTonerLevel());

        System.out.println(myWorkPrinter.getNumberOfPagesPrinted());

    }
}
