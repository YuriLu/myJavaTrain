package lesson04.task01;

public class EntryPoint {
    public static void main(String[] args) {
        double a = 45.5;
        double b = 45.5;
        double c = 44.5;

        Printer.print("\nIs numbers " + a + " " + b + " " + c + " equal? ");
        System.out.println(NumberLogic.checkThatDigitsIsEqual(a, b, c));

        Printer.print("\nIs numbers " + a + " " + b + " " + c + " not equal? ");
        System.out.println(NumberLogic.checkThatDigitsIsNotEqual(a, b, c));

    }
}
