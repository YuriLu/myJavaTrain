package by.epam.javatraining.yurilukashevich.maintask01.addunit.model;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Unit tests for logic processing matrix.
 *
 * @author Yuri Lukashevich
 * @version 1.0
 * @since June 17, 2019
 */

public class MatrixLogicTest {

    @Test
    public void testIsSymmetric() {
        int[][] array = new int[][]{{2, 34, 42}, {17, 9, 28}, {35, 37, 3}};
        assertTrue(MatrixLogic.isSymmetric(array));
    }

    @Test
    public void testIsSymmetricByDiagonal() {
        int[][] array = new int[][]
                        {{1, 2, 3, 4},
                        {2, 1, 5, 6},
                        {3, 5, 1, 7},
                        {4, 6, 7, 1}};
        assertTrue(MatrixLogic.isSymmetricByDiagonal(array));
    }
}