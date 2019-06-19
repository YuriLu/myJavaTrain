package by.epam.javatraining.yurilukashevich.lesson06.task05.model;

import org.junit.Test;

import static org.junit.Assert.*;

public class NumberLogicTest {

    @Test
    public void testIsPrimeForZero() {
        int number = 0;
        assertFalse(NumberLogic.checkIsPrime(number));
    }

    @Test
    public void testIsPrimeForOne() {
        int number = 1;
        assertFalse(NumberLogic.checkIsPrime(number));
    }

    @Test
    public void testIsPrime() {
        int number = 2;
        assertTrue(NumberLogic.checkIsPrime(number));
    }

    @Test
    public void testIsPrimeNonPrime() {
        int number = 122;
        assertFalse(NumberLogic.checkIsPrime(number));
    }

    @Test
    public void testIsPrimeNegative() {
        int number = -19;
        assertTrue(NumberLogic.checkIsPrime(number));
    }
}