package by.epam.training.yurilukashevich.lesson04.additionalUnit;

public class EntryPoint {
    public static void main(String[] args) {
        double a = 3;
        double b = 3;
        double c = 3;

        boolean result = NumberLogic.checkForEqualPair(a, b, c);
        Printer.print("\nEntered numbers: " + a + ", " + b + ", " + c + ". Is there at least one same pair? -- "
                + result);

        result = NumberLogic.checkForOppositePair(a, b, c);
        Printer.print("\nEntered numbers: " + a + ", " + b + ", " + c + ". Is there at least one opposite pair? -- "
                + result);

        result = NumberLogic.isPositiveNumbers(a, b, c);
        Printer.print("\nEntered numbers: " + a + ", " + b + ", " + c + ". Are they positive? -- " + result);

        result = NumberLogic.isNegativeNumbers(a, b, c);
        Printer.print("\nEntered numbers: " + a + ", " + b + ", " + c + ". Are they negative? -- " + result);

        result = NumberLogic.isThereAtLeastOnePositive(a, b, c);
        Printer.print("\nEntered numbers: " + a + ", " + b + ", " + c + ". Is there at least one positive? -- "
                + result);

        result = NumberLogic.isThereAtLeastOneNegative(a, b, c);
        Printer.print("\nEntered numbers: " + a + ", " + b + ", " + c + ". Is there at least one negative? -- "
                + result);

        result = NumberLogic.isOnlyOnePositive(a, b, c);
        Printer.print("\nEntered numbers: " + a + ", " + b + ", " + c + ". Is there only one positive? -- "
                + result);

        result = NumberLogic.isOnlyOneNegative(a, b, c);
        Printer.print("\nEntered numbers: " + a + ", " + b + ", " + c + ". Is there only one negative? -- "
                + result);

        result = NumberLogic.isMorePositive(a, b, c);
        Printer.print("\nEntered numbers: " + a + ", " + b + ", " + c + ". Is there more positive? -- "
                + result);

        result = NumberLogic.isMoreNegative(a, b, c);
        Printer.print("\nEntered numbers: " + a + ", " + b + ", " + c + ". Is there more negative? -- "
                + result);

        result = NumberLogic.isEven(a, b, c);
        Printer.print("\nEntered numbers: " + a + ", " + b + ", " + c + ". Are they even? -- "
                + result);

        result = NumberLogic.isOdd(a, b, c);
        Printer.print("\nEntered numbers: " + a + ", " + b + ", " + c + ". Are they odd? -- "
                + result);

        result = NumberLogic.isThereAtLeastOneEven(a, b, c);
        Printer.print("\nEntered numbers: " + a + ", " + b + ", " + c + ". Is there at least one even? -- "
                + result);

        result = NumberLogic.isThereAtLeastOneOdd(a, b, c);
        Printer.print("\nEntered numbers: " + a + ", " + b + ", " + c + ". Is there at least one odd? -- "
                + result);

        result = NumberLogic.isOnlyOneEven(a, b, c);
        Printer.print("\nEntered numbers: " + a + ", " + b + ", " + c + ". Is there only one even? -- "
                + result);

        result = NumberLogic.isOnlyOneOdd(a, b, c);
        Printer.print("\nEntered numbers: " + a + ", " + b + ", " + c + ". Is there only one odd? -- "
                + result);

        result = NumberLogic.isSameParity(a, b, c);
        Printer.print("\nEntered numbers: " + a + ", " + b + ", " + c + ". Are they of the same parity? -- "
                + result);

        result = NumberLogic.isMoreEven(a, b, c);
        Printer.print("\nEntered numbers: " + a + ", " + b + ", " + c + ". Is there more even? -- "
                + result);

        result = NumberLogic.isMoreOdd(a, b, c);
        Printer.print("\nEntered numbers: " + a + ", " + b + ", " + c + ". Is there more odd? -- "
                + result);

        int number = 4554;
        result = NumberLogic.isPalindrom(number);
        Printer.print("\nIs entered number " + number + " palindrom? " + result);

        double x = 5;
        double y = 15;
        result = GeometryLogic.isPointInFirstQuater(x, y);
        Printer.print("\nEntered numbers: " + x + ", " + y + " belongs to Ist quater? -- " + result);

        result = GeometryLogic.isTriangle(a, b, c);
        Printer.print("\nEntered numbers: " + a + ", " + b + ", " + c
                + ". Could it be a triangle? -- " + result);

        result = GeometryLogic.isTriangleWithEqualSides(a, b, c);
        Printer.print("\nEntered numbers: " + a + ", " + b + ", " + c
                + ". Could it be a triangle with equal sides? -- " + result);

        result = GeometryLogic.isTriangleWithTwoEqualSides(a, b, c);
        Printer.print("\nEntered numbers: " + a + ", " + b + ", " + c
                + ". Could it be a triangle with two equal sides? -- " + result);

        result = GeometryLogic.isTriangleRight(a, b, c);
        Printer.print("\nEntered numbers: " + a + ", " + b + ", " + c
                + ". Could it be a right triangle? -- " + result);

        result = GeometryLogic.isTriangleRightAndTwoEqualSide(a, b, c);
        Printer.print("\nEntered numbers: " + a + ", " + b + ", " + c
                + ". Could it be a right triangle with two equal sides? -- " + result + "\n");

        x = 8;
        y = 20;
        double x1 = 5;
        double y1 = 15;
        double x2 = 25;
        double y2 = 25;
        result = GeometryLogic.isPointInsideRectangle(x, y, x1, y1, x2, y2);
        Printer.print("\nEntered point(" + x + ", " + y + ") belongs to given rectangle with coordinates("
                + x1 + ", " + y1 + ") and (" + x2 + ", " + y2 + ")? -- " + result + "\n");

        int size = 485921;
        Printer.print("\nYou have entered size " + size + " in bytes.\nconverting....\n");
        DataLogic.dataConverter(size);

        int distane = 4859205;
        Printer.print("\nYou have entered distance " + distane + " in santimeters.\nconverting....\n");
        DataLogic.distanceConverter(distane);
    }
}
