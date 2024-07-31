

public class Main {
    public static void main(String[] args) {
        ITelephone gustavosPhone; // creating an interface variable;
        DeskPhone gustavosDeskPhone = new DeskPhone(98845567);

        gustavosDeskPhone.callPhone(98845567);
    }
}
