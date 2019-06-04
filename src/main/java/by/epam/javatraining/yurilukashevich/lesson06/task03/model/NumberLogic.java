package by.epam.javatraining.yurilukashevich.lesson06.task03.model;

public class NumberLogic {

    public static int getFactorial(int number) {
        int factorial = 0;

        if (number >= 0) {
            factorial = 1;
            if (number > 1) {
                for (int i = 2; i <= number; i++) {
                    factorial *= i;
                }
            }
        }
        return factorial;
    }
}

