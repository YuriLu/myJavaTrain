package by.epam.javatraining.yurilukashevich.lesson06.task03.model;

import org.junit.Test;

import static org.junit.Assert.*;

public class NumberLogicTest {

    @Test
    public void testFactorial() {
        int number = 5;
        int expected = 120;
        assertEquals(expected, NumberLogic.countFactorial(number));
    }

    @Test
    public void testFactorialZero() {
        int number = 0;
        int expected = 1;
        assertEquals(expected, NumberLogic.countFactorial(number));
    }

    @Test
    public void testFactorialOne() {
        int number = 1;
        int expected = 1;
        assertEquals(expected, NumberLogic.countFactorial(number));
    }

    @Test
    public void testFactorialNegative() {
        int number = -5;
        int expected = 0;
        assertEquals(expected, NumberLogic.countFactorial(number));
    }
}