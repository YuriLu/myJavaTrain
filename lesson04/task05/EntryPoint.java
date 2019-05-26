package lesson04.task05;

public class EntryPoint {
    public static void main(String[] args) {
        int number = 1234567;

        Printer.print("\nReversed number for " + number + " is = " + NumberReverseLogic.reverseDigits(number));
    }
}
