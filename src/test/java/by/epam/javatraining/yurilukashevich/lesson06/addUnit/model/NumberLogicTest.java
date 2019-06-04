package by.epam.javatraining.yurilukashevich.lesson06.addUnit.model;

import org.junit.Test;

import static org.junit.Assert.*;

public class NumberLogicTest {

    @Test
    public void testCheckAmountOfEven() {
        int number = 7766;
        int expected = 2;
        assertEquals(expected, NumberLogic.checkAmountOfEven(number));
    }

    @Test
    public void testCheckAmountOfOdd() {
        int number = 7766;
        int expected = 2;
        assertEquals(expected, NumberLogic.checkAmountOfOdd(number));
    }

    @Test
    public void testCheckSum() {
        int number = 496;
        int expected = 19;
        assertEquals(expected, NumberLogic.checkSum(number));
    }

    @Test
    public void testCheckMultiplication() {
        int number = 496;
        int expected = 216;
        assertEquals(expected, NumberLogic.checkMultiplication(number));
    }

    @Test
    public void testArithmeticalSum() {
        int number = 496;
        int expected = 6;
        assertEquals(expected, NumberLogic.checkArithmeticalSum(number),0.5);
    }

    @Test
    public void testCheckGeometricalSum() {
        int number = 496;
        int expected = 6;
        assertEquals(expected, NumberLogic.checkGeometricalSum(number),0.5);
    }

    @Test
    public void testIsPalindrome() {
        int number = 474;
        assertTrue(NumberLogic.isPalindrome(number));
    }

    @Test
    public void testIsPalindromeNegative() {
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
    public void testCheckMaxDigit() {
        int number = 496;
        int expected = 9;
        assertEquals(expected, NumberLogic.checkMaxDigit(number));
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