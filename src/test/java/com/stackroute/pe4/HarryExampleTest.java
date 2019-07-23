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
    public void givenInputShouldReturnBooleanTrue (){

        assertEquals(true, harryExample.exampleHarry("This is Harry"));
    }

    @Test
    public void givenInputShouldReturnBooleanValue (){

        assertEquals(true, harryExample.exampleHarry("Hey my name is Harry and I'm from Berlin"));
    }

    @Test
    public void givenInputShouldReturnBooleanFalse (){

        assertEquals(false, harryExample.exampleHarry("This is Henry"));
    }

    @Test
    public void givenInputStringChecksForNotEquality(){

        assertNotEquals(true, harryExample.exampleHarry("adadasdsadasfd"));
    }

    @Test(expected = NullPointerException.class)
    public void givenNullInputShouldThrowNullPointerException(){

            boolean flag = harryExample.exampleHarry(null);

    }
}