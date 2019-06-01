package by.epam.javatraining.yurilukashevich.lesson05.task02.controller;

import by.epam.javatraining.yurilukashevich.lesson05.task02.model.CharLogic;
import by.epam.javatraining.yurilukashevich.lesson05.task02.view.Printer;

public class EntryPoint {
    public static void main(String[] args) {
        char symbol = 'a';

        boolean result = CharLogic.isSymbolAVowel(symbol);
        Printer.print("\nEntered symbol is vowel by test 1? --> " + result + "\n");

        result = CharLogic.isSymbolAVowelTwo(symbol);
        Printer.print("\nEntered symbol is vowel by test 2? --> " + result + "\n");

        result = CharLogic.isSymbolAVowelThree(symbol);
        Printer.print("\nEntered symbol is vowel by test 3? --> " + result + "\n");

        result = CharLogic.isSymbolAVowelFour(symbol);
        Printer.print("\nEntered symbol is vowel by test 4? --> " + result + "\n");

        result = CharLogic.isSymbolAVowelFive(symbol);
        Printer.print("\nEntered symbol is vowel by test 5? --> " + result + "\n");

        result = CharLogic.isSymbolAVowelSix(symbol);
        Printer.print("\nEntered symbol is vowel by test 6? --> " + result + "\n");

        result = CharLogic.isSymbolAVowelSeven(symbol);
        Printer.print("\nEntered symbol is vowel by test 7? --> " + result + "\n");

        result = CharLogic.isSymbolAVowelEight(symbol);
        Printer.print("\nEntered symbol is vowel by test 8? --> " + result + "\n");

        result = CharLogic.isSymbolAVowelNine(symbol);
        Printer.print("\nEntered symbol is vowel by test 9? --> " + result + "\n");
    }
}
