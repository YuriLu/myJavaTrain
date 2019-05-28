package by.epam.training.yurilukashevich.lesson04.task05;

public class EntryPoint {
    public static void main(String[] args) {
        int number = 1234567;

        int result = NumberLogic.reverseSevenDigitNumber(number);
        Printer.print("\nReversed number for " + number + " is = " + result + "\n");
    }
}
