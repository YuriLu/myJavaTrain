package by.epam.javatraining.yurilukashevich.lesson06.task03.controller;


import by.epam.javatraining.yurilukashevich.lesson06.task03.model.NumberLogic;
import by.epam.javatraining.yurilukashevich.lesson06.task03.view.Printer;

public class EntryPoint {
    public static void main(String[] args) {
        int number = 1;

        int result = NumberLogic.countFactorial(number);
        Printer.print("\nEntered number " + number + " has factorial = " + result + "\n");
    }
}
