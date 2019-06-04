package by.epam.javatraining.yurilukashevich.lesson05.task03.model;

import org.junit.Test;

import static org.junit.Assert.*;

public class MoodSensorTest {

    @Test
    public void testUserMood() {
        String moods = MoodSensor.CRYING_FACE + MoodSensor.TIRED_FACE
                + MoodSensor.NEUTRAL_FACE + MoodSensor.WHITE_SMILING_FACE + MoodSensor.UPSIDE_DOWN_FACE;

        assertTrue(moods.contains(MoodSensor.guessUserMood()));
    }
}
