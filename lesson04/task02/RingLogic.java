package lesson04.task02;

public class RingLogic {
    public static double getRingArea(double radiusOne, double radiusTwo) {
        return CircleAction.getCircleArea(radiusOne) - CircleAction.getCircleArea(radiusTwo);
    }
}
