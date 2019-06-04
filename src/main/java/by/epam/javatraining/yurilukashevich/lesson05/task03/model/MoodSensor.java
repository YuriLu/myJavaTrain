package by.epam.javatraining.yurilukashevich.lesson05.task03.model;

import java.util.Random;

public class MoodSensor {
    public static final String CRYING_FACE = "\uD83D\uDE22";
    public static final String TIRED_FACE = "\uD83D\uDE2B";
    public static final String NEUTRAL_FACE = "\uD83D\uDE10";
    public static final String WHITE_SMILING_FACE = "\u263A";
    public static final String UPSIDE_DOWN_FACE = "\uD83D\uDE43";
    private static final int MOOD_COUNT = 5;
    private static final Random RANDOM = new Random();

    public static String guessUserMood() {
        String mood = NEUTRAL_FACE;

        switch (RANDOM.nextInt(MOOD_COUNT)) {
            case 0: {
                mood = CRYING_FACE;
                break;
            }
            case 1: {
                mood = TIRED_FACE;
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
}
