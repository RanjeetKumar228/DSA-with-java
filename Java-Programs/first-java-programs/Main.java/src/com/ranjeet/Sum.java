package com.ranjeet;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        System.out.println("Enter the two number");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number : ");
        float first_num = input.nextFloat();
        System.out.print("Enter second number : ");
        float second_num = input.nextFloat();

        float sum = first_num + second_num;

        System.out.println("Sum =  " + sum);
    }
}
