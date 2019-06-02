package by.epam.javatraining.yurilukashevich.lesson06.task04.model;

public class NumberLogic {

    public static boolean checkParity(int number) {
        boolean result = false;

        number = number > 0 ? number : -number;

        if (number > 9) {
            while (number / 10 != 0) {
                int previousDigit = number % 10;
                int currentDigit = (number /= 10) % 10;
                if (checkEven(previousDigit, currentDigit) || checkOdd(previousDigit, currentDigit)) {
                    result = true;
                } else {
                    result = false;
                    break;
                }
            }
        }
        return result;
    }

    private static boolean checkEven(int previousDigit, int currentDigit) {
        return previousDigit % 2 == 0 && currentDigit % 2 == 0;
    }

    private static boolean checkOdd(int previousDigit, int currentDigit) {
        return previousDigit % 2 != 0 && currentDigit % 2 != 0;
    }
}

