package com.senla.one;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while(true){
            System.out.print("Type number: ");
            String expression = reader.readLine();
            if(expression.contains("."))
                System.out.println("Error! Typed number not integer!");
            else{
                int number = Integer.parseInt(expression);
                String evenTest = (number % 2 == 0) ? "Typed number is even" : "Typed number is odd";
                System.out.println(evenTest);

                String simpleTest = (SimpleTest(number)) ? "Type number is simple" : "Typed number is not simple";
                System.out.println(simpleTest);
            }
        }
    }

    static boolean SimpleTest(int number){
        for(int i = 2; i <= Math.sqrt(number); i++){
            if(number % i == 0)
                return false;
        }
        return true;
    }
}
