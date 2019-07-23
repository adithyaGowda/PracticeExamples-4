package com.stackroute.pe4;

public class ReverseEachWord {

    public String reverseString(String input){


         String output = " ";

         String[] eachWord = input.split(" ");

         for (int i=0; i<eachWord.length; i++){

             String string = eachWord[i];
             String reverse = "";

             for (int j=string.length() - 1; j>=0 ; j--){
                 reverse = reverse + string.charAt(j);
             }

             output = output + reverse +" ";
         }

        return output.trim();

    }

}
