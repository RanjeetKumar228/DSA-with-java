package com.ranjeet;

public class Reverse {

    public static void main(String[] args) {

        // Write a program to reverse a number

        int Number = 12345;

        int ans = 0;
        while (Number > 0){
            int rem = Number % 10;
            Number /= 10;
            ans = (ans * 10) + rem;
        }
        System.out.println(ans);
    }
}
