package com.stackroute.pe4;

public class CharacterReplace {

    public String replaceCharacter(String input, String[] data, String[] replace){

        if(input == null | data == null | replace == null)
            return null;

        String output = input.replace(data[0],replace[0]).replace(data[1],replace[1]);

        return output;
    }
}
