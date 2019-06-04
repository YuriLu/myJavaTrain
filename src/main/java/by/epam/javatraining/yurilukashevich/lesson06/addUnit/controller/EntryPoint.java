package by.epam.javatraining.yurilukashevich.lesson06.addUnit.controller;

import by.epam.javatraining.yurilukashevich.lesson06.addUnit.model.NumberLogic;
import by.epam.javatraining.yurilukashevich.lesson06.addUnit.view.Printer;

public class EntryPoint {
    public static void main(String[] args) {
        int number = 4994;

        int result = NumberLogic.checkAmountOfEven(number);
        int resultTwo = NumberLogic.checkAmountOfOdd(number);
        Printer.print("\nEntered number " + number + " has " + result + " even and " + resultTwo + " odd digits.\n");

        result = NumberLogic.checkSum(number);
        resultTwo = NumberLogic.checkMultiplication(number);
        Printer.print("\nEntered number " + number + " has Sum = " + result + " and Multiplication = " + resultTwo + " of its digits.\n");

        double sum = NumberLogic.checkArithmeticalSum(number);
        double sumTwo = NumberLogic.checkGeometricalSum(number);
        Printer.print("\nEntered number " + number + " has ArithmeticalSum = " + sum + " and GeometricalSum = " + sumTwo + " of its digits.\n");

        boolean resultBool = NumberLogic.isDigitsEqual(number);
        Printer.print("\nEntered number " + number + " has all equal digits? --> " + resultBool + "\n");

        resultBool = NumberLogic.isDigitsNotEqual(number);
        Printer.print("\nEntered number " + number + " has all not equal digits? --> " + resultBool + "\n");

        resultBool = NumberLogic.isPalindrome(number);
        Printer.print("\nEntered number " + number + " is palindrome? --> " + resultBool + ".\n");

        result = NumberLogic.checkMaxDigit(number);
        Printer.print("\nEntered number " + number + " has max digit = " + result + ".\n");

        resultBool = NumberLogic.isPerfect(number);
        Printer.print("\nEntered number " + number + " is perfect? --> " + resultBool + ".\n");
    }
}
