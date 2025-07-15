package com.ranjeet;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        System.out.println("Temperature Checking in Celsius to fahrenheit");
        System.out.println("*********************************************");
        System.out.println(" ");
        System.out.print("Please Enter Temp in C : ");
        Scanner input = new Scanner(System.in);
        float tempC = input.nextFloat();

        float tempFormula = (tempC * 9/5) + 32;

        System.out.println("Temperature : " + tempFormula);
    }
}
