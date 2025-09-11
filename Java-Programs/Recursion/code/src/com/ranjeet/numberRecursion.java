package com.ranjeet;

public class numberRecursion {
    public static void main(String[] args) {
        print(1);
    }
    static void print(int n){
        if (n == 5){
            System.out.println(5);
            return;
        }
        System.out.println(n);

        // recursive call
        // if you are calling a function again and again, you cn treat it as a separate call in the stack

        // This is called tail recursion
        // this is the last function called
        print(n + 1);
    }
}
