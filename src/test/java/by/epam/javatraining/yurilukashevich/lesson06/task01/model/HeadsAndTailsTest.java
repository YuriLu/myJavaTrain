package by.epam.javatraining.yurilukashevich.lesson06.task01.model;

import org.junit.Test;

import static org.junit.Assert.*;

public class HeadsAndTailsTest {

    @Test
    public void testCountHeads() {
        int iterations = 1000;
        int expected = 500;
        assertEquals(expected, HeadsAndTails.countHeads(iterations), 50);
    }

    @Test
    public void testCountHeadsNegative() {
        int iterations = -1000;
        int expected = 500;
        assertEquals(expected, HeadsAndTails.countHeads(iterations),50);
    }

    @Test
    public void testCountHeadsZero() {
        int iterations = 0;
        int expected = 0;
        assertEquals(expected, HeadsAndTails.countHeads(iterations));
    }
}