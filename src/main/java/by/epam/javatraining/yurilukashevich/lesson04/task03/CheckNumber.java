package by.epam.javatraining.yurilukashevich.lesson04.task03;

public class CheckNumber {

    public static boolean checkIsIncreasing(int number) {

        int digitFour = number % 10;
        int digitThree = (number / 10) % 10;
        int digitTwo = (number / 10) % 10;
        int digitOne = (number / 10) % 10;

        return digitOne < digitTwo && digitTwo < digitThree && digitThree < digitFour;
    }

    public static boolean checkIsDecreasing(int number) {

        int digitFour = number % 10;
        int digitThree = (number / 10) % 10;
        int digitTwo = (number / 10) % 10;
        int digitOne = (number / 10) % 10;

        return digitOne > digitTwo && digitTwo > digitThree && digitThree > digitFour;
    }
}
