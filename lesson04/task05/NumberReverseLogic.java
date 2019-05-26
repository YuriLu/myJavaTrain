package lesson04.task05;

public class NumberReverseLogic {

    public static int reverseDigits(int number) {

        int firstDigit = DigitLogic.getDigit(number, 7);
        int secondDigit = DigitLogic.getDigit(number, 6);
        int thirdDigit = DigitLogic.getDigit(number, 5);
        int forthDigit = DigitLogic.getDigit(number, 4);
        int fifthDigit = DigitLogic.getDigit(number, 3);
        int sixthDigit = DigitLogic.getDigit(number, 2);
        int seventhDigit = DigitLogic.getDigit(number, 1);

        return seventhDigit * 1000000 + sixthDigit * 100000 + fifthDigit * 10000 + forthDigit * 1000 + thirdDigit * 100 + secondDigit * 10 + firstDigit;
    }
}
