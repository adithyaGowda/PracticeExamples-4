package com.stackroute.pe4;

public class NumberOfOccurence {

    public int occurenceOfChar(String input, String data){

        if(input == null || data == null)
            return 0;

        int count = input.length() - input.replaceAll(data,"").length();


        System.out.println("Number of occurence of "+"'"+data+"'"+" in a given string is "+count);

        return count;
    }
}
