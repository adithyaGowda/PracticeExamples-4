package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MatcherExampleTest {

    MatcherExample matcherExample;

    @Before
    public void setUp() throws Exception {
        matcherExample = new MatcherExample();
    }

    @After
    public void tearDown() throws Exception {
        matcherExample = null;
    }

    @Test
    public void givenInputStringShouldMatchThePattern(){
        assertEquals("Matched", matcherExample.matcherEx("She sells seashells by the seashore","se"));

    }

    @Test
    public void givenInputStringValidatesForNotEqualValues(){
        assertNotEquals(" ", matcherExample.matcherEx("She sells seashells by the seashore","se"));

    }

    @Test
    public void givenInputUnmatchedSubstringShouldReturnAMessage(){
        assertEquals("Not matched",matcherExample.matcherEx("She sells seashells by the seashore", "ab"));

    }

    @Test
    public void inputMatchedSubstringShouldReturnNotNUll(){
        assertNotNull(matcherExample.matcherEx("She sells seashells by the seashore", "lls"));

    }

    @Test
    public void inputNullValuesReturnsNullValue(){
        assertNull(matcherExample.matcherEx(null, null));

    }

}