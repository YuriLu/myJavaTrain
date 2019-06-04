package by.epam.javatraining.yurilukashevich.lesson05.task03.controller;

import by.epam.javatraining.yurilukashevich.lesson05.task03.model.MoodSensor;
import by.epam.javatraining.yurilukashevich.lesson05.task03.view.Printer;

public class EntryPoint {
    public static void main(String[] args) {

        String moodIcon = MoodSensor.guessUserMood();
        Printer.print("\nLet me guess your mood.....You are " + moodIcon + " today \n");
    }
}
