package com.ranjeet;

public class Number {
    public static void main(String[] args) {
        // write a function that takes in a number and prints it
        // print first 5 number 1 2 3 4 5
        number();
    }

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
