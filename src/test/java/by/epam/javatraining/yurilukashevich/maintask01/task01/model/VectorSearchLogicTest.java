package by.epam.javatraining.yurilukashevich.maintask01.task01.model;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class VectorSearchLogicTest {

    @Test
    public void testSearchMin() {
        double[] arr = new double[]{15.9, 18.7, 5.3, 4.6, 14.25, 14.26, 4.5};
        double expected = 4.5;
        assertEquals(expected, VectorSearchLogic.searchMin(arr), 0.01);
    }

    @Test
    public void testSearchMax() {
        double[] arr = new double[]{15.9, 18.7, 5.3, 4.6, 14.25, 14.26, 4.5};
        double expected = 18.7;
        assertEquals(expected, VectorSearchLogic.searchMax(arr), 0.01);
    }
    @Test
    public void testLocalMinIndexSearch() {
        double[] arr = new double[]{19.9, 19.7, 25.3, 14.25, 4.5};
        int expected = 1;
        assertEquals(expected, VectorSearchLogic.localMinIndexSearch(arr));
    }

    @Test
    public void testLocalMinIndexSearchNegative() {
        double[] arr = new double[]{19.6, 19.7, 15.3, 14.25, 4.5};
        int expected = -1;
        assertEquals(expected, VectorSearchLogic.localMinIndexSearch(arr));
    }

    @Test
    public void testLocalMaxIndexSearch() {
        double[] arr = new double[]{15.9, 19.7, 15.3, 14.25, 4.5};
        int expected = 1;
        assertEquals(expected, VectorSearchLogic.localMaxIndexSearch(arr));
    }

    @Test
    public void testLocalMaxIndexSearchNegative() {
        double[] arr = new double[]{19.9, 19.7, 15.3, 14.25, 4.5};
        int expected = -1;
        assertEquals(expected, VectorSearchLogic.localMaxIndexSearch(arr));
    }

    @Test
    public void testLinearSearchPositive() {
        double[] arr = new double[]{15.9, 19.7, 15.3, 14.25, 4.5};
        double numberToFind = 14.25;
        int expected = 3;
        assertEquals(expected, VectorSearchLogic.linearSearch(arr, numberToFind));
    }

    @Test
    public void testLinearSearchNegative() {
        double[] arr = new double[]{15.9, 19.7, 15.3, 14.25, 4.5};
        double numberToFind = 4.25;
        int expected = Arrays.binarySearch(arr, numberToFind);
        assertEquals(expected, VectorSearchLogic.linearSearch(arr, numberToFind));
    }

    @Test
    public void testBinarySearchPositive() {
        double[] arr = new double[]{15.9, 19.7, 15.3, 14.25, 4.5, 8.2};
        Arrays.sort(arr);
        double numberToFind = 4.5;
        int lowIndex = 0;
        int highIndex = 6;
        int expected = Arrays.binarySearch(arr, lowIndex, highIndex, numberToFind);
        assertEquals(expected, VectorSearchLogic.binarySearch(arr, numberToFind, lowIndex, highIndex));
    }
}