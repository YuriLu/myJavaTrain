package by.epam.javatraining.yurilukashevich.lesson06.task02.model;

public class NumberLogic {
    private static final int MAX_DIGIT_ONE_DIGIT_NUMBER = 9;

    public static boolean IsIncreasing(int number) {
        number = number > 0 ? number : -number;     //reverse negative number
        boolean result = true;

        if (number <= MAX_DIGIT_ONE_DIGIT_NUMBER) {//we need only numbers with 2 and more digits
            return false;
        }
        while (number / 10 != 0) {
            int lastDigit = number % 10;
            int currentDigit = (number /= 10) % 10;
            if (currentDigit > lastDigit) {
                result = false;
                break;
            }
        }
        return result;
    }

    public static boolean IsDecreasing(int number) {
        number = number > 0 ? number : -number;     //reverse negative number
        boolean result = true;

        if (number <= MAX_DIGIT_ONE_DIGIT_NUMBER) {//we need only numbers with 2 and more digits
            return false;
        }
        while (number / 10 != 0) {
            int lastDigit = number % 10;
            int currentDigit = (number /= 10) % 10;
            if (currentDigit < lastDigit) {
                result = false;
                break;
            }
        }
        return result;
    }
}
