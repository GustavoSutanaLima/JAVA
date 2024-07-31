package com.company;

public class MyDebuggingClass {
    public static void main(String[] args) {
        Challenges.switchChar('A');
        Challenges.switchString("My name");
        Challenges.printDayOfTheWeek(1);
        Challenges.printDayOfTheWeekTwo(0);
        Challenges.printDayOfTheWeekTwo(-1);
        Challenges.printDayOfTheWeek(-1);
        NumberInWord.printNumberInWord(3);
        NumberInWord.printNumberInWord(-1);
        System.out.println(NumberOfDaysInMonth.getDaysInMonth(3,12000));
        System.out.println(NumberOfDaysInMonth.getDaysInMonth(1,2020));
        System.out.println(NumberOfDaysInMonth.getDaysInMonth(2,2020));
        System.out.println(NumberOfDaysInMonth.getDaysInMonth(2,2018));
        System.out.println(NumberOfDaysInMonth.getDaysInMonth(-1,2020));
        System.out.println(NumberOfDaysInMonth.getDaysInMonth(1,-2020));
        System.out.println(NumberOfDaysInMonth.getDaysInMonth(0,2020));



    }
}
