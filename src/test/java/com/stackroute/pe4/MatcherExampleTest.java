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
    public void inputStringShouldMatchThePattern(){
        assertEquals("Done", matcherExample.matcherEx("She sells seashells by the seashore","se"));

    }

    @Test
    public void inputStringValidatesForNotEqualValues(){
        assertNotEquals("not done", matcherExample.matcherEx("She sells seashells by the seashore","se"));

    }

    @Test
    public void inputUnmatchedSubstringShouldReturnNull(){
        assertNull(matcherExample.matcherEx("She sells seashells by the seashore", "ab"));

    }

    @Test
    public void inputMatchedSubstringShouldReturnNotNUll(){
        assertNotNull(matcherExample.matcherEx("She sells seashells by the seashore", "lls"));

    }

}