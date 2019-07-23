package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class NumberOfOccurenceTest {
    NumberOfOccurence numberOfOccurence;

    @Before
    public void setUp() throws Exception {
        numberOfOccurence = new NumberOfOccurence();
    }

    @After
    public void tearDown() throws Exception {
        numberOfOccurence = null;
    }

    @Test
    public void givenInputStringShouldReturnNumberOfOccurence(){
        assertEquals(10,numberOfOccurence.occurenceOfChar("Java is java again java again","a"));
    }

    @Test
    public void givenInputStringWillNotGiveTheExpectedResult(){
        assertNotEquals(1,numberOfOccurence.occurenceOfChar("Java is java again java again","j"));
    }

    @Test
    public void givenInputStringShouldReturnNumberOfOccurenceofACharacter(){
        assertEquals(5,numberOfOccurence.occurenceOfChar("hello world, welcome to programming","o"));
    }

    @Test( expected = NullPointerException.class )
    public void inputNullValuesGives(){

        int data = numberOfOccurence.occurenceOfChar(null,null);

    }


}