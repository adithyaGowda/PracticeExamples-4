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
    public void givenInputStringShouldReturnTheReversedString(){
        assertEquals("olleh dlrow",reverseEachWord.reverseString("hello world"));
    }

    @Test
    public void givenInputStringIsNotEqualToExpectedOutput(){
        assertNotEquals("o",reverseEachWord.reverseString("hello world"));
    }

    @Test
    public void givenInputStringReturnsNotNull(){
        assertNotNull(reverseEachWord.reverseString("welcome to programming"));
    }

    @Test( expected = NullPointerException.class )
    public void givenInputNullInputGivesNull(){

        String string = reverseEachWord.reverseString(null);
    }

}