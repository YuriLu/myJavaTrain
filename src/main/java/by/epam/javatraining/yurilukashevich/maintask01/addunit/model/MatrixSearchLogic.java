package by.epam.javatraining.yurilukashevich.maintask01.addunit.model;

import org.apache.log4j.Logger;

/**
 * Class contains methods for search logic for matrix N*M.
 *
 * @author Yuri Lukashevich
 * @version 1.1
 * @since June 10, 2019
 */

public class MatrixSearchLogic {
    private static final Logger LOGGER = Logger.getLogger(MatrixSearchLogic.class);
    private static final String WARN_MSG_ZERO = "Incorrect initial size of arrayay. It should be greater than zero.";

    public static int searchMin(int[][] arrayay) {
        int length = arrayay.length;
        if (length == 0) {
            LOGGER.warn(WARN_MSG_ZERO);
            return -1;
        }
        int min = arrayay[0][0];
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < arrayay[i].length; j++) {
                if (min > arrayay[i][j]) {
                    min = arrayay[i][j];
                }
            }
        }
        return min;
    }

    public static int searchMax(int[][] array) {
        int length = array.length;
        if (length == 0) {
            LOGGER.warn(WARN_MSG_ZERO);
            return -1;
        }
        int max = array[0][0];

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (max < array[i][j]) {
                    max = array[i][j];
                }
            }
        }
        return max;
    }

    public static int localMinSearch(int[][] array) {
        int length = array.length;
        if (length == 0) {
            LOGGER.warn(WARN_MSG_ZERO);
            return -1;
        }
        int localMin = 0;

        for (int i = 0; i < array.length; i++) {
            if (localMin != 0) {
                break;
            }
            for (int j = 0; j < array[i].length; j++) {
                int left = (i > 0) ? array[i - 1][j] : Integer.MAX_VALUE;
                int right = (i < array.length - 1) ? array[i + 1][j] : Integer.MAX_VALUE;
                int top = (j > 0) ? array[i][j - 1] : Integer.MAX_VALUE;
                int bottom = (j < array[i].length - 1) ? array[i][j + 1] : Integer.MAX_VALUE;
                if (left > array[i][j] && top > array[i][j] && right > array[i][j] && bottom > array[i][j]) {
                    localMin = array[i][j];
                    break;
                }
            }
        }
        return localMin;
    }

    public static int localMaxSearch(int[][] array) {
        int length = array.length;
        if (length == 0) {
            LOGGER.warn(WARN_MSG_ZERO);
            return -1;
        }

        int localMax = 0;

        for (int i = 0; i < array.length; i++) {
            if (localMax != 0) {
                break;
            }
            for (int j = 0; j < array[i].length; j++) {
                int left = (i > 0) ? array[i - 1][j] : Integer.MIN_VALUE;
                int right = (i < array.length - 1) ? array[i + 1][j] : Integer.MIN_VALUE;
                int top = (j > 0) ? array[i][j - 1] : Integer.MIN_VALUE;
                int bottom = (j < array[i].length - 1) ? array[i][j + 1] : Integer.MIN_VALUE;
                if (left < array[i][j] && top < array[i][j] && right < array[i][j] && bottom < array[i][j]) {
                    localMax = array[i][j];
                    break;
                }
            }
        }
        return localMax;
    }
}