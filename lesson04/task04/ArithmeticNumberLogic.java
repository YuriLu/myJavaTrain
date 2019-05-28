package by.epam.training.yurilukashevich.lesson04.task04;

public class ArithmeticNumberLogic {

    public static double getArithmeticalMiddle(int number) {

        int digitSix = number % 10;
        number /= 10;

        int digitFive = number % 10;
        number /= 10;

        int digitFour = number % 10;
        number /= 10;

        int digitThree = number % 10;
        number /= 10;

        int digitTwo = number % 10;
        number /= 10;

        int digitOne = number % 10;

        return (digitOne + digitTwo + digitThree + digitFour + digitFive + digitSix) / 6.0;
    }

    public static double getGeometricalMiddle(int number) {

        int digitSix = number % 10;
        number /= 10;

        int digitFive = number % 10;
        number /= 10;

        int digitFour = number % 10;
        number /= 10;

        int digitThree = number % 10;
        number /= 10;

        int digitTwo = number % 10;
        number /= 10;

        int digitOne = number % 10;

        return Math.pow(digitOne * digitTwo * digitThree * digitFour * digitFive * digitSix, 1 / 6.0);
    }
}
