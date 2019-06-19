package by.epam.javatraining.yurilukashevich.lesson06.task03.model;

public class NumberLogic {

    public static int countFactorial(int number) {
        int factorial = 1;

        if (number < 0) {
            return 0;
        }

        for (int i = 2; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }
}

