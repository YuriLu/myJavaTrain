package by.epam.javatraining.yurilukashevich.lesson05.addUnit.controller;

import by.epam.javatraining.yurilukashevich.lesson05.addUnit.model.DateLogic;
import by.epam.javatraining.yurilukashevich.lesson05.addUnit.view.Printer;

public class EntryPoint {
    public static void main(String[] args) {
        int day = 28;
        int month = 2;
        int year = 2000;
        Printer.print("You have entered " + day + "." + month + "." + year+"\n");
        Printer.print(DateLogic.checkNextDay(day, month, year));
    }
}
