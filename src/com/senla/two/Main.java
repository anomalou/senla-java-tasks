package com.senla.two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true){
            System.out.print("Type 1 number: ");
            String firstExpression = reader.readLine();
            System.out.print("Type 2 number: ");
            String secondExpression = reader.readLine();

            if(firstExpression.contains(".") || secondExpression.contains("."))
                System.out.println("One of typed number was not integer!");
            else{
                int firstNumber = Integer.parseInt(firstExpression);
                int secondNumber = Integer.parseInt(secondExpression);
                int gcd = GetGCD(firstNumber, secondNumber);
                int lcm = firstNumber * secondNumber / gcd;
                System.out.println("GDC: " + gcd + "\4n" + "LCM: " + lcm);
            }
        }
    }

    static int GetGCD(int num1, int num2){
        while (num1 != 0 && num2 != 0){
            if(num1 > num2)
                num1 %= num2;
            else
                num2 %= num1;
        }
        return num1 + num2;
    }
}
