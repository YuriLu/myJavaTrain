package by.epam.javatraining.yurilukashevich.maintask01.task01.model;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Unit tests for processing arrays.
 *
 * @author Yuri Lukashevich
 * @version 1.0
 * @since June 9, 2019
 */

public class VectorLogicTest {

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
}