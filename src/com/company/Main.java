package com.company;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        java.util.Scanner userInput = new java.util.Scanner(System.in);
        System.out.println("Please enter a max value: ");
        int max = userInput.nextInt();
        printRandomNumber(max);

    }

    private static void printRandomNumber(int max)
    {
        java.util.Random random= new java.util.Random();
        int number = random.nextInt(max + 1);
        System.out.println(number);
    }
}
