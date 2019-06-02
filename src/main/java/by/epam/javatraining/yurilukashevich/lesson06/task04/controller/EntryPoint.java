package by.epam.javatraining.yurilukashevich.lesson06.task04.controller;


import by.epam.javatraining.yurilukashevich.lesson06.task04.model.NumberLogic;
import by.epam.javatraining.yurilukashevich.lesson06.task04.view.Printer;

public class EntryPoint {
    public static void main(String[] args) {
        int number = 7766;

        boolean result = NumberLogic.checkParity(number);
        Printer.print("\nEntered number " + number + " has equal parity --> " + result + "\n");

    }
}
