package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseEachWordTest {

    ReverseEachWord reverseEachWord;

    @Before
    public void setUp() throws Exception {
        reverseEachWord = new ReverseEachWord();
    }

    @After
    public void tearDown() throws Exception {
        reverseEachWord = null;
    }

    @Test
    public void inputStringShouldReturnTheReversedString(){
        assertEquals("olleh dlrow",reverseEachWord.reverseString("hello world"));
    }

    @Test
    public void inputStringIsNotEqualToExpectedOutput(){
        assertNotEquals("o",reverseEachWord.reverseString("hello world"));
    }

    @Test
    public void inputNullInputGivesNullOutput(){
        assertNull(reverseEachWord.reverseString(null));
    }

}