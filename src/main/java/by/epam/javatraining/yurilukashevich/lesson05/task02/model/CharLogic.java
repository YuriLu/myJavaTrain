package by.epam.javatraining.yurilukashevich.lesson05.task02.model;

public class CharLogic {

    public static boolean isSymbolAVowel(char symbol) {
        return symbol == 'a' || symbol == 'e' || symbol == 'i' || symbol == 'o' || symbol == 'u'
                || symbol == 'A' || symbol == 'E' || symbol == 'I' || symbol == 'O' || symbol == 'U';
    }

    public static boolean isSymbolAVowelTwo(char symbol) {
        return (int) symbol == 65 || (int) symbol == 97 || (int) symbol == 69 || (int) symbol == 101
                || (int) symbol == 73 || (int) symbol == 105 || (int) symbol == 79
                || (int) symbol == 111 || (int) symbol == 85 || (int) symbol == 117;
    }

    public static boolean isSymbolAVowelThree(char symbol) {
        Character[] arrayOfVowelCodes = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        for (Character element : arrayOfVowelCodes) {
            if (element.charValue() == symbol) {
                return true;
            }
        }
        return false;
    }

    public static boolean isSymbolAVowelFour(char symbol) {
        String vowels = "aeiouAEIOU";
        return vowels.contains(Character.toString(symbol));
    }

    public static boolean isSymbolAVowelFive(char symbol) {
        String vowels = "aeiouAEIOU";
        return vowels.indexOf(symbol) != -1;
    }

    public static boolean isSymbolAVowelSix(char symbol) {

        Character[] arrayOfVowels = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        for (Character element : arrayOfVowels) {
            if (element == symbol) {
                return true;
            }
        }
        return false;
    }

    public static boolean isSymbolAVowelSeven(char symbol) {
        Character[] arrayOfVowelCodes = {'\u0041', '\u0045', '\u0049', '\u004F', '\u0055', '\u0061', '\u0065', '\u0069',
                '\u006F', '\u0075'};
        for (Character element : arrayOfVowelCodes) {
            if (element.charValue() == symbol) {
                return true;
            }
        }
        return false;
    }

    public static boolean isSymbolAVowelEight(char symbol) {
        String[] arrayOfStringSymbols = {"a", "e", "i", "o", "u", "A", "E", "I", "O", "U"};
        for (String element : arrayOfStringSymbols) {
            if (element.compareToIgnoreCase(Character.toString(symbol)) == 0) {
                return true;
            }
        }
        return false;
    }

    public static boolean isSymbolAVowelNine(char symbol) {
        switch (symbol) {
            case 'a':
            case 'e':
            case 'U':
            case 'O':
            case 'I':
            case 'E':
            case 'A':
            case 'u':
            case 'o':
            case 'i': {
                return true;
            }
            default: {
                return false;
            }
        }
    }

}

