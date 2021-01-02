package com.senla.four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true){
            System.out.print("Type text: ");
            String text = reader.readLine();
            System.out.print("Type word: ");
            String word = reader.readLine();

            String[] words = text.split(" ");

            int wordFrequency = 0;

            for(String w : words){
                if(w.compareToIgnoreCase(word) == 0)
                    wordFrequency++;
            }

            System.out.println("Word " + word + " frequency: " + wordFrequency);
        }
    }
}
