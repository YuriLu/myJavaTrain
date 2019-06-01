package by.epam.javatraining.yurilukashevich.lesson05.addUnit.model;

import org.junit.Test;

import static org.junit.Assert.*;

public class DateLogicTest {

    @Test
    public void testGetNextDayNegativeDay() {
        int day = -5;
        int month = 12;
        int year = 2000;
        String expected = "Incorrect input";
        String actual = DateLogic.getNextDay(day, month, year);
        assertEquals(expected, actual);
    }

    @Test
    public void testGetNextDayNegativeMonth() {
        int day = 5;
        int month = -12;
        int year = 2000;
        String expected = "Incorrect input";
        String actual = DateLogic.getNextDay(day, month, year);
        assertEquals(expected, actual);
    }

    @Test
    public void testGetNextDayNegativeYear() {
        int day = 5;
        int month = 12;
        int year = -2;
        String expected = "Incorrect input";
        String actual = DateLogic.getNextDay(day, month, year);
        assertEquals(expected, actual);
    }

    @Test
    public void testGetNextDay31Month12() {
        int day = 31;
        int month = 12;
        int year = 1999;
        String expected = "Next day is: 1.1.2000";
        String actual = DateLogic.getNextDay(day, month, year);
        assertEquals(expected, actual);
    }

    @Test
    public void testGetNextDay31Month1() {
        int day = 31;
        int month = 1;
        int year = 1999;
        String expected = "Next day is: 1.2.1999";
        String actual = DateLogic.getNextDay(day, month, year);
        assertEquals(expected, actual);
    }

    @Test
    public void testGetNextDay31Month2() {
        int day = 31;
        int month = 2;
        int year = 1999;
        String expected = "Incorrect input";
        String actual = DateLogic.getNextDay(day, month, year);
        assertEquals(expected, actual);
    }

    @Test
    public void testGetNextDay30Month4() {
        int day = 30;
        int month = 4;
        int year = 1999;
        String expected = "Next day is: 1.5.1999";
        String actual = DateLogic.getNextDay(day, month, year);
        assertEquals(expected, actual);
    }

    @Test
    public void testGetNextDay31Month4() {
        int day = 31;
        int month = 4;
        int year = 1999;
        String expected = "Incorrect input";
        String actual = DateLogic.getNextDay(day, month, year);
        assertEquals(expected, actual);
    }

    @Test
    public void testGetNextDay29Month2LeapYear() {
        int day = 29;
        int month = 2;
        int year = 2000;
        String expected = "Next day is: 1.3.2000";
        String actual = DateLogic.getNextDay(day, month, year);
        assertEquals(expected, actual);
    }

    @Test
    public void testGetNextDay29Month2ShortYear() {
        int day = 29;
        int month = 2;
        int year = 1999;
        String expected = "Incorrect input";
        String actual = DateLogic.getNextDay(day, month, year);
        assertEquals(expected, actual);
    }

    @Test
    public void testGetNextDay28Month2ShortYear() {
        int day = 28;
        int month = 2;
        int year = 1999;
        String expected = "Next day is: 1.3.1999";
        String actual = DateLogic.getNextDay(day, month, year);
        assertEquals(expected, actual);
    }

    @Test
    public void testGetNextDay28Month2LeapYear() {
        int day = 28;
        int month = 2;
        int year = 1600;
        String expected = "Next day is: 29.2.1600";
        String actual = DateLogic.getNextDay(day, month, year);
        assertEquals(expected, actual);
    }
}