package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HarryExampleTest {
    HarryExample harryExample;

    @Before
    public void setUp() throws Exception {
        harryExample = new HarryExample();
    }

    @After
    public void tearDown() throws Exception {
        harryExample = null;
    }

    @Test
    public void inputStringChecksForWordHarry(){

        assertEquals(true, harryExample.exampleHarry("This is Harry"));
    }

    @Test
    public void inputStringChecksForWordHarryAndReturnFalse(){

        assertEquals(false, harryExample.exampleHarry("This is Henry"));
    }

    @Test
    public void inputStringChecksForNotEquality(){

        assertNotEquals(true, harryExample.exampleHarry("This is Henry"));
    }
}