package by.epam.javatraining.yurilukashevich.maintask01.addunit.model;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Unit tests for search logic processing matrix.
 *
 * @author Yuri Lukashevich
 * @version 1.0
 * @since June 17, 2019
 */

public class MatrixSearchLogicTest {

    @Test
    public void testSearchMin() {
        int[][] array = new int[][]{{2, 34, 42}, {17, 9, 28}, {1, 37, 3}};
        int expected = 1;
        assertEquals(expected, MatrixSearchLogic.searchMin(array));
    }

    @Test
    public void testSearchMax() {
        int[][] array = new int[][]{{2, 34, 42}, {17, 9, 98}, {35, 37, 3}};
        int expected = 98;
        assertEquals(expected, MatrixSearchLogic.searchMax(array));
    }

    @Test
    public void testLocalMinSearch() {
        int[][] array = new int[][]{{2, 34, 42}, {17, 9, 28}, {35, 37, 3}};
        int expected = 2;
        assertEquals(expected, MatrixSearchLogic.localMinSearch(array));
    }

    @Test
    public void testLocalMaxSearch() {
        int[][] array = new int[][]{{2, 34, 42}, {17, 9, 28}, {35, 37, 3}};
        int expected = 42;
        assertEquals(expected, MatrixSearchLogic.localMaxSearch(array));
    }
}