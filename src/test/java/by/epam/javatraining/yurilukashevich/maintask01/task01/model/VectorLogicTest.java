package by.epam.javatraining.yurilukashevich.maintask01.task01.model;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Unit tests for processing arrays.
 *
 * @author Yuri Lukashevich
 * @version 1.0
 * @createdate June 9, 2019
 */

public class VectorLogicTest {

    @Test
    public void testSearchMin() {
        double[] arr = new double[]{15.9, 18.7, 5.3, 4.6, 14.25, 14.26, 4.5};
        double expected = 4.5;
        assertEquals(expected, VectorLogic.searchMin(arr), 0.01);
    }

    @Test
    public void testSearchMax() {
        double[] arr = new double[]{15.9, 18.7, 5.3, 4.6, 14.25, 14.26, 4.5};
        double expected = 18.7;
        assertEquals(expected, VectorLogic.searchMax(arr), 0.01);
    }

    @Test
    public void testArithmeticalSum() {
        double[] arr = new double[]{15.9, 18.7, 5.3, 14.25, 4.5};
        double expected = 11.73;
        assertEquals(expected, VectorLogic.checkArithmeticalSum(arr), 0.01);
    }

    @Test
    public void testGeometricalSum() {
        double[] arr = new double[]{15.9, 18.7, 5.3, 14.25, 4.5};
        double expected = 10.02;
        assertEquals(expected, VectorLogic.checkGeometricalSum(arr), 0.01);
    }

    @Test
    public void testIsIncreasingPositive() {
        double[] arr = new double[]{15.9, 18.7, 25.3, 34.25, 44.5};
        assertTrue(VectorLogic.isIncreasing(arr));
    }

    @Test
    public void testIsIncreasingNegative() {
        double[] arr = new double[]{15.9, 18.7, 15.3, 34.25, 44.5};
        assertFalse(VectorLogic.isIncreasing(arr));
    }

    @Test
    public void testIsDecreasingPositive() {
        double[] arr = new double[]{15.9, 8.7, 5.3, 4.25, 4.15};
        assertTrue(VectorLogic.isDecreasing(arr));
    }

    @Test
    public void testIsDecreasingNegative() {
        double[] arr = new double[]{15.9, 14.7, 5.3, 4.25, 5.5};
        assertFalse(VectorLogic.isDecreasing(arr));
    }


    @Test
    public void testLocalMinIndexSearch() {
        double[] arr = new double[]{19.9, 19.7, 25.3, 14.25, 4.5};
        int expected = 1;
        assertEquals(expected, VectorLogic.localMinIndexSearch(arr));
    }

    @Test
    public void testLocalMinIndexSearchNegative() {
        double[] arr = new double[]{19.6, 19.7, 15.3, 14.25, 4.5};
        int expected = -1;
        assertEquals(expected, VectorLogic.localMinIndexSearch(arr));
    }

    @Test
    public void testLocalMaxIndexSearch() {
        double[] arr = new double[]{15.9, 19.7, 15.3, 14.25, 4.5};
        int expected = 1;
        assertEquals(expected, VectorLogic.localMaxIndexSearch(arr));
    }

    @Test
    public void testLocalMaxIndexSearchNegative() {
        double[] arr = new double[]{19.9, 19.7, 15.3, 14.25, 4.5};
        int expected = -1;
        assertEquals(expected, VectorLogic.localMaxIndexSearch(arr));
    }

    @Test
    public void testLinearSearchPositive() {
        double[] arr = new double[]{15.9, 19.7, 15.3, 14.25, 4.5};
        double numberToFind = 14.25;
        int expected = 3;
        assertEquals(expected, VectorLogic.linearSearch(arr, numberToFind));
    }

    @Test
    public void testLinearSearchNegative() {
        double[] arr = new double[]{15.9, 19.7, 15.3, 14.25, 4.5};
        double numberToFind = 4.25;
        int expected = Arrays.binarySearch(arr, numberToFind);
        assertEquals(expected, VectorLogic.linearSearch(arr, numberToFind));
    }

