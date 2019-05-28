package by.epam.training.yurilukashevich.lesson04.additionalUnit;

public class EntryPoint {
    public static void main(String[] args) {
        double a = 3;
        double b = 4;
        double c = 9;
        Printer.print("\nEntered numbers: " + a + ", " + b + ", " + c + ". Is there at least one same pair? -- "
                + NumberLogic.checkForEqualPair(a, b, c));

        Printer.print("\nEntered numbers: " + a + ", " + b + ", " + c + ". Is there at least one opposite pair? -- "
                + NumberLogic.checkForOppositePair(a, b, c));

        Printer.print("\nEntered numbers: " + a + ", " + b + ", " + c + ". Are they positive? -- "
                + NumberLogic.isPositiveNumbers(a, b, c));

        Printer.print("\nEntered numbers: " + a + ", " + b + ", " + c + ". Are they negative? -- "
                + NumberLogic.isNegativeNumbers(a, b, c));

        Printer.print("\nEntered numbers: " + a + ", " + b + ", " + c + ". Is there at least one positive? -- "
                + NumberLogic.isThereAtLeastOnePositive(a, b, c));

        Printer.print("\nEntered numbers: " + a + ", " + b + ", " + c + ". Is there at least one negative? -- "
                + NumberLogic.isThereAtLeastOneNegative(a, b, c));

        Printer.print("\nEntered numbers: " + a + ", " + b + ", " + c + ". Is there only one positive? -- "
                + NumberLogic.isOnlyOnePositive(a, b, c));

        Printer.print("\nEntered numbers: " + a + ", " + b + ", " + c + ". Is there only one negative? -- "
                + NumberLogic.isOnlyOneNegative(a, b, c));

        Printer.print("\nEntered numbers: " + a + ", " + b + ", " + c + ". Is there more positive? -- "
                + NumberLogic.isMorePositive(a, b, c));

        Printer.print("\nEntered numbers: " + a + ", " + b + ", " + c + ". Is there more negative? -- "
                + NumberLogic.isMoreNegative(a, b, c));

        Printer.print("\nEntered numbers: " + a + ", " + b + ", " + c + ". Are they even? -- "
                + NumberLogic.isEven(a, b, c));

        Printer.print("\nEntered numbers: " + a + ", " + b + ", " + c + ". Are they odd? -- "
                + NumberLogic.isOdd(a, b, c));

        Printer.print("\nEntered numbers: " + a + ", " + b + ", " + c + ". Is there at least one even? -- "
                + NumberLogic.isThereAtLeastOneEven(a, b, c));

        Printer.print("\nEntered numbers: " + a + ", " + b + ", " + c + ". Is there at least one odd? -- "
                + NumberLogic.isThereAtLeastOneOdd(a, b, c));

        Printer.print("\nEntered numbers: " + a + ", " + b + ", " + c + ". Is there only one even? -- "
                + NumberLogic.isOnlyOneEven(a, b, c));

        Printer.print("\nEntered numbers: " + a + ", " + b + ", " + c + ". Is there only one odd? -- "
                + NumberLogic.isOnlyOneOdd(a, b, c));

        Printer.print("\nEntered numbers: " + a + ", " + b + ", " + c + ". Are they of the same parity? -- "
                + NumberLogic.isSameParity(a, b, c));

        Printer.print("\nEntered numbers: " + a + ", " + b + ", " + c + ". Is there more even? -- "
                + NumberLogic.isMoreEven(a, b, c));

        Printer.print("\nEntered numbers: " + a + ", " + b + ", " + c + ". Is there more odd? -- "
                + NumberLogic.isMoreOdd(a, b, c));

        int number = 4554;
        Printer.print("\nIs entered number " + number + " palindrom? " + NumberLogic.isPalindrom(number));

        double x = 5;
        double y = 15;
        Printer.print("\nEntered numbers: " + x + ", " + y + " belongs to Ist quater? -- "
                + GeometryLogic.isPointInFirstQuater(x, y));

        Printer.print("\nEntered numbers: " + a + ", " + b + ", " + c
                + ". Could it be a triangle? -- "
                + GeometryLogic.isTriangle(a, b, c));

        Printer.print("\nEntered numbers: " + a + ", " + b + ", " + c
                + ". Could it be a triangle with equal sides? -- "
                + GeometryLogic.isTriangleWithEqualSides(a, b, c));

        Printer.print("\nEntered numbers: " + a + ", " + b + ", " + c
                + ". Could it be a triangle with two equal sides? -- "
                + GeometryLogic.isTriangleWithTwoEqualSides(a, b, c));

        Printer.print("\nEntered numbers: " + a + ", " + b + ", " + c
                + ". Could it be a triangle with two equal sides? -- "
                + GeometryLogic.isTriangleWithTwoEqualSides(a, b, c));

        Printer.print("\nEntered numbers: " + a + ", " + b + ", " + c
                + ". Could it be a right triangle? -- "
                + GeometryLogic.isTriangleRight(a, b, c));

        Printer.print("\nEntered numbers: " + a + ", " + b + ", " + c
                + ". Could it be a right triangle with two equal sides? -- "
                + GeometryLogic.isTriangleRightAndTwoEqualSide(a, b, c) + "\n");

        x = 8;
        y = 20;
        double x1 = 5;
        double y1 = 15;
        double x2 = 25;
        double y2 = 25;
        Printer.print("\nEntered point(" + x + ", " + y + ") belongs to given rectangle with coordinates("
                + x1 + ", " + y1 + ") and (" + x2 + ", " + y2 + ")? -- "
                + GeometryLogic.isPointInsideRectangle(x, y, x1, y1, x2, y2) + "\n");

        int size = 485921;
        Printer.print("\nYou have entered size " + size + " in bytes.\nconverting....\n");
        DataLogic.dataConverter(size);

        int distane = 4859205;
        Printer.print("\nYou have entered distance " + distane + " in santimeters.\nconverting....\n");
        DataLogic.distanceConverter(distane);
    }
}
