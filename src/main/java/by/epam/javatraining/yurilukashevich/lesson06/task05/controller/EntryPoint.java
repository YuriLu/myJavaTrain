package by.epam.javatraining.yurilukashevich.lesson06.task05.controller;


import by.epam.javatraining.yurilukashevich.lesson06.task05.model.NumberLogic;
import by.epam.javatraining.yurilukashevich.lesson06.task05.view.Printer;

public class EntryPoint {
    public static void main(String[] args) {
        int number = -19;

        boolean result = NumberLogic.checkIsPrime(number);
        Printer.print("\nEntered number " + number + " is prime? --> " + result + "\n");
    }
}
