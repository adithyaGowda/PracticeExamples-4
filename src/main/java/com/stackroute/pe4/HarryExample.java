package com.stackroute.pe4;

import java.util.Arrays;
import java.util.regex.Pattern;

public class HarryExample {


    public boolean exampleHarry(String input){

        String [] data = input.split(" ");

        boolean isMatch = Pattern.matches("Harry",data[2]);

        System.out.println("Is Harry here? "+isMatch);


        return isMatch;
    }
}
