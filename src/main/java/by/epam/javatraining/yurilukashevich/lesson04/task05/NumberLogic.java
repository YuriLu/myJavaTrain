package by.epam.javatraining.yurilukashevich.lesson04.task05;

public class NumberLogic {

    public static int reverseSevenDigitNumber(int number) {

        // initial multiplier for seven digit number
        int multiplier = 1000000;

        int digitSeven = number % 10 * multiplier;
        int digitSix = (number /= 10) % 10 * (multiplier /= 10);
        int digitFive = (number /= 10) % 10 * (multiplier /= 10);
        int digitFour = (number /= 10) % 10 * (multiplier /= 10);
        int digitThree = (number /= 10) % 10 * (multiplier /= 10);
        int digitTwo = (number /= 10) % 10 * (multiplier /= 10);
        int digitOne = (number / 10) % 10 * multiplier / 10;

        return digitSeven + digitSix + digitFive
                + digitFour + digitThree + digitTwo + digitOne;
    }
}
