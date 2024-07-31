public class TestOne {
    public static void printSquareStar (int number) {
        if (number < 5 ) {
            System.out.println("Invalid Value");
        }
        else {
            int row = 1;
            int column = 1;
            int LAST_ELEMENT = number;

            while(row <= number){
                while(column <= number){
                    if (row == 1 || row == LAST_ELEMENT) {
                        System.out.print("*");
                    }
                    else if (row == column) {
                        System.out.print("*");
                    }
                    else if (column == LAST_ELEMENT - row + 1) {
                        System.out.print("*");
                    }
                    else if (column == 1 || column == LAST_ELEMENT) {
                        System.out.print("*");
                    }
                    else {
                        System.out.print(" ");
                    }
                    column++;
                }
                column = 1;
                System.out.println(" ");
                row++;
            }
        }

    }
}