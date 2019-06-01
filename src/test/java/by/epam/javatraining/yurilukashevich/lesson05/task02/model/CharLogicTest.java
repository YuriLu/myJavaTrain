package by.epam.javatraining.yurilukashevich.lesson05.task02.model;

import org.junit.Test;

import static org.junit.Assert.*;

public class CharLogicTest {

    @Test
    public void testIsSymbolAVowel() {
        char symbol = 'j';
        assertFalse(CharLogic.isSymbolAVowel(symbol));
    }

    @Test
    public void testIsSymbolAVowelTwo() {
        char symbol = (char) 97;
        assertTrue(CharLogic.isSymbolAVowel(symbol));
    }
    @Test
    public void testIsSymbolAVowelThree() {
        char symbol = 'I';
        assertTrue(CharLogic.isSymbolAVowel(symbol));
    }
    @Test
    public void testIsSymbolAVowelFour() {
        char symbol = 'O';
        assertTrue(CharLogic.isSymbolAVowel(symbol));
    }

    @Test
    public void testIsSymbolAVowelFive() {
        char symbol = 'U';
        assertTrue(CharLogic.isSymbolAVowel(symbol));
    }

    @Test
    public void testIsSymbolAVowelSix() {
        char symbol = 'a';
        assertTrue(CharLogic.isSymbolAVowel(symbol));
    }

    @Test
    public void testIsSymbolAVowelSeven() {
        char symbol = '\u0049';
        assertTrue(CharLogic.isSymbolAVowel(symbol));
    }

    @Test
    public void testIsSymbolAVowelEight() {
        char symbol = 'i';
        assertTrue(CharLogic.isSymbolAVowel(symbol));
    }

    @Test
    public void testIsSymbolAVowelNine() {
        char symbol = 'o';
        assertTrue(CharLogic.isSymbolAVowel(symbol));
    }







}