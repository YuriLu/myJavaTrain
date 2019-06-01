package by.epam.javatraining.yurilukashevich.lesson05.task03.model;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MoodSensorTest {

    @Test
    public void testUserMoodForZero() {
        int cryingFaceMoodStyle = 0;
        String expected = "\uD83D\uDE22";
        assertEquals(expected, MoodSensor.getUserMood(cryingFaceMoodStyle));
    }

    @Test
    public void testUserMoodForOne() {
        int TiredFaceMoodStyle = 1;
        String expected = "\uD83D\uDE2B";
        assertEquals(expected, MoodSensor.getUserMood(TiredFaceMoodStyle));
    }

    @Test
    public void testUserMoodForTwo() {
        int NeutralMoodStyle = 2;
        String expected = "\uD83D\uDE10";
        assertEquals(expected, MoodSensor.getUserMood(NeutralMoodStyle));
    }

    @Test
    public void testUserMoodForThree() {
        int SmilingMoodStyle = 3;
        String expected = "\u263A";
        assertEquals(expected, MoodSensor.getUserMood(SmilingMoodStyle));
    }

    @Test
    public void testUserMoodForFour() {
        int UpsideDownMoodStyle = 4;
        String expected = "\uD83D\uDE43";
        assertEquals(expected, MoodSensor.getUserMood(UpsideDownMoodStyle));
    }
}
