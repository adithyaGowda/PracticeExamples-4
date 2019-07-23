package com.stackroute.pe4;

import java.util.Arrays;
import java.util.regex.Pattern;

public class HarryExample {


    public boolean exampleHarry(String input) throws NullPointerException{



        String [] data = input.split(" ");

        String x = "";

        for (int i=0; i<data.length; i++){
            if (data[i].equals("Harry"))
                x = data[i];
        }

        boolean isMatch = Pattern.matches("Harry",x);

        System.out.println("Is Harry here? "+isMatch);


        return isMatch;
    }
}

