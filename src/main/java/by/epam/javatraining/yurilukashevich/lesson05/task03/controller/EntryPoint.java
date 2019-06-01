package by.epam.javatraining.yurilukashevich.lesson05.task03.controller;

import by.epam.javatraining.yurilukashevich.lesson05.task03.model.MoodSensor;
import by.epam.javatraining.yurilukashevich.lesson05.task03.view.Printer;

public class EntryPoint {
    public static void main(String[] args) {

        int userMoodNumber = MoodSensor.getUserMoodNumber();
        String moodIcon = MoodSensor.getUserMood(userMoodNumber);

        Printer.print("\nLet me guess your mood.....You are " + moodIcon + " today \n");
    }
}
