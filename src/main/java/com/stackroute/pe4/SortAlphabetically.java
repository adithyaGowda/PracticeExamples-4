package com.stackroute.pe4;

import java.util.Arrays;
import java.util.List;

public class SortAlphabetically {

    public String alphabeticallySort(String input){

        String temp = null;

        String[] words = input.split(" ");

        for (int i=0; i<words.length; i++){
            for (int j=0; j<words.length; j++){

                if (words[j].compareToIgnoreCase(words[i])>0){
                    temp = words[i];
                    words[i] = words[j];
                    words[j] = temp;
                }

            }
        }

        for (int i=0; i<words.length; i++){
            System.out.println(words[i]);
        }


        return "done";
    }

}
