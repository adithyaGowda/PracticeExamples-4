package com.stackroute.pe4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatcherExample {

    public String matcherEx(String input, String word){

        if (input == null | word == null)
            return null;


        int count = 0;

        Pattern pattern = Pattern.compile(word);

        Matcher matcher = pattern.matcher(input);

        while(matcher.find()){

            System.out.println("Found at "+matcher.start()+" - "+(matcher.end()));
            count++;

        }

        if(count == 0)
            return "Not matched";
        else
            return "Matched";
    }
}
