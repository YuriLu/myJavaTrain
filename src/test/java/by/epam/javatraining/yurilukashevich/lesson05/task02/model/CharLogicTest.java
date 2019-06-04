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
        char symbol = (char) 85;
        assertTrue(CharLogic.isSymbolAVowelSecond(symbol));
    }
    @Test
    public void testIsSymbolAVowelThree() {
        char symbol = 'I';
        assertTrue(CharLogic.isSymbolAVowelThird(symbol));
    }
    @Test
    public void testIsSymbolAVowelFour() {
        char symbol = 'O';
        assertTrue(CharLogic.isSymbolAVowelFourth(symbol));
    }

    @Test
    public void testIsSymbolAVowelFive() {
        char symbol = 'U';
        assertTrue(CharLogic.isSymbolAVowelFifth(symbol));
    }

    @Test
    public void testIsSymbolAVowelSix() {
        char symbol = 'a';
        assertTrue(CharLogic.isSymbolAVowelSixth(symbol));
    }

    @Test
    public void testIsSymbolAVowelSeven() {
        char symbol = '\u0049';
        assertTrue(CharLogic.isSymbolAVowelSeventh(symbol));
    }

    @Test
    public void testIsSymbolAVowelEight() {
        char symbol = 'i';
        assertTrue(CharLogic.isSymbolAVowelEight(symbol));
    }







}