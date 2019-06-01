package by.epam.javatraining.yurilukashevich.lesson04.task02;

public class EntryPoint {
    public static void main(String[] args) {
        double radiusOne = 23.6;
        double radiusTwo = 19.1;

        double result = RingLogic.getRingArea(radiusOne, radiusTwo);
        Printer.print("\nRing area for R1 = " + radiusOne
                + " and R2 = " + radiusTwo + ", is S = " + result + "\n");
    }
}
