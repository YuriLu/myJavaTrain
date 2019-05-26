package lesson04.task04;

public class ArithmeticNumberLogic {

    public static double getArithmeticalMiddle(int number) {

        int firstDigit = DigitLogic.getDigit(number, 6);
        int secondDigit = DigitLogic.getDigit(number, 5);
        int thirdDigit = DigitLogic.getDigit(number, 4);
        int forthDigit = DigitLogic.getDigit(number, 3);
        int fifthDigit = DigitLogic.getDigit(number, 2);
        int sixthDigit = DigitLogic.getDigit(number, 1);

        return (firstDigit + secondDigit + thirdDigit + forthDigit + fifthDigit + sixthDigit) / 6;
    }

    public static double getGeometricalMiddle(int number) {

        int firstDigit = DigitLogic.getDigit(number, 6);
        int secondDigit = DigitLogic.getDigit(number, 5);
        int thirdDigit = DigitLogic.getDigit(number, 4);
        int forthDigit = DigitLogic.getDigit(number, 3);
        int fifthDigit = DigitLogic.getDigit(number, 2);
        int sixthDigit = DigitLogic.getDigit(number, 1);

        return Math.pow((firstDigit * secondDigit * thirdDigit * forthDigit * fifthDigit * sixthDigit), 1.0 / 6);
    }
}
