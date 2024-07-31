public class TesterClass {
    public static void main(String[] args) {
        System.out.println(AreaCalculator.area(5.0D));
        System.out.println(AreaCalculator.area(-1));
        System.out.println(AreaCalculator.area(5.0,4.0));
        System.out.println(AreaCalculator.area(-1, 4));

        MinutesToYearsDaysCalculator.printYearsAndDays(27684);
        MinutesToYearsDaysCalculator.printYearsAndDays(1440);
        MinutesToYearsDaysCalculator.printYearsAndDays(532800);
        MinutesToYearsDaysCalculator.printYearsAndDays(525600);
        MinutesToYearsDaysCalculator.printYearsAndDays(1051200);
        MinutesToYearsDaysCalculator.printYearsAndDays(561600);

        IntEqualityPrinter.printEqual(12,13,14);
        IntEqualityPrinter.printEqual(12,12,12);
        IntEqualityPrinter.printEqual(-12,13,14);
        IntEqualityPrinter.printEqual(12,13,12);

        System.out.println(PlayingCat.isCatPlaying(false, 35));
    }
}
