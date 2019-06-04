package by.epam.javatraining.yurilukashevich.lesson06.task01.model;

import java.util.Random;

public class HeadsAndTails {

    private static final Random RANDOM = new Random();

    public static int countHeads(int iteration) {
        int count = 0;
        iteration = iteration > 0 ? iteration : -iteration;

        for (int i = 0; i < iteration; i++) {
            if (flipCoin() == 1) {
                count++;
            }
        }
        return count;
    }

    private static int flipCoin() {
        return RANDOM.nextInt(2);       //gives 1 or 0
    }
}

