public class MegaBytesConverter {
    public static void printMegaBytesAndKiloBytes (int kyloBytes) {
        if (kyloBytes >= 0) {
            int remainingKyloBytes = kyloBytes % 1024;
            int megaByte = Math.round( kyloBytes / 1024); //casting so i can convert this value to double data type;
            System.out.println(kyloBytes + " KB = " + megaByte + " MB and " + remainingKyloBytes + " KB");
        } else {                                        //this cast her is so i can output this value as an int;
            System.out.println("Invalid Value");
        }
    }
}


//    Write a method called printMegaBytesAndKiloBytes that has 1 parameter of type int with the name kiloBytes.
//
//    The method should not return anything (void) and it needs to calculate the megabytes and remaining kilobytes from the kilobytes parameter.
//
//    Then it needs to print a message in the format "XX KB = YY MB and ZZ KB".