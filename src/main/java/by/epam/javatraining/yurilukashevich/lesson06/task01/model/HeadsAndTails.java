package by.epam.javatraining.yurilukashevich.lesson06.task01.model;

import java.util.Random;

public class HeadsAndTails {

    public static int countHeads(int iteration) {
        int count = 0;
        iteration = iteration > 0 ? iteration : -iteration;
        final Random RANDOM = new Random();

        for (int i = 0; i < iteration; i++) {
            if (RANDOM.nextBoolean()) { //true for HEADS, false for Tails
                count++;
            }
        }
        return count;
    }
}

