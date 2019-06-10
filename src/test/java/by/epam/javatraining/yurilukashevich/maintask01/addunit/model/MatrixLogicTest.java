package by.epam.javatraining.yurilukashevich.maintask01.addunit.model;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Unit tests for processing matrix.
 *
 * @author Yuri Lukashevich
 * @version 1.0
 * June 10, 2019
 */

public class MatrixLogicTest {

    @Test
    public void testSearchMin() {
        int[][] array = new int[][]{{2, 34, 42}, {17, 9, 28}, {1, 37, 3}};
        int expected = 1;
        assertEquals(expected, MatrixLogic.searchMin(array));
    }

    @Test
    public void testSearchMax() {
        int[][] array = new int[][]{{2, 34, 42}, {17, 9, 98}, {35, 37, 3}};
        int expected = 98;
        assertEquals(expected, MatrixLogic.searchMax(array));
    }

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

    @Test
    public void testLocalMinSearch() {
        int[][] array = new int[][]{{2, 34, 42}, {17, 9, 28}, {35, 37, 3}};
        int expected = 2;
        assertEquals(expected, MatrixLogic.localMinSearch(array));
    }

    @Test
    public void testLocalMaxSearch() {
        int[][] array = new int[][]{{2, 34, 42}, {17, 9, 28}, {35, 37, 3}};
        int expected = 42;
        assertEquals(expected, MatrixLogic.localMaxSearch(array));
    }

    @Test
    public void testTranspose() {
        int[][] array = new int[][]{{2, 34, 42}, {17, 9, 28}, {35, 37, 3}};
        int[] expected1 = new int[]{2, 17, 35};
        int[] expected2 = new int[]{34, 9, 37};
        int[] expected3 = new int[]{42, 28, 3};
        MatrixLogic.transpose(array);

        assertArrayEquals(expected1, array[0]);
        assertArrayEquals(expected2, array[1]);
        assertArrayEquals(expected3, array[2]);
    }
}