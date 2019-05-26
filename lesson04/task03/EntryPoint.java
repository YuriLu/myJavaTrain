package lesson04.task03;

public class EntryPoint {
    public static void main(String[] args) {

        int number = 1459;
        Printer.print("\nIs number " + number + " with rising digits order? " + CheckNumber.checkIsIncreasing(number) + "\n");

        number = 9542;
        Printer.print("\nIs number " + number + " with decreasing digits order? " + CheckNumber.checkIsDecreasing(number) + "\n");
    }
}
