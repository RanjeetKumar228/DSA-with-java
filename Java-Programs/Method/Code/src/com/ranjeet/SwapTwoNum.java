package com.ranjeet;

import java.util.Scanner;

public class SwapTwoNum {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        // Swap the number

        int temp = a;
        a = b;
        b = temp;

        System.out.println(a + " " + b);
    }
}
