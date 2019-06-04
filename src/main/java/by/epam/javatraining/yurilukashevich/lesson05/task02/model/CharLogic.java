package by.epam.javatraining.yurilukashevich.lesson05.task02.model;

public class CharLogic {

    private static final char letterA = 65;
    private static final char letterE = 69;
    private static final char letterI = 73;
    private static final char letterO = 79;
    private static final char letterU = 85;


    public static boolean isSymbolAVowel(char symbol) {
        symbol = Character.toLowerCase(symbol);
        return symbol == 'a' || symbol == 'e' || symbol == 'i'
                || symbol == 'o' || symbol == 'u';
    }

    public static boolean isSymbolAVowelSecond(char symbol) {
        symbol = Character.toUpperCase(symbol);
        return (int) symbol == letterA || (int) symbol == letterE || (int) symbol == letterI
                || (int) symbol == letterO || (int) symbol == letterU;
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
        String vowels = "aeiou";
        return vowels.contains(Character.toString(symbol));
    }

    public static boolean isSymbolAVowelFifth(char symbol) {
        symbol = Character.toLowerCase(symbol);
        String vowels = "aeiou";
        return vowels.indexOf(symbol) != -1;
    }

    public static boolean isSymbolAVowelSix(char symbol) {
        symbol = Character.toLowerCase(symbol);
        Character[] arrayOfVowels = {'a', 'e', 'i', 'o', 'u'};
        for (Character element : arrayOfVowels) {
            if (element == symbol) {
                return true;
            }
        }
        return false;
    }

    public static boolean isSymbolAVowelSeven(char symbol) {
        symbol = Character.toUpperCase(symbol);
        Character[] arrayOfVowelCodes = {'\u0041', '\u0045', '\u0049', '\u004F', '\u0055'};
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

    public static boolean isSymbolAVowelNine(char symbol) {
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

