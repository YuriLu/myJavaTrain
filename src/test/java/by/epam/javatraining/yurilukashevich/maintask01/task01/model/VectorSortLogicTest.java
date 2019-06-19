package by.epam.javatraining.yurilukashevich.maintask01.task01.model;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;

public class VectorSortLogicTest {


    @Test
    public void testBubbleSortUp() {
        double[] expected = new double[]{15.9, 19.7, 15.3, 14.25, 4.5};
        Arrays.sort(expected);
        double[] actual = new double[]{15.9, 19.7, 15.3, 14.25, 4.5};
        VectorSortLogic.bubbleSortUp(actual);
        assertArrayEquals(expected, actual, 0.0001);
    }

    @Test
    public void testBubbleSortDown() {
        double[] expected = new double[]{19.7, 15.9, 15.3, 14.25, 4.5};
        double[] actual = new double[]{15.9, 19.7, 15.3, 14.25, 4.5};
        VectorSortLogic.bubbleSortDown(actual);
        assertArrayEquals(expected, actual, 0.0001);
    }

    @Test
    public void testInsertionSort() {
        double[] expected = new double[]{15.9, 19.7, 15.3, 14.25, 4.5};
        Arrays.sort(expected);
        double[] actual = new double[]{15.9, 19.7, 15.3, 14.25, 4.5};
        VectorSortLogic.insertionSort(actual);
        assertArrayEquals(expected, actual, 0.0001);
    }

    @Test
    public void testInsertionSortDown() {
        double[] expected = new double[]{19.7, 15.9, 15.3, 14.25, 4.5};
        double[] actual = new double[]{15.9, 19.7, 15.3, 14.25, 4.5};
        VectorSortLogic.insertionSortDown(actual);
        assertArrayEquals(expected, actual, 0.0001);
    }

    @Test
    public void testSelectionSort() {
        double[] expected = new double[]{15.9, 19.7, 15.3, 14.25, 4.5};
        Arrays.sort(expected);
        double[] actual = new double[]{15.9, 19.7, 15.3, 14.25, 4.5};
        VectorSortLogic.selectionSort(actual);
        assertArrayEquals(expected, actual, 0.0001);
    }

    @Test
    public void testSelectionSortDown() {
        double[] expected = new double[]{19.7, 15.9, 15.3, 14.25, 4.5};
        double[] actual = new double[]{15.9, 19.7, 15.3, 14.25, 4.5};
        VectorSortLogic.selectionSortDown(actual);
        assertArrayEquals(expected, actual, 0.0001);
    }

    @Test
    public void testMergeSort() {
        double[] expected = new double[]{15.9, 19.7, 15.3, 14.25, 4.5};
        Arrays.sort(expected);
        double[] actual = new double[]{15.9, 19.7, 15.3, 14.25, 4.5};
        VectorSortLogic.mergeSort(actual);
        assertArrayEquals(expected, actual, 0.0001);
    }

    @Test
    public void testMergeSortDown() {
        double[] expected = new double[]{19.7, 15.9, 15.3, 14.25, 4.5};
        double[] actual = new double[]{15.9, 19.7, 15.3, 14.25, 4.5};
        VectorSortLogic.mergeSortDown(actual);
        assertArrayEquals(expected, actual, 0.0001);
    }

    @Test
    public void testQuickSort() {
        double[] expected = new double[]{15.9, 19.7, 15.3, 14.25, 4.5};
        Arrays.sort(expected);
        double[] actual = new double[]{15.9, 19.7, 15.3, 14.25, 4.5};
        VectorSortLogic.quickSort(actual);
        assertArrayEquals(expected, actual, 0.0001);
    }

    @Test
    public void testQuickSortDown() {
        double[] expected = new double[]{19.7, 15.9, 15.3, 14.25, 4.5};
        double[] actual = new double[]{15.9, 19.7, 15.3, 14.25, 4.5};
        VectorSortLogic.quickSortDown(actual);
        assertArrayEquals(expected, actual, 0.0001);
    }
}