package lesson04.task03;

public class CheckNumber {

    public static boolean checkIsIncreasing(int number) {

        int firstDigit = DigitLogic.getDigit(number, 4);
        int secondDigit = DigitLogic.getDigit(number, 3);
        int thirdDigit = DigitLogic.getDigit(number, 2);
        int forthDigit = DigitLogic.getDigit(number, 1);

        return (firstDigit < secondDigit) && (secondDigit < thirdDigit) && (thirdDigit < forthDigit);
    }

    public static boolean checkIsDecreasing(int number) {

        int firstDigit = DigitLogic.getDigit(number, 4);
        int secondDigit = DigitLogic.getDigit(number, 3);
        int thirdDigit = DigitLogic.getDigit(number, 2);
        int forthDigit = DigitLogic.getDigit(number, 1);

        return (firstDigit > secondDigit) && (secondDigit > thirdDigit) && (thirdDigit > forthDigit);
    }
}
