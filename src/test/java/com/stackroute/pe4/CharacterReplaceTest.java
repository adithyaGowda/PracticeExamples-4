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
    public void givenInputStringShouldReplaceCharacters(){
        String[] input1 = {"d","l"};
        String[] input2 = {"f","t"};

        assertEquals("faity fry",characterReplace.replaceCharacter("daily dry",input1,input2));
    }

    @Test
    public void givenInputStringShouldReturnReplacedCharacters(){
        String[] input1 = {"a","c"};
        String[] input2 = {"z","i"};

        assertNotEquals("sasadsads",characterReplace.replaceCharacter("deccan herald",input1,input2));
    }

    @Test
    public void givenInputAsNullShouldReturnNull(){

        assertNull(characterReplace.replaceCharacter(null,null,null));
    }

    @Test
    public void givenInputStringAsNullShouldReturnNull(){

        String[] input1 = {"a","c"};


        assertNull(characterReplace.replaceCharacter(null,input1,null));
    }

    public void givenInputStringShouldReturnNotNullValue (){
        String[] input1 = {"d","l"};
        String[] input2 = {"f","t"};

        assertNotNull(characterReplace.replaceCharacter("kitkat",input1,input2));
    }
}