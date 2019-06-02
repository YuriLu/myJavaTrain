package by.epam.javatraining.yurilukashevich.lesson06.task01.controller;


import by.epam.javatraining.yurilukashevich.lesson06.task01.model.HeadsAndTails;
import by.epam.javatraining.yurilukashevich.lesson06.task01.view.Printer;

public class EntryPoint {
    public static void main(String[] args) {
        Printer.print("\nGenerating results for challenge Heads Or Tails:");

        int iteration = 250;
        int headsCount = HeadsAndTails.countHeads(iteration);
        int tailsCount = iteration - headsCount;

        Printer.print("\nAfter " + iteration + " iteration we have Heads = "
                + headsCount + " and Tails = " + tailsCount + ".\n");

    }
}
