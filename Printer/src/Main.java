public class Main {
    public static void main(String[] args) {

        Printer mySimplePrinter = new Printer (60, true);

        System.out.println(mySimplePrinter.getTonerLevel());

        mySimplePrinter.addToner(400);

        System.out.println(mySimplePrinter.getTonerLevel());

        System.out.println(mySimplePrinter.printPages(9));

    }

}
