package by.epam.javatraining.yurilukashevich.lesson04.task02;

public class RingLogic {
    public static double getRingArea(double radiusOne, double radiusTwo) {
        return getCircleArea(radiusOne) - getCircleArea(radiusTwo);
    }

    private static double getCircleArea(double radius) {
        return (Math.PI * radius * radius);
    }
}
