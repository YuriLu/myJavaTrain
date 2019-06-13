package by.epam.javatraining.yurilukashevich.lesson04.additionalUnit;

public class GeometryLogic {

    //12
    public static boolean isPointInFirstQuoter(double coordinateX, double coordinateY) {
        return coordinateX > 0 && coordinateY > 0;
    }

    //13
    public static boolean isTriangle(double a, double b, double c) {
        return a + b < c && a + c < b && b + c < a;
    }

    //14
    public static boolean isTriangleWithEqualSides(double a, double b, double c) {
        return isTriangle(a, b, c) && a == b && b == c;
    }

    //15
    public static boolean isTriangleWithTwoEqualSides(double a, double b, double c) {
        return isTriangle(a, b, c) && (a == b || b == c || a == c);
    }

    //16
    public static boolean isTriangleRight(double a, double b, double c) {
        return isTriangle(a, b, c) && ((Math.pow(a, 2) == Math.pow(b, 2) + Math.pow(c, 2))
                || (Math.pow(b, 2) == Math.pow(a, 2) + Math.pow(c, 2))
                || (Math.pow(c, 2) == Math.pow(b, 2) + Math.pow(a, 2)));
    }

    //17
    public static boolean isTriangleRightAndTwoEqualSide(double a, double b, double c) {
        return isTriangleWithTwoEqualSides(a, b, c) && isTriangleRight(a, b, c);
    }

    //18
    public static boolean isPointInsideRectangle(double x, double y, double x1, double y1, double x2, double y2) {
        return x > x1 && x < x2 && y > y1 && y < y2;
    }
}
