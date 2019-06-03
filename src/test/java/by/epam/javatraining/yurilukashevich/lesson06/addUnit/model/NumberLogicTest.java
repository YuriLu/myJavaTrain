package by.epam.javatraining.yurilukashevich.lesson06.addUnit.model;

import org.junit.Test;

import static org.junit.Assert.*;

public class NumberLogicTest {

    @Test
    public void getAmountOfEven() {
        int number = 7766;
        int expected = 2;
        assertEquals(expected, NumberLogic.getAmountOfEven(number));
    }

    @Test
    public void getAmountOfOdd() {
        int number = 7766;
        int expected = 2;
        assertEquals(expected, NumberLogic.getAmountOfOdd(number));
    }

    @Test
    public void getSum() {
        int number = 496;
        int expected = 19;
        assertEquals(expected, NumberLogic.getSum(number));
    }

    @Test
    public void getMultiplication() {
        int number = 496;
        int expected = 216;
        assertEquals(expected, NumberLogic.getMultiplication(number));
    }

    @Test
    public void testArithmeticalSum() {
        int number = 496;
        int expected = 6;
        assertEquals(expected, NumberLogic.getArithmeticalSum(number),0.5);
    }

    @Test
    public void testGeometricalSum() {
        int number = 496;
        int expected = 6;
        assertEquals(expected, NumberLogic.getGeometricalSum(number),0.5);
    }

    @Test
    public void isPalindrome() {
        int number = 474;
        assertTrue(NumberLogic.isPalindrome(number));
    }

    @Test
    public void isPalindromeNegative() {
        int number = 447;
        assertFalse(NumberLogic.isPalindrome(number));
    }

    @Test
    public void testIsDigitsEqual() {
        int number = 777;
        assertTrue(NumberLogic.isDigitsEqual(number));
    }

    @Test
    public void testIsDigitsNotEqual() {
        int number = 496;
        assertTrue(NumberLogic.isDigitsNotEqual(number));
    }

    @Test
    public void testMaxDigit() {
        int number = 496;
        int expected = 9;
        assertEquals(expected, NumberLogic.getMaxDigit(number));
    }

    @Test
    public void testIsPerfect() {
        int number = 496;
        assertTrue(NumberLogic.isPerfect(number));
    }

    @Test
    public void testIsPerfectNegative() {
        int number = -496;
        assertTrue(NumberLogic.isPerfect(number));
    }

    @Test
    public void testIsPerfectZero() {
        int number = 0;
        assertFalse(NumberLogic.isPerfect(number));
    }

    @Test
    public void testIsPerfectFail() {
        int number = 26;
        assertFalse(NumberLogic.isPerfect(number));
    }
}