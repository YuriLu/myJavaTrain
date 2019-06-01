package by.epam.javatraining.yurilukashevich.lesson04.task01;

public class NumberLogic {
    public static boolean isDigitsEqual(double a, double b, double c) {
        return a == b && b == c;
    }

    public static boolean isDigitsNotEqual(double a, double b, double c) {
        return a != b || b != c || a != c;
    }
}
