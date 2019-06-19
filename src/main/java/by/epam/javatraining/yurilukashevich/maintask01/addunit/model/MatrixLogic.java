package by.epam.javatraining.yurilukashevich.maintask01.addunit.model;

import org.apache.log4j.Logger;

/**
 * Class contains methods for logic processing matrix N*M.
 *
 * @author Yuri Lukashevich
 * @version 1.1
 * @since June 10, 2019
 */

public class MatrixLogic {
    private static final Logger LOGGER = Logger.getLogger(MatrixLogic.class);
    private static final String WARN_MSG_ZERO = "Incorrect initial size of arrayay. It should be greater than zero.";

    public static boolean isSymmetric(int[][] array) {
        int length = array.length;
        if (length == 0) {
            LOGGER.warn(WARN_MSG_ZERO);
            return false;
        }
        for (int i = 0; i < length; i++) {
            if (length != array[i].length) {
                return false;
            }
        }
        return true;
    }

    public static boolean isSymmetricByDiagonal(int[][] array) {
        int length = array.length;
        if (length == 0) {
            LOGGER.warn(WARN_MSG_ZERO);
            return false;
        }
        if (!isSymmetric(array)) {
            return false;
        }
        for (int i = 0; i < length - 1; ++i) {
            for (int j = i + 1; j < array[i].length; ++j) {
                if (array[i][j] != array[j][i]) {
                    return false;
                }
            }
        }
        return true;
    }
}