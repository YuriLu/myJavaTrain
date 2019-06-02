package by.epam.javatraining.yurilukashevich.lesson06.task02.controller;


import by.epam.javatraining.yurilukashevich.lesson06.task02.model.NumberLogic;
import by.epam.javatraining.yurilukashevich.lesson06.task02.view.Printer;

public class EntryPoint {
    public static void main(String[] args) {
        int number = -15679;

        boolean result = NumberLogic.checkIsIncreasing(number);
        Printer.print("\nEntered number " + number + " has increasing order? --> " + result + "\n");

        result = NumberLogic.checkIsDecreasing(number);
        Printer.print("\nEntered number " + number + " has decreasing order? --> " + result + "\n");
    }
}
