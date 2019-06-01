package by.epam.javatraining.yurilukashevich.lesson04.task01;

public class EntryPoint {
    public static void main(String[] args) {
        double a = 45.5;
        double b = 45.5;
        double c = 45.5;

        boolean result = NumberLogic.isDigitsEqual(a, b, c);
        Printer.print("\nIs numbers " + a + " " + b + " " + c + " equal? --> " + result);

        result = (NumberLogic.isDigitsNotEqual(a, b, c));
        Printer.print("\nIs numbers " + a + " " + b + " " + c + " not equal? --> " + result);
    }
}
