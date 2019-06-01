package by.epam.javatraining.yurilukashevich.lesson05.task03.model;

import java.util.Random;

public class MoodSensor {

    public static String getUserMood(int moodNumber) {

        String mood = "";
        final String CRYING_FACE = "\uD83D\uDE22";
        final String TIRED_FACE = "\uD83D\uDE2B";
        final String NEUTRAL_FACE = "\uD83D\uDE10";
        final String WHITE_SMILING_FACE = "\u263A";
        final String UPSIDE_DOWN_FACE = "\uD83D\uDE43";

        switch (moodNumber) {
            case 0: {
                mood = CRYING_FACE;
                break;
            }
            case 1: {
                mood = TIRED_FACE;
                break;
            }
            case 2: {
                mood = NEUTRAL_FACE;
                break;
            }
            case 3: {
                mood = WHITE_SMILING_FACE;
                break;
            }
            case 4: {
                mood = UPSIDE_DOWN_FACE;
                break;
            }
        }
        return mood;
    }

    public static int getUserMoodNumber() {
        Random rnd = new Random();
        return rnd.nextInt(5);      //bound for random
    }
}
