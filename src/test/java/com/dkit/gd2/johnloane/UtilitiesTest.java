package com.dkit.gd2.johnloane;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class UtilitiesTest
{
    private Utilities util;

    @Before
    public void setup()
    {
        util = new Utilities();
    }

    @Test
    public void everyNthCharEvery2FromMoreThanTwo() throws Exception
    {
        char[] output = util.everyNthChar(new char[]{'h', 'e', 'l', 'l', 'o'}, 2);
        assertArrayEquals(new char[]{'e', 'l'}, output);
    }

    @Test
    public void everyNthCharNBiggerThanArrayLength() throws Exception
    {
        char[] output = util.everyNthChar(new char[]{'h', 'e', 'l', 'l', 'o'}, 8);
        assertArrayEquals(new char[]{'h', 'e', 'l', 'l', 'o'}, output);
    }

    @Test
    public void everyNthCharNull() throws Exception
    {
        char[] output = util.everyNthChar(null, 8);
        assertNull(output);
    }

    @Test
    public void everyNthCharNIsZero() throws Exception
    {
        char[] output = util.everyNthChar(new char[]{'h', 'e', 'l', 'l', 'o'}, 0);
        assertArrayEquals(new char[]{'h', 'e', 'l', 'l', 'o'}, output);
    }

    @Test
    public void removePairsAABCDDEFF() throws Exception
    {
        assertEquals("ABCDEF", util.removePairs("AABCDDEFF"));
    }

    @Test
    public void removePairsABCCABDEEF() throws Exception
    {
        assertEquals("ABCABDEF", util.removePairs("ABCCABDEEF"));
    }

    @Test
    public void removePairsNull() throws Exception
    {
        assertNull("Did not get null returned when null argument passed", util.removePairs(null));
    }

    @Test
    public void removePairsSingleChar() throws Exception
    {
        assertEquals("A", util.removePairs("A"));
    }

    @Test
    public void removePairsBlankChar() throws Exception
    {
        assertEquals("", util.removePairs(""));
    }

    @Test
    public void removePairsSpaceInString() throws Exception
    {
        assertEquals("Helo there", util.removePairs("Hello there"));
    }

    @Test
    public void removePairsRepeatingChar() throws Exception
    {
        assertEquals("A", util.removePairs("AAAAAA"));
    }

    @Test
    public void removePairsMixedCase() throws Exception
    {
        assertEquals("AaAaAa", util.removePairs("AaAaAa"));
    }

    @Test
    public void converter() throws Exception
    {
        assertEquals(300, util.converter(10,5));
    }

    @Test(expected = ArithmeticException.class)
    public void converterZero() throws Exception
    {
        util.converter(10,0);
    }

    @Test
    public void nullIfOddLengthOdd() throws Exception
    {
        assertNull(util.nullIfOddLength("odd"));
    }

    @Test
    public void nullIfOddLengthEven() throws Exception
    {
        assertNotNull(util.nullIfOddLength("even"));
    }
}