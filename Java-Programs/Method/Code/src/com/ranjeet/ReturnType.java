package com.ranjeet;

import java.util.Scanner;

public class ReturnType {

    public static void main(String[] args) {
        int result = sum();
        System.out.println(result);
    }

    // Return type

    static int sum () {
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2= in.nextInt();
        int sum  = num1 + num2;
        return sum;

       //  System.out.println(result); This will never execute
    }
}
