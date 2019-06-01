package by.epam.javatraining.yurilukashevich.lesson05.task01.model;

import org.junit.Test;

import static org.junit.Assert.*;

public class DragonLogicTest {

    @Test
    public void testCalculatingHeadsPositive() {
        int age = 5;
        int expected = 18;
        assertEquals(expected, DragonLogic.calculateHeads(age));
    }

    @Test
    public void testCalculatingHeadsZero() {
        int age = 0;
        int expected = 3;
        assertEquals(expected, DragonLogic.calculateHeads(age));
    }

    @Test
    public void testCalculatingHeadsNegative() {
        int age = -50;
        int expected = 0;
        assertEquals(expected, DragonLogic.calculateHeads(age));
    }

    @Test
    public void testCalculatingHeadsAfterChildHoodAndBeforeMiddleAge() {
        int age = 201;
        int expected = 605;
        assertEquals(expected, DragonLogic.calculateHeads(age));
    }

    @Test
    public void testCalculatingHeadsAfterMiddleAge() {
        int age = 301;
        int expected = 804;
        assertEquals(expected, DragonLogic.calculateHeads(age));
    }

    @Test
    public void testCalculateEyes() {
        int age = 301;
        int expected = 1608;
        assertEquals(expected, DragonLogic.calculateEyes(age));
    }
}