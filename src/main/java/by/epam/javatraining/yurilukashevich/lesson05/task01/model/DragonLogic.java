package by.epam.javatraining.yurilukashevich.lesson05.task01.model;

public class DragonLogic {

    public static int calculateHeads(int age) {

        int headsGrowingPerYear = 3;                // initial heads growing speed
        int heads = 3;                              // dragon born with 3 heads
        int childhoodAge = 200;                     // heads start growing by 2 after this age
        int middleAge = 300;                        // heads start growing by 1 after this age

        if (age < 0) {                              // age should be positive, in other case we will output 0
            heads = 0;
        } else {
            if (age <= childhoodAge) {                           //up to 200 years grows 3 heads per year
                heads += age * headsGrowingPerYear;
            } else if (age <= middleAge) {                      //from 200 till 300 years grows 2 heads per year
                heads += childhoodAge * headsGrowingPerYear
                        + --headsGrowingPerYear * (age - childhoodAge);
            } else {                                            //from 300 years grows 1 head per year
                heads += childhoodAge * headsGrowingPerYear
                        + --headsGrowingPerYear * (middleAge - childhoodAge)
                        + --headsGrowingPerYear * (age - middleAge);
            }
        }
        return heads;
    }

    public static int calculateEyes(int age) {
        int eyesPerHead = 2;
        return eyesPerHead * calculateHeads(age);
    }
}
