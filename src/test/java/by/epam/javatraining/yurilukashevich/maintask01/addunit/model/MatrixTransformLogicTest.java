package by.epam.javatraining.yurilukashevich.maintask01.addunit.model;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Unit tests for trandformation logic processing matrix.
 *
 * @author Yuri Lukashevich
 * @version 1.0
 * @since June 17, 2019
 */

public class MatrixTransformLogicTest {

    @Test
    public void testTranspose() {
        int[][] array = new int[][]{{2, 34, 42}, {17, 9, 28}, {35, 37, 3}};
        int[] expected1 = new int[]{2, 17, 35};
        int[] expected2 = new int[]{34, 9, 37};
        int[] expected3 = new int[]{42, 28, 3};
        MatrixTransformLogic.transpose(array);

        assertArrayEquals(expected1, array[0]);
        assertArrayEquals(expected2, array[1]);
        assertArrayEquals(expected3, array[2]);
    }
}