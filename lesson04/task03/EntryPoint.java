package by.epam.training.yurilukashevich.lesson04.task03;

public class EntryPoint {
    public static void main(String[] args) {

        int number = 1439;
        boolean result = CheckNumber.checkIsIncreasing(number);
        Printer.print("\nIs number " + number + " with rising digits order? --> "
                + result + "\n");

        number = 9562;
        result = CheckNumber.checkIsDecreasing(number);
        Printer.print("\nIs number " + number + " with decreasing digits order? --> "
                + result + "\n");
    }
}
