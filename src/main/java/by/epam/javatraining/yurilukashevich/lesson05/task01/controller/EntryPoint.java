package by.epam.javatraining.yurilukashevich.lesson05.task01.controller;

import by.epam.javatraining.yurilukashevich.lesson05.task01.model.DragonLogic;
import by.epam.javatraining.yurilukashevich.lesson05.task01.view.Printer;

public class EntryPoint {
    public static void main(String[] args) {
        int age = 200;

        int headsAmount = DragonLogic.calculateHeads(age);
        int eyesAmount = DragonLogic.calculateEyes(age);

        Printer.print("\nDragon of age " + age + " have " + headsAmount
                + " heads and " + eyesAmount + " eyes\n");
    }
}
