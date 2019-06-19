package by.epam.javatraining.yurilukashevich.maintask01.task01.model;

import org.apache.log4j.Logger;

/**
 * Class contains arithmetic methods for processing arrays.
 *
 * @author Yuri Lukashevich
 * @version 1.1
 * @since June 9, 2019
 */

public class VectorArithmeticLogic {
    private static final Logger LOGGER = Logger.getLogger(VectorArithmeticLogic.class);
    private static final String WARN_MSG_ZERO = "Incorrect initial size of array. It should be greater than zero.";

    public static double checkArithmeticalSum(double[] array) {
        double sum = 0.0;
        int length = array.length;
        if (array == null || length == 0) {
            LOGGER.warn(WARN_MSG_ZERO);
            return -1.0;
        }

        for (double element : array) {
            sum += element;
        }
        return sum / length;
    }

    public static double checkGeometricalSum(double[] array) {
        double result = 1.0;
        int length = array.length;
        if (array == null || length == 0) {
            LOGGER.warn(WARN_MSG_ZERO);
            return -1.0;
        }
        double rootDegree = 1.0 / length;

        for (double element : array) {
            result *= element;
        }
        return Math.pow(result, rootDegree);
    }

    public static void reverseArray(double[] array) {
        int length = array.length;
        if (array == null || length == 0) {
            LOGGER.warn(WARN_MSG_ZERO);
            return;
        }

        for (int i = 0; i < length / 2; i++) {
            swap(array, i, length - 1 - i);
        }
    }

    private static void swap(double[] array, int indexOne, int indexTwo) {
        double temp = array[indexOne];
        array[indexOne] = array[indexTwo];
        array[indexTwo] = temp;
    }
}