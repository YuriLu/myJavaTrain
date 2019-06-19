package by.epam.javatraining.yurilukashevich.maintask01.addunit.model;

import org.apache.log4j.Logger;

/**
 * Class contains methods for transformation logic for matrix N*M.
 *
 * @author Yuri Lukashevich
 * @version 1.1
 * @since June 10, 2019
 */

public class MatrixTransformLogic {
    private static final Logger LOGGER = Logger.getLogger(MatrixTransformLogic.class);
    private static final String WARN_MSG_ZERO = "Incorrect initial size of arrayay. It should be greater than zero.";

    public static void transpose(int[][] array) {
        int length = array.length;
        if (length == 0) {
            LOGGER.warn(WARN_MSG_ZERO);
            return;
        }

        if (!MatrixLogic.isSymmetric(array)) {
            LOGGER.info("\nMatrix is not square\n");
            return;
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array[i].length; ++j) {
                array[i][j] += array[j][i];
                array[j][i] = array[i][j] - array[j][i];
                array[i][j] -= array[j][i];
            }
        }
    }
}