package by.epam.javatraining.yurilukashevich.lesson05.task02.controller;

import by.epam.javatraining.yurilukashevich.lesson05.task02.model.CharLogic;
import by.epam.javatraining.yurilukashevich.lesson05.task02.view.Printer;

public class EntryPoint {
    public static void main(String[] args) {
        char symbol = 'a';

        boolean result = CharLogic.isSymbolAVowel(symbol);
        Printer.print("\nEntered symbol is vowel by test 1? --> " + result + "\n");

        result = CharLogic.isSymbolAVowelSecond(symbol);
        Printer.print("\nEntered symbol is vowel by test 2? --> " + result + "\n");

        result = CharLogic.isSymbolAVowelThird(symbol);
        Printer.print("\nEntered symbol is vowel by test 3? --> " + result + "\n");

        result = CharLogic.isSymbolAVowelFourth(symbol);
        Printer.print("\nEntered symbol is vowel by test 4? --> " + result + "\n");

        result = CharLogic.isSymbolAVowelFifth(symbol);
        Printer.print("\nEntered symbol is vowel by test 5? --> " + result + "\n");

        result = CharLogic.isSymbolAVowelSixth(symbol);
        Printer.print("\nEntered symbol is vowel by test 6? --> " + result + "\n");

        result = CharLogic.isSymbolAVowelSeventh(symbol);
        Printer.print("\nEntered symbol is vowel by test 7? --> " + result + "\n");

        result = CharLogic.isSymbolAVowelEight(symbol);
        Printer.print("\nEntered symbol is vowel by test 8? --> " + result + "\n");

        System.out.println();
    }
}
