package by.epam.javatraining.yurilukashevich.lesson06.task02.model;

public class NumberLogic {

    public static boolean IsIncreasing(int number) {
        number = number > 0 ? number : -number;     //reverse negative number
        boolean result = false;

        if (number > 9) {                           //we need only numbers with 2 and more digits
            while (number / 10 != 0) {
                int previousDigit = number % 10;
                int currentDigit = (number /= 10) % 10;

                if (currentDigit < previousDigit) {
                    result = true;
                } else {
                    result = false;
                    break;
                }
            }
        }
        return result;
    }

    public static boolean IsDecreasing(int number) {
        number = number > 0 ? number : -number;     //reverse negative number
        boolean result = false;

        if (number > 9) {                           //we need only numbers with 2 and more digits
            while (number / 10 != 0) {
                int previousDigit = number % 10;
                int currentDigit = (number /= 10) % 10;

                if (currentDigit > previousDigit) {
                    result = true;
                } else {
                    result = false;
                    break;
                }
            }
        }
        return result;
    }
}
