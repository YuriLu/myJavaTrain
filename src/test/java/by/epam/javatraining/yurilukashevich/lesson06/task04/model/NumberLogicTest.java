package by.epam.javatraining.yurilukashevich.lesson06.task04.model;

import org.junit.Test;

import static org.junit.Assert.*;

public class NumberLogicTest {

    @Test
    public void checkParityOdd() {
        int number = 1593;
        assertTrue(NumberLogic.checkParity(number));
    }

    @Test
    public void checkParityEven() {
        int number = 42682;
        assertTrue(NumberLogic.checkParity(number));
    }

    @Test
    public void checkParityNegative() {
        int number = -1587;
        assertFalse(NumberLogic.checkParity(number));
    }

    @Test
    public void checkParityZero() {
        int number = 0;
        assertFalse(NumberLogic.checkParity(number));
    }

    @Test
    public void checkParityOneDigit() {
        int number = 5;
        assertFalse(NumberLogic.checkParity(number));
    }

    @Test
    public void checkParity() {
        int number = 7766;
        assertFalse(NumberLogic.checkParity(number));
    }

}