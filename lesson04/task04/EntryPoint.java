package by.epam.training.yurilukashevich.lesson04.task04;

public class EntryPoint {
    public static void main(String[] args) {
        int number = 123456;

        double result = ArithmeticNumberLogic.getArithmeticalMiddle(number);
        Printer.print("\nArithmetical middle for " + number + " is " + result);

        result = ArithmeticNumberLogic.getGeometricalMiddle(number);
        Printer.print("\nGeometrical middle for " + number + " is " + result);
    }
}
