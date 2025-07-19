package com.ranjeet;

import java.util.Scanner;

public class SWT {
    public static void main(String[] args) {

//        int a = 10;
//        int b = 20;
//        swap(a,b);   // it can't swap
//        System.out.println(a + " " + b);

        String name = "Ranjeet";
        changeName(name);
        System.out.println(name);
    }

    static  void changeName (String namm){
        String name = "Jeet"; // creating a new object
    }

    static void swap(int a, int b){
        // Swap the number

        int temp = a;
        a = b;
        b = temp;

        // this change will only be valid in this function scope only
    }
}
