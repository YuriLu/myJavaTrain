package by.epam.javatraining.yurilukashevich.lesson03.task03;

import by.epam.javatraining.yurilukashevich.lesson03.serviceModule.Printer;

public class EntryPoint {
    public static void main(String[] args) {
        double dinosaurWeightInKilogram = 40_500;

        Printer.print("\nDinosaur weights " + dinosaurWeightInKilogram + " kilogram = "
                + WeightConverterLogic.convertKilogramsToMilligrams(dinosaurWeightInKilogram) + " milligrams = "
                + WeightConverterLogic.convertKilogramsToGrams(dinosaurWeightInKilogram) + " grams = "
                + WeightConverterLogic.convertKilogramsToTonns(dinosaurWeightInKilogram) + " tons\n");
    }
}