    @Test
    public void testBinarySearchPositive() {
        double[] arr = new double[]{15.9, 19.7, 15.3, 14.25, 4.5, 8.2};
        Arrays.sort(arr);
        double numberToFind = 4.5;
        int lowIndex = 0;
        int highIndex = 6;
        int expected = Arrays.binarySearch(arr, lowIndex, highIndex, numberToFind);
        assertEquals(expected, VectorLogic.binarySearch(arr, numberToFind, lowIndex, highIndex));
    }

    @Test
    public void testReverseArray() {
        double[] actual = new double[]{15.9, 19.7, 15.3, 24.7, 14.25, 4.5,};
        VectorLogic.reverseArray(actual);
        double[] expected = new double[]{4.5, 14.25, 24.7, 15.3, 19.7, 15.9};
        assertArrayEquals(expected, actual, 0.0001);
    }


    @Test
    public void testBubbleSortUp() {
        double[] expected = new double[]{15.9, 19.7, 15.3, 14.25, 4.5};
        Arrays.sort(expected);
        double[] actual = new double[]{15.9, 19.7, 15.3, 14.25, 4.5};
        VectorLogic.bubbleSortUp(actual);
        assertArrayEquals(expected, actual, 0.0001);
    }

    @Test
    public void testBubbleSortDown() {
        double[] expected = new double[]{19.7, 15.9, 15.3, 14.25, 4.5};
        double[] actual = new double[]{15.9, 19.7, 15.3, 14.25, 4.5};
        VectorLogic.bubbleSortDown(actual);
        assertArrayEquals(expected, actual, 0.0001);
    }

    @Test
    public void testInsertionSort() {
        double[] expected = new double[]{15.9, 19.7, 15.3, 14.25, 4.5};
        Arrays.sort(expected);
        double[] actual = new double[]{15.9, 19.7, 15.3, 14.25, 4.5};
        VectorLogic.insertionSort(actual);
        assertArrayEquals(expected, actual, 0.0001);
    }

    @Test
    public void testInsertionSortDown() {
        double[] expected = new double[]{19.7, 15.9, 15.3, 14.25, 4.5};
        double[] actual = new double[]{15.9, 19.7, 15.3, 14.25, 4.5};
        VectorLogic.insertionSortDown(actual);
        assertArrayEquals(expected, actual, 0.0001);
    }

    @Test
    public void testSelectionSort() {
        double[] expected = new double[]{15.9, 19.7, 15.3, 14.25, 4.5};
        Arrays.sort(expected);
        double[] actual = new double[]{15.9, 19.7, 15.3, 14.25, 4.5};
        VectorLogic.selectionSort(actual);
        assertArrayEquals(expected, actual, 0.0001);
    }

    @Test
    public void testSelectionSortDown() {
        double[] expected = new double[]{19.7, 15.9, 15.3, 14.25, 4.5};
        double[] actual = new double[]{15.9, 19.7, 15.3, 14.25, 4.5};
        VectorLogic.selectionSortDown(actual);
        assertArrayEquals(expected, actual, 0.0001);
    }

    @Test
    public void testMergeSort() {
        double[] expected = new double[]{15.9, 19.7, 15.3, 14.25, 4.5};
        Arrays.sort(expected);
        double[] actual = new double[]{15.9, 19.7, 15.3, 14.25, 4.5};
        VectorLogic.mergeSort(actual);
        assertArrayEquals(expected, actual, 0.0001);
    }

    @Test
    public void testMergeSortDown() {
        double[] expected = new double[]{19.7, 15.9, 15.3, 14.25, 4.5};
        double[] actual = new double[]{15.9, 19.7, 15.3, 14.25, 4.5};
        VectorLogic.mergeSortDown(actual);
        assertArrayEquals(expected, actual, 0.0001);
    }

    @Test
    public void testQuickSort() {
        double[] expected = new double[]{15.9, 19.7, 15.3, 14.25, 4.5};
        Arrays.sort(expected);
        double[] actual = new double[]{15.9, 19.7, 15.3, 14.25, 4.5};
        VectorLogic.quickSort(actual);
        assertArrayEquals(expected, actual, 0.0001);
    }

    @Test
    public void testQuickSortDown() {
        double[] expected = new double[]{19.7, 15.9, 15.3, 14.25, 4.5};
        double[] actual = new double[]{15.9, 19.7, 15.3, 14.25, 4.5};
        VectorLogic.quickSortDown(actual);
        assertArrayEquals(expected, actual, 0.0001);
    }
}