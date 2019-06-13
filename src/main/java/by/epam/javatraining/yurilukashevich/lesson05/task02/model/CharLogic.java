package by.epam.javatraining.yurilukashevich.lesson05.task02.model;

public class CharLogic {

    private static final char LETTER_A = 65;
    private static final char LETTER_E = 69;
    private static final char LETTER_I = 73;
    private static final char LETTER_O = 79;
    private static final char LETTER_U = 85;
    private static final char LETTER_A_HEX = '\u0041';
    private static final char LETTER_E_HEX = '\u0045';
    private static final char LETTER_I_HEX = '\u0049';
    private static final char LETTER_O_HEX = '\u004F';
    private static final char LETTER_U_HEX = '\u0055';
    private static final String VOWELS = "aeiou";

    public static boolean isSymbolAVowel(char symbol) {
        symbol = Character.toLowerCase(symbol);
        return symbol == 'a' || symbol == 'e' || symbol == 'i'
                || symbol == 'o' || symbol == 'u';
    }

    public static boolean isSymbolAVowelSecond(char symbol) {
        symbol = Character.toUpperCase(symbol);
        return (int) symbol == LETTER_A || (int) symbol == LETTER_E || (int) symbol == LETTER_I
                || (int) symbol == LETTER_O || (int) symbol == LETTER_U;
    }

    public static boolean isSymbolAVowelThird(char symbol) {
        symbol = Character.toLowerCase(symbol);
        Character[] arrayOfVowels = {'a', 'e', 'i', 'o', 'u'};
        for (Character element : arrayOfVowels) {
            if (element.charValue() == symbol) {
                return true;
            }
        }
        return false;
    }

    public static boolean isSymbolAVowelFourth(char symbol) {
        symbol = Character.toLowerCase(symbol);
        return VOWELS.contains(Character.toString(symbol));
    }

    public static boolean isSymbolAVowelFifth(char symbol) {
        symbol = Character.toLowerCase(symbol);
        return VOWELS.indexOf(symbol) != -1;
    }

    public static boolean isSymbolAVowelSeventh(char symbol) {
        symbol = Character.toUpperCase(symbol);
        Character[] arrayOfVowelCodes = {LETTER_A_HEX, LETTER_E_HEX, LETTER_I_HEX, LETTER_O_HEX, LETTER_U_HEX};
        for (Character element : arrayOfVowelCodes) {
            if (element.charValue() == symbol) {
                return true;
            }
        }
        return false;
    }

    public static boolean isSymbolAVowelEight(char symbol) {
        String[] arrayOfStringSymbols = {"a", "e", "i", "o", "u"};
        for (String element : arrayOfStringSymbols) {
            if (element.compareToIgnoreCase(Character.toString(symbol)) == 0) {
                return true;
            }
        }
        return false;
    }

    public static boolean isSymbolAVowelSixth(char symbol) {
        symbol = Character.toLowerCase(symbol);
        switch (symbol) {
            case 'a':
            case 'e':
            case 'u':
            case 'o':
            case 'i': {
                return true;
            }
        }
        return false;
    }

}

