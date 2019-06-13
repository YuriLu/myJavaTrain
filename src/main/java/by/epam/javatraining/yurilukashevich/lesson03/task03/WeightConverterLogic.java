package by.epam.javatraining.yurilukashevich.lesson03.task03;

public class WeightConverterLogic {
    public static double convertKilogramsToMilligrams(double mass) {
        return mass*1_000_000;
    }

    public static double convertKilogramsToGrams(double mass) {
        return mass*1_000;
    }

    public static double convertKilogramsToTons(double mass) {
        return mass/1_000;
    }

}