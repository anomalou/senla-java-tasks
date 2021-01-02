package com.senla.three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;

public class Main {
    public static void main (String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true){
            System.out.print("Type sentence: ");
            String sentence = reader.readLine();

            int wordNumber = 0;
            for(int i = 0; i < sentence.length(); i++)
                if(sentence.charAt(i) == ' ')
                    wordNumber++;

            wordNumber++;
            System.out.println("Words number in the sentence: " + wordNumber);

            String[] words = sentence.split(" ");

            for(int i = 0; i < words.length; i++){
                for(int t = 1; t < words.length; t++){
                    if(words[t - 1].length() > words[t].length()) {
                        String temp = words[t - 1];
                        words[t - 1] = words[t];
                        words[t] = temp;
                    }
                }
            }

            for (String word : words){
                word = word.replaceFirst(String.valueOf(word.charAt(0)), String.valueOf(word.charAt(0)).toUpperCase());
                System.out.print(word + " ");
            }
            System.out.println();
        }
    }
}
