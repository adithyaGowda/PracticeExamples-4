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
    public void inputStringShouldReturnNumberOfOccurence(){
        assertEquals(10,numberOfOccurence.occurenceOfChar("Java is java again java again","a"));
    }

    @Test
    public void inputStringWillNotGiveTheExpectedResult(){
        assertNotEquals(1,numberOfOccurence.occurenceOfChar("Java is java again java again","j"));
    }

    @Test
    public void inputStringShouldReturnNumberOfOccurenceofACharacter(){
        assertEquals(5,numberOfOccurence.occurenceOfChar("hello world, welcome to programming","o"));
    }

    @Test
    public void inputNullShouldGiveZeroCount(){
        assertEquals(0,numberOfOccurence.occurenceOfChar(null,null));
    }


}