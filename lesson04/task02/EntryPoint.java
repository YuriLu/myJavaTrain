package lesson04.task02;

public class EntryPoint {
    public static void main(String[] args) {
        double radiusOne = 25.6;
        double radiusTwo = 18.7;

        Printer.print("\nRing area for R1 = " + radiusOne + " and R2 = " + radiusTwo + ", is S = " + RingLogic.getRingArea(radiusOne, radiusTwo));
    }
}
