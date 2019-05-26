package lesson03.task03;

public class WeightConverterLogic {
    public static double convertKilogramsToMilligrams(double massa) {
        return massa*1_000_000;
    }

    public static double convertKilogramsToGrams(double massa) {
        return massa*1_000;
    }

    public static double convertKilogramsToTonns(double massa) {
        return massa/1_000;
    }

}