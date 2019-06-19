package by.epam.javatraining.yurilukashevich.lesson06.task05.model;

public class NumberLogic {

    public static boolean checkIsPrime(int number) {
        boolean result = true;
        number = number > 0 ? number : -number;

        if (number < 2) {       // 0 and 1 are not prime numbers
            return false;
        }

        int iteration = (int) Math.sqrt(number);
        for (int i = 2; i <= iteration; i++) {      //check for prime number
            if (number % i == 0) {
                result = false;
                break;
            }
        }
        return result;
}
}