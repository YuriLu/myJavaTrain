package by.epam.javatraining.yurilukashevich.maintask01.task01.model;

import org.apache.log4j.Logger;

/**
 * Class contains search methods for processing arrays.
 *
 * @author Yuri Lukashevich
 * @version 1.1
 * @since June 9, 2019
 */

public class VectorSearchLogic {
    private static final Logger LOGGER = Logger.getLogger(VectorSearchLogic.class);
    private static final String WARN_MSG_ZERO = "Incorrect initial size of array. It should be greater than zero.";

    public static double searchMin(double[] array) {
        int length = array.length;
        if (array == null || length == 0) {
            LOGGER.warn(WARN_MSG_ZERO);
            return -1.0;
        }
        double min = array[0];
        for (int i = 1; i < length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }

    public static double searchMax(double[] array) {
        int length = array.length;
        if (array == null || length == 0) {
            LOGGER.warn(WARN_MSG_ZERO);
            return -1.0;
        }
        double max = array[0];

        for (int i = 1; i < length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        return max;
    }

    public static int localMinIndexSearch(double[] array) {
        int length = array.length;
        if (array == null || length == 0) {
            LOGGER.warn(WARN_MSG_ZERO);
            return -1;
        }

        for (int i = 1; i < array.length - 1; i++) {
            if (array[i] < array[i - 1] && array[i] < array[i + 1]) {
                return i;
            }
        }
        return -1;
    }

    public static int localMaxIndexSearch(double[] array) {
        int length = array.length;
        if (array == null || length == 0) {
            LOGGER.warn(WARN_MSG_ZERO);
            return -1;
        }

        for (int i = 1; i < array.length - 1; i++) {
            if (array[i] > array[i - 1] && array[i] > array[i + 1]) {
                return i;
            }
        }
        return -1;
    }

    public static int linearSearch(double[] array, double numberToFind) {
        int length = array.length;
        if (array == null || length == 0) {
            LOGGER.warn(WARN_MSG_ZERO);
            return -1;
        }

        for (int i = 0; i < length; i++) {
            if (array[i] == numberToFind) {
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(double[] array, double numberToFind, int lowIndex, int highIndex) {
        int length = array.length;
        if (array == null || length == 0) {
            LOGGER.warn(WARN_MSG_ZERO);
            return -1;
        } else {
            VectorSortLogic.selectionSort(array);
        }

        if (highIndex < lowIndex) {
            LOGGER.error("High index is lower than low index");
            return -1;
        }
        if (highIndex > length) {
            LOGGER.error("High index is out of range. It should be no larger than arr.length");
            return -1;
        }

        int middleIndex = (lowIndex + highIndex) / 2;

        if (numberToFind == array[middleIndex]) {
            return middleIndex;
        } else if (numberToFind < array[middleIndex]) {
            return binarySearch(array, numberToFind, lowIndex, middleIndex - 1);
        } else {
            return binarySearch(array, numberToFind, middleIndex + 1, highIndex);
        }
    }
}