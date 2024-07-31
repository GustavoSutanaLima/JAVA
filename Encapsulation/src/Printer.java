import java.text.DecimalFormat;

public class Printer {
    // Class fields;
    private String brand;
    private String model;

    // This is a default value for numberOfCopies;
    private int numberOfPagesItCanPrint = 5000;

    //This is the default value for the toner level, it's always full (100% charge) when a new Printer is created;
    private double tonerLevel = 100;

    //The default value for the duplex feature will be false;
    private boolean duplex;

    private int numberOfPagesPrinted;

    private double numberOfCopiesItWillBeAbleToPrint;

    // Main constructor:
    public Printer (String brand, String model, double tonerLevel, boolean duplex) {
        this.brand = brand;
        this.model = model;

        // This is a validation for a custom number of copies:
        // if it's a different number than 5000 but it's within the range (0,5000]
        // then this value will be passed to this.numberOfCopies;
        // basically this means the maximum number of copies is 5000

        if (tonerLevel > 0 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        }
        this.duplex = duplex;

    }

    public void print (int numberOfCopies) {

        this.numberOfCopiesItWillBeAbleToPrint = (this.tonerLevel*this.numberOfPagesItCanPrint)/100;
        int j = 1;

        for (int i = 1; i<=numberOfCopies; i++) {
                if (this.duplex) {
                    this.numberOfPagesPrinted += 2;
                    this.tonerLevel -= 2*0.02;
                    System.out.println("Printing page number " + j);
                    j += 1;

                }
                else {
                    this.numberOfPagesPrinted += 1;
                    this.tonerLevel -= 0.02;
                    System.out.println("Printing page number " + j);
                }
                if (this.tonerLevel <= 0) {
                    System.out.println("ERROR: EMPTY TONER");
                    break;
                }
                j+=1;
            }
    }


    public void switchToner() {
        //set the toner level to MAX again;
        this.tonerLevel = 100;
    }

    public int getNumberOfPagesPrinted() {
        return this.numberOfPagesPrinted;
    }

    public String getTonerLevel() {
        DecimalFormat df = new DecimalFormat("#.##");
        return df.format(this.tonerLevel);
    }
}

