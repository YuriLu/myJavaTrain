package lesson04.task04;

public class DigitLogic {
    public static int getDigit(int number, int digitPosition) {
        return (int) ((number / Math.pow(10, digitPosition - 1)) % 10);
    }
}
