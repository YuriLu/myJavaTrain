package by.epam.javatraining.yurilukashevich.maintask01.task01.model;

import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class VectorArithmeticLogicTest {

    @Test
    public void testArithmeticalSum() {
        double[] arr = new double[]{15.9, 18.7, 5.3, 14.25, 4.5};
        double expected = 11.73;
        assertEquals(expected, VectorArithmeticLogic.checkArithmeticalSum(arr), 0.01);
    }

    @Test
    public void testGeometricalSum() {
        double[] arr = new double[]{15.9, 18.7, 5.3, 14.25, 4.5};
        double expected = 10.02;
        assertEquals(expected, VectorArithmeticLogic.checkGeometricalSum(arr), 0.01);
    }

    @Test
    public void testReverseArray() {
        double[] actual = new double[]{15.9, 19.7, 15.3, 24.7, 14.25, 4.5,};
        VectorArithmeticLogic.reverseArray(actual);
        double[] expected = new double[]{4.5, 14.25, 24.7, 15.3, 19.7, 15.9};
        assertArrayEquals(expected, actual, 0.0001);
    }
}