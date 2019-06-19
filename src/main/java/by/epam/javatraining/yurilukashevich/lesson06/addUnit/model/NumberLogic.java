package by.epam.javatraining.yurilukashevich.lesson06.addUnit.model;

public class NumberLogic {

    private static final int MAX_DIGIT_ONE_DIGIT_NUMBER = 9;

    public static int checkAmountOfEven(int number) {
        number = number > 0 ? number : -number;
        int count = 0;

        while (number > 0) {
            int digit = number % 10;
            if (isEven(digit)) {
                count++;
            }
            number /= 10;
        }
        return count;
    }

    public static int checkAmountOfOdd(int number) {
        number = number > 0 ? number : -number;
        int count = 0;

        while (number > 0) {
            int digit = number % 10;
            if (!isEven(digit)) {
                count++;
            }
            number /= 10;
        }
        return count;
    }

    private static boolean isEven(int digit) {
        return digit % 2 == 0;
    }

    public static int checkSum(int number) {
        int sum = 0;
        number = number > 0 ? number : -number;

        while (number > 0) {
            int digit = number % 10;
            sum += digit;
            number /= 10;
        }
        return sum;
    }

    public static int checkMultiplication(int number) {
        int result = 1;
        number = number > 0 ? number : -number;

        while (number > 0) {
            int digit = number % 10;
            result *= digit;
            number /= 10;
        }
        return result;
    }

    public static double checkArithmeticalSum(int number) {
        double sum = 0.0;
        double count = 0.0;
        number = number > 0 ? number : -number;

        while (number > 0) {
            count++;
            int digit = number % 10;
            sum += digit;
            number /= 10;
        }
        return sum / count;
    }

    public static double checkGeometricalSum(int number) {
        double result = 1.0;
        double count = 0.0;
        number = number > 0 ? number : -number;

        while (number > 0) {
            count++;
            int digit = number % 10;
            result *= digit;
            number /= 10;
        }
        double rootDegree = 1 / count;

        return Math.pow(result, rootDegree);
    }

    public static boolean isPalindrome(int number) {
        int numLocal = number;
        double count = 0;
        double multiplier = 10;
        boolean result = false;
        number = number > 0 ? number : -number;

        while (numLocal > 0) {
            count++;
            numLocal /= 10;
        }

        while (number > 0) {
            int digit = number % 10;

            int firstDigit = (int) (number / Math.pow(multiplier, count - 1)) % 10;
            number %= firstDigit * Math.pow(multiplier, count - 1);
            number /= 10;

            if (digit == firstDigit) {
                result = true;
                count -= 2;
            }
        }
        return result;
    }

    public static boolean isDigitsEqual(int number) {
        boolean result = false;
        number = number > 0 ? number : -number;

        if (number > MAX_DIGIT_ONE_DIGIT_NUMBER) {
            while (number / 10 != 0) {
                int previousDigit = number % 10;
                int currentDigit = (number /= 10) % 10;
                if (previousDigit == currentDigit) {
                    result = true;
                } else {
                    result = false;
                    break;
                }
            }
        }
        return result;
    }

    public static boolean isDigitsNotEqual(int number) {
        boolean result = false;
        number = number > 0 ? number : -number;

        while (number / 10 != 0) {
            int previousDigit = number % 10;
            int currentDigit = (number /= 10) % 10;
            if (previousDigit != currentDigit) {
                result = true;
            } else {
                result = false;
                break;
            }
        }
        return result;
    }

    public static int checkMaxDigit(int number) {
        number = number > 0 ? number : -number;
        int max = number % 10;

        while (number > 0) {
            int digit = number % 10;
            if (digit > max) {
                max = digit;
            }
            if (max == MAX_DIGIT_ONE_DIGIT_NUMBER) {
                break;
            }
            number /= 10;
        }
        return max;
    }

    public static boolean isPerfect(int number) {
        int sum = 0;
        number = number > 0 ? number : -number;

        if (number <= 1) {
            return false;
        }
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum == number;
    }
}

