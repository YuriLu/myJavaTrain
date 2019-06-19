package by.epam.javatraining.yurilukashevich.maintask01.task01.model;

import org.apache.log4j.Logger;

/**
 * Class contains logic methods for processing arrays.
 *
 * @author Yuri Lukashevich
 * @version 1.1
 * @since June 9, 2019
 */

//TODO Need to do abstraction for input data. Not neccesasry that user will input array!!!!!

public class VectorLogic {
    private static final Logger LOGGER = Logger.getLogger(VectorLogic.class);
    private static final String WARN_MSG_ZERO = "Incorrect initial size of array. It should be greater than zero.";

    public static boolean isIncreasing(double[] array) {
        int length = array.length;
        if (array == null || length == 0) {
            LOGGER.warn(WARN_MSG_ZERO);
            return false;
        }
        if (length < 2) {
            LOGGER.info("Array has not enough element to determine order.");
            return false;
        }
        boolean result = true;

        for (int i = 0; i < length - 1; i++) {
            if (array[i] > array[i + 1]) {
                result = false;
            }
        }
        return result;
    }

    public static boolean isDecreasing(double[] array) {
        int length = array.length;
        if (array == null || length == 0) {
            LOGGER.warn(WARN_MSG_ZERO);
            return false;
        }
        if (length < 2) {
            LOGGER.info("Array has not enough element to determine order.");
            return false;
        }
        boolean result = true;

        for (int i = 0; i < length - 1; i++) {
            if (array[i] < array[i + 1]) {
                result = false;
            }
        }
        return result;
    }
}