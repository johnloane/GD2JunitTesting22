package com.dkit.gd2.johnloane;

import org.junit.Test;

import static org.junit.Assert.*;

public class UtilitiesTest
{

    @Test
    public void everyNthChar() throws Exception
    {
        fail("This test has not been implemented yet");
    }

    @Test
    public void removePairsAABCDDEFF() throws Exception
    {
        Utilities util = new Utilities();
        assertEquals("ABCDEF", util.removePairs("AABCDDEFF"));
    }

    @Test
    public void removePairsABCCABDEEF() throws Exception
    {
        Utilities util = new Utilities();
        assertEquals("ABCABDEF", util.removePairs("ABCCABDEEF"));
    }

    @Test
    public void removePairsNull() throws Exception
    {
        Utilities util = new Utilities();
        assertNull("Did not get null returned when null argument passed", util.removePairs(null));
    }

    @Test
    public void removePairsSingleChar() throws Exception
    {
        Utilities util = new Utilities();
        assertEquals("A", util.removePairs("A"));
    }

    @Test
    public void removePairsBlankChar() throws Exception
    {
        Utilities util = new Utilities();
        assertEquals("", util.removePairs(""));
    }

    @Test
    public void removePairsSpaceInString() throws Exception
    {
        Utilities util = new Utilities();
        assertEquals("Helo there", util.removePairs("Hello there"));
    }

    @Test
    public void removePairsRepeatingChar() throws Exception
    {
        Utilities util = new Utilities();
        assertEquals("A", util.removePairs("AAAAAA"));
    }

    @Test
    public void removePairsMixedCase() throws Exception
    {
        Utilities util = new Utilities();
        assertEquals("AaAaAa", util.removePairs("AaAaAa"));
    }

    @Test
    public void converter() throws Exception
    {
        fail("This test has not been implemented yet");
    }

    @Test
    public void nullIfOddLength() throws Exception
    {
        fail("This test has not been implemented yet");
    }
}