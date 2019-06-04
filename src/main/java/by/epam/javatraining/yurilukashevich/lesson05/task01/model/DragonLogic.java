package by.epam.javatraining.yurilukashevich.lesson05.task01.model;

public class DragonLogic {
    public static final int CHILDHOOD_AGE = 200;                 // heads start growing by 2 after this age
    public static final int MIDDLE_AGE = 300;                    // heads start growing by 1 after this age
    public static final int HEAD_BY_BORN = 3;                    // heads by born
    public static final int INITIAL_GROWING_SPEED = 3;           // initial heads growing speed
    public static final int EYES_PER_HEAD = 2;                   // eyes on head

    public static int calculateHeads(int age) {
        int heads = HEAD_BY_BORN;                                // dragon born with 3 heads
        int headsGrowingSpeed = INITIAL_GROWING_SPEED;           // initial heads growing speed

        if (age >= 0) {                              // age should be positive, in other case we will output 0
            if (age <= CHILDHOOD_AGE) {                           //up to 200 years grows 3 heads per year
                heads += age * headsGrowingSpeed;
            } else if (age <= MIDDLE_AGE) {                      //from 200 till 300 years grows 2 heads per year
                heads += CHILDHOOD_AGE * headsGrowingSpeed
                        - CHILDHOOD_AGE * --headsGrowingSpeed + headsGrowingSpeed * age;
            } else {                                            //from 300 years grows 1 head per year
                heads += CHILDHOOD_AGE * headsGrowingSpeed
                        + (MIDDLE_AGE - CHILDHOOD_AGE) * --headsGrowingSpeed
                        - MIDDLE_AGE * --headsGrowingSpeed + headsGrowingSpeed * age;
            }
        } else {
            heads = 0;
        }
        return heads;
    }

    public static int calculateEyes(int age) {
        return EYES_PER_HEAD * calculateHeads(age);
    }
}
