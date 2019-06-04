package by.epam.javatraining.yurilukashevich.lesson06.task05.model;

public class NumberLogic {

    public static boolean checkIsPrime(int number) {

        boolean result = false;
        number = number > 0 ? number : -number;

        if (number > 1) {       // 0 and 1 are not prime numbers
            if (number == 2) {  // 2 is prime
                result = true;
            }
            for (int i = 2; i < number; i++) {      //check for prime number
                if (number % i != 0) {
                    result = true;
                } else {
                    break;
                }
            }
        }
        return result;
    }
}