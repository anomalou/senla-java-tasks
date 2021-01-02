package com.senla.five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true){
            ArrayList<String> palindromeList = new ArrayList<>();
            System.out.print("Type number of numbers: ");
            int N = Integer.parseInt(reader.readLine());

            if(N > 100)
                System.out.println("Sequence should not exceed 100!");
            else{
                for(int i = 0; i < N; i++) {
                    System.out.print("Type number: ");
                    String number = reader.readLine();
                    if(isPalindrome(number))
                        palindromeList.add(number);
                }

                System.out.println("Palindrome list: ");
                for(String number : palindromeList){
                    System.out.println(number);
                }
            }
        }
    }

    static boolean isPalindrome(String expression){
        for(int i = 0; i < expression.length(); i++){
            if(expression.charAt(i) != expression.charAt(expression.length() - 1 - i))
                return false;
        }
        return true;
    }
}
