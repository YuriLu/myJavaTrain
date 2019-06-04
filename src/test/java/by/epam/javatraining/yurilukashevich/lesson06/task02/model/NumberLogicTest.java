package by.epam.javatraining.yurilukashevich.lesson06.task02.model;

import org.junit.Test;

import static org.junit.Assert.*;

public class NumberLogicTest {

    @Test
    public void testIsIncreasingOrder() {
        int number = 1234589;
        assertTrue(NumberLogic.IsIncreasing(number));
    }

    @Test
    public void testIsIncreasingOrderFalse() {
        int number = 1235489;
        assertFalse(NumberLogic.IsIncreasing(number));
    }

    @Test
    public void testIsIncreasingOrderOneDigitNumberNegative() {
        int number = -5;
        assertFalse(NumberLogic.IsIncreasing(number));
    }

    @Test
    public void testIsIncreasingOrderNegativeNumber() {
        int number = -5789;
        assertTrue(NumberLogic.IsIncreasing(number));
    }

    @Test
    public void testIsDecreasingOrderOneDigitNumber() {
        int number = 9;
        assertFalse(NumberLogic.IsDecreasing(number));
    }

    @Test
    public void testIsDecreasingOrder() {
        int number = 9631;
        assertTrue(NumberLogic.IsDecreasing(number));
    }

    @Test
    public void testIsDecreasingOrderFalse() {
        int number = 96831;
        assertFalse(NumberLogic.IsDecreasing(number));
    }

    @Test
    public void testIsDecreasingOrderNegativeNumber() {
        int number = -532;
        assertTrue(NumberLogic.IsDecreasing(number));
    }
}