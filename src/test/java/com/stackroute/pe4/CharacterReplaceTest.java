package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CharacterReplaceTest {
    CharacterReplace characterReplace;

    @Before
    public void setUp() throws Exception {
        characterReplace = new CharacterReplace();
    }

    @After
    public void tearDown() throws Exception {
        characterReplace = null;
    }

    @Test
    public void input(){
        String[] input1 = {"d","l"};
        String[] input2 = {"f","t"};

        assertEquals("faity fry",characterReplace.replaceCharacter("daily dry",input1,input2));
    }
}