package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SortAlphabeticallyTest {
    SortAlphabetically sortAlphabetically;

    @Before
    public void setUp() throws Exception {
        sortAlphabetically = new SortAlphabetically();

    }

    @After
    public void tearDown() throws Exception {
        sortAlphabetically = null;
    }

    @Test
    public void givenInputStringDataShouldPrintWordsAlphabetically(){
        String x = "Lorem ipsum dolor sit amet consectetur adipiscing elit, sed do " +
                "eiusmod tempor incididunt ut labore et dolore magna aliqua" +
                " Ut enim ad minim veniam quis nostrud ";
        assertEquals("done",sortAlphabetically.alphabeticallySort(x));
    }

    @Test
    public void givenInputStringDataValidatingForNotEquality(){
        String x = "Lorem ipsum dolor sit amet consectetur adipiscing elit, sed do " +
                "eiusmod tempor incididunt ut labore et dolore magna aliqua" +
                " Ut enim ad minim veniam quis nostrud ";
        assertNotEquals("not done",sortAlphabetically.alphabeticallySort(x));
    }

    @Test( expected = NullPointerException.class )
    public void givenInputNullReturnsNull(){

        String string = sortAlphabetically.alphabeticallySort(null);
    }

    @Test
    public void givenInputStringShouldReturnNotNullValue(){
        assertNotNull(sortAlphabetically.alphabeticallySort("Hello world how you are doing"));
    }

}