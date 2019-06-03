package by.epam.javatraining.yurilukashevich.lesson06.addUnit.controller;

import by.epam.javatraining.yurilukashevich.lesson06.addUnit.model.NumberLogic;
import by.epam.javatraining.yurilukashevich.lesson06.addUnit.view.Printer;

public class EntryPoint {
    public static void main(String[] args) {
        int number = 4994;

        int result = NumberLogic.getAmountOfEven(number);
        int resultTwo = NumberLogic.getAmountOfOdd(number);
        Printer.print("\nEntered number " + number + " has " + result + " even and " + resultTwo + " odd digits.\n");

        result = NumberLogic.getSum(number);
        resultTwo = NumberLogic.getMultiplication(number);
        Printer.print("\nEntered number " + number + " has Sum = " + result + " and Multiplication = " + resultTwo + " of its digits.\n");

        double sum = NumberLogic.getArithmeticalSum(number);
        double sumTwo = NumberLogic.getGeometricalSum(number);
        Printer.print("\nEntered number " + number + " has ArithmeticalSum = " + sum + " and GeometricalSum = " + sumTwo + " of its digits.\n");

        boolean resultBool = NumberLogic.isDigitsEqual(number);
        Printer.print("\nEntered number " + number + " has all equal digits? --> " + resultBool + "\n");

        resultBool = NumberLogic.isDigitsNotEqual(number);
        Printer.print("\nEntered number " + number + " has all not equal digits? --> " + resultBool + "\n");

        resultBool = NumberLogic.isPalindrome(number);
        Printer.print("\nEntered number " + number + " is palindrom? --> " + resultBool + ".\n");

        result = NumberLogic.getMaxDigit(number);
        Printer.print("\nEntered number " + number + " has max digit = " + result + ".\n");

        resultBool = NumberLogic.isPerfect(number);
        Printer.print("\nEntered number " + number + " is perfect? --> " + resultBool + ".\n");
    }
}
