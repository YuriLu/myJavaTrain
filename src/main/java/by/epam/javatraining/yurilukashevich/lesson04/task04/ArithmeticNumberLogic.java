package by.epam.javatraining.yurilukashevich.lesson04.task04;

public class ArithmeticNumberLogic {

    private static final double DIGITS_COUNT = 6.0;

    public static double getArithmeticalMiddle(int number) {

        double sum = 0;

        sum += number % 10;             //digitSix
        sum += (number /= 10) % 10;     //digitFive and sum previous
        sum += (number /= 10) % 10;     //digitFour and sum previous
        sum += (number /= 10) % 10;     //digitThree and sum previous
        sum += (number /= 10) % 10;     //digitTwo and sum previous
        sum += (number / 10) % 10;      //digitOne and sum previous

        return sum / DIGITS_COUNT;
    }

    public static double getGeometricalMiddle(int number) {

        double multiplicationResult = 1;
        double rootDegree = 1 / DIGITS_COUNT;

        multiplicationResult *= number % 10;             //digitSix
        multiplicationResult *= (number /= 10) % 10;     //digitFive and multiplication by previous
        multiplicationResult *= (number /= 10) % 10;     //digitFour and multiplication by previous
        multiplicationResult *= (number /= 10) % 10;     //digitThree and multiplication by previous
        multiplicationResult *= (number /= 10) % 10;     //digitTwo and multiplication by previous
        multiplicationResult *= (number / 10) % 10;      //digitOne and multiplication by previous

        return Math.pow(multiplicationResult, rootDegree);
    }
}
