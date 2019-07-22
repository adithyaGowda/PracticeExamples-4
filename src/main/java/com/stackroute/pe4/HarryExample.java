package com.stackroute.pe4;

import java.util.regex.Pattern;

public class HarryExample {

    public boolean exampleHarry(String input){

        String[] strArray = new String[2];

        strArray = input.split(" ");

        boolean isMatch = Pattern.matches(input,strArray[2]);

        System.out.println("Is Harry here? "+isMatch);


        return isMatch;
    }
}
