package by.epam.javatraining.yurilukashevich.maintask01.addunit.model;

import org.apache.log4j.Logger;

/**
 * Class contains methods for processing matrix N*M.
 *
 * @author Yuri Lukashevich
 * @version 1.1
 * @createdate June 10, 2019
 */

public class MatrixLogic {
    private static final Logger LOGGER = Logger.getLogger(MatrixLogic.class);
    private static final String ERR_MSG_ZERO = "Incorrect initial size of array. It should be greater than zero.";

    public static int searchMin(int[][] arr) {
        int length = arr.length;
        if (length == 0) {
            LOGGER.error(ERR_MSG_ZERO);
            return -1;
        }
        int min = arr[0][0];
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (min > arr[i][j]) {
                    min = arr[i][j];
                }
            }
        }
        return min;
    }

    public static int searchMax(int[][] arr) {
        int length = arr.length;
        if (length == 0) {
            LOGGER.error(ERR_MSG_ZERO);
            return -1;
        }
        int max = arr[0][0];

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (max < arr[i][j]) {
                    max = arr[i][j];
                }
            }
        }
        return max;
    }

    public static boolean isSymmetric(int[][] arr) {
        int length = arr.length;
        if (length == 0) {
            LOGGER.error(ERR_MSG_ZERO);
            return false;
        }

        for (int i = 0; i < length; i++) {
            if (length != arr[i].length) {
                return false;
            }
        }
        return true;
    }

    public static boolean isSymmetricByDiagonal(int[][] arr) {
        int length = arr.length;
        if (length == 0) {
            LOGGER.error(ERR_MSG_ZERO);
            return false;
        }

        if (!isSymmetric(arr)) {
            return false;
        }

        for (int i = 0; i < length - 1; ++i) {
            for (int j = i + 1; j < arr[i].length; ++j) {
                if (arr[i][j] != arr[j][i]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static int localMinSearch(int[][] arr) {
        int length = arr.length;
        if (length == 0) {
            LOGGER.error(ERR_MSG_ZERO);
            return -1;
        }
        int localMin = 0;

        for (int i = 0; i < arr.length; i++) {
            if (localMin != 0) {
                break;
            }
            for (int j = 0; j < arr[i].length; j++) {
                int left = (i > 0) ? arr[i - 1][j] : Integer.MAX_VALUE;
                int right = (i < arr.length - 1) ? arr[i + 1][j] : Integer.MAX_VALUE;
                int top = (j > 0) ? arr[i][j - 1] : Integer.MAX_VALUE;
                int bottom = (j < arr[i].length - 1) ? arr[i][j + 1] : Integer.MAX_VALUE;
                if (left > arr[i][j] && top > arr[i][j] && right > arr[i][j] && bottom > arr[i][j]) {
                    localMin = arr[i][j];
                    break;
                }
            }
        }
        return localMin;
    }

    public static int localMaxSearch(int[][] arr) {
        int length = arr.length;
        if (length == 0) {
            LOGGER.error(ERR_MSG_ZERO);
            return -1;
        }

        int localMax = 0;

        for (int i = 0; i < arr.length; i++) {
            if (localMax != 0) {
                break;
            }
            for (int j = 0; j < arr[i].length; j++) {
                int left = (i > 0) ? arr[i - 1][j] : Integer.MIN_VALUE;
                int right = (i < arr.length - 1) ? arr[i + 1][j] : Integer.MIN_VALUE;
                int top = (j > 0) ? arr[i][j - 1] : Integer.MIN_VALUE;
                int bottom = (j < arr[i].length - 1) ? arr[i][j + 1] : Integer.MIN_VALUE;
                if (left < arr[i][j] && top < arr[i][j] && right < arr[i][j] && bottom < arr[i][j]) {
                    localMax = arr[i][j];
                    break;
                }
            }
        }
        return localMax;
    }

    public static void transpose(int[][] arr) {
        int length = arr.length;
        if (length == 0) {
            LOGGER.error(ERR_MSG_ZERO);
            return;
        }

        if (!isSymmetric(arr)) {
            LOGGER.info("\nMatrix is not square\n");
            return;
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr[i].length; ++j) {
                arr[i][j] += arr[j][i];
                arr[j][i] = arr[i][j] - arr[j][i];
                arr[i][j] -= arr[j][i];
            }
        }
    }
}