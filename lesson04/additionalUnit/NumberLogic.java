package by.epam.training.yurilukashevich.lesson04.additionalUnit;

public class NumberLogic {
    //1
    public static boolean checkForEqualPair(double a, double b, double c) {
        return a == b || b == c || a == c;
    }

    public static boolean checkForOppositePair(double a, double b, double c) {
        return a + b == 0 || b + c == 0 || a + c == 0;
    }

    //2
    public static boolean isPositiveNumbers(double a, double b, double c) {
        return a > 0 && b > 0 && c > 0;
    }

    public static boolean isNegativeNumbers(double a, double b, double c) {
        return a < 0 && b < 0 && c < 0;
    }

    //3
    public static boolean isThereAtLeastOnePositive(double a, double b, double c) {
        return a > 0 || b > 0 || c > 0;
    }

    public static boolean isThereAtLeastOneNegative(double a, double b, double c) {
        return a < 0 || b < 0 || c < 0;
    }

    //4
    public static boolean isOnlyOnePositive(double a, double b, double c) {
        return (a > 0 && b <= 0 && c <= 0) || (a <= 0 && b > 0 && c <= 0)
                || (a <= 0 && b <= 0 && c > 0);
    }

    public static boolean isOnlyOneNegative(double a, double b, double c) {
        return (a >= 0 && b >= 0 && c < 0) || (a < 0 && b >= 0 && c >= 0)
                || (a >= 0 && b < 0 && c >= 0);
    }

    //5
    public static boolean isMorePositive(double a, double b, double c) {
        return (a > 0 && b > 0 && c <= 0) || (a > 0 && b <= 0 && c > 0)
                || (a <= 0 && b > 0 && c > 0);
    }

    public static boolean isMoreNegative(double a, double b, double c) {
        return (a >= 0 && b < 0 && c < 0) || (a < 0 && b >= 0 && c < 0)
                || (a < 0 && b < 0 && c >= 0);
    }

    //6
    public static boolean isEven(double a, double b, double c) {
        return a % 2 == 0 && b % 2 == 0 && c % 2 == 0;
    }

    public static boolean isOdd(double a, double b, double c) {
        return a % 2 != 0 && b % 2 != 0 && c % 2 != 0;
    }

    //7
    public static boolean isThereAtLeastOneEven(double a, double b, double c) {
        return (a % 2 == 0) || (b % 2 == 0) || (c % 2 == 0);
    }

    public static boolean isThereAtLeastOneOdd(double a, double b, double c) {
        return a % 2 != 0 || b % 2 != 0 || c % 2 != 0;
    }

    //8
    public static boolean isOnlyOneEven(double a, double b, double c) {
        return (a % 2 == 0 && b % 2 != 0 && c % 2 != 0)
                || (a % 2 != 0 && b % 2 == 0 && c % 2 != 0)
                || (a % 2 != 0 && b % 2 != 0 && c % 2 == 0);
    }

    public static boolean isOnlyOneOdd(double a, double b, double c) {
        return (a % 2 == 0 && b % 2 == 0 && c % 2 != 0)
                || (a % 2 == 0 && b % 2 != 0 && c % 2 == 0)
                || (a % 2 != 0 && b % 2 == 0 && c % 2 == 0);
    }

    //9
    public static boolean isSameParity(double a, double b, double c) {
        return ((a % 2 == 0) && (b % 2 == 0) && (c % 2 == 0))
                || ((a % 2 != 0) && (b % 2 != 0) && (c % 2 != 0));
    }

    //10
    public static boolean isMoreEven(double a, double b, double c) {
        return (a % 2 == 0 && b % 2 == 0 && c % 2 != 0)
                || (a % 2 == 0 && b % 2 != 0 && c % 2 == 0)
                || (a % 2 != 0 && b % 2 == 0 && c % 2 == 0);
    }

    public static boolean isMoreOdd(double a, double b, double c) {
        return (a % 2 == 0 && b % 2 != 0 && c % 2 != 0)
                || (a % 2 != 0 && b % 2 != 0 && c % 2 == 0)
                || (a % 2 != 0 && b % 2 == 0 && c % 2 != 0);
    }

    //11
    public static boolean isPalindrom(int number) {
        return (number % 10 == number / 1000) && (number / 10 % 10 == number / 10 % 10);
    }
}
