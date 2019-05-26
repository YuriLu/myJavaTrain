package lesson04.task04;

public class EntryPoint {
    public static void main(String[] args) {
        int number = 823456;

        Printer.print("\nArithmetical middle for " + number + " is " + ArithmeticNumberLogic.getArithmeticalMiddle(number));
        System.out.print("\nGeometrical middle for " + number + " is " + ArithmeticNumberLogic.getGeometricalMiddle(number));
    }
}
