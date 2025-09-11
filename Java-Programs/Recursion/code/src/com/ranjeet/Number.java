package com.ranjeet;

public class Number {
    public static void main(String[] args) {
        number();
    }
    // write a function to print a number
    static void number(){
        System.out.println(1);
        number2();
    }

     static void number2() {
         System.out.println(2);
         number3();
    }

    static void number3() {
        System.out.println(3);
    }
}
