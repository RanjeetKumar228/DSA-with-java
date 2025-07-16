package com.ranjeet;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Take input from user till user does noy press X or x.
        int ans = 0;
        while (true){
            // Take a operator as input
            System.out.println();
            System.out.print("Enter the operator : ");
            char op = in.next().trim().charAt(0);
            System.out.println();
            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%'){
                // Take a operator as input
                System.out.print("Please enter first number : ");
                int num1 = in.nextInt();
                System.out.print("Please enter second number : ");
                int num2 = in.nextInt();

                if (op == '+') {
                    ans = num1 + num2;
                }
                if (op == '-') {
                    ans = num1 - num2;
                }
                if (op == '*') {
                    ans = num1 * num2;
                }
                if (op == '%') {
                    ans = num1 / num2;
                }
                if (op == '/') {
                    if (num2 > 0 ){
                        ans = num1 / num2;
                    }else {
                        System.out.print("undefined");
                        break;
                    }
                }
            }  else if (op == 'X' || op == 'x') {
                break;
            }
            else {
                System.out.print("Invalid operation");
            }
            System.out.println("Result : " + ans);
       }
    }
}
