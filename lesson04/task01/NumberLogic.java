package lesson04.task01;

public class NumberLogic {
    public static boolean checkThatDigitsIsEqual(double a, double b, double c) {
        return (a == b) && (b == c);
    }

    public static boolean checkThatDigitsIsNotEqual(double a, double b, double c) {
        return (a != b) || (b != c) || (a != c);
    }
}
