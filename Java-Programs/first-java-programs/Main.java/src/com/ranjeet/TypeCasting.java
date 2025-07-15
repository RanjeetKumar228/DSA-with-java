package com.ranjeet;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // type casting
        // int a = (int)(input.nextFloat());
        // System.out.println(a);

        // int a = (float)(13.53);  // Not possible , because of density of type is always greater then source type


        // automatic type promotion in expressions

        // int a = 257;
        // byte b = (byte)(a);
        // System.out.println(b);  // 257 % 256 = 1

//        byte a = 65;
//        byte b= 73;
//        byte c= 65;
//        int  d = a * b / c;
//        System.out.println(d);


        // int number = 'a';
        // System.out.println(number);


        // Rules of type promotion
        // 1. All byte , short and char value are promoted to the integer
        // 2. if any one the operand is long , whole operation will be long as well as float , double


        byte b = 127;
        char c  = 'a';
        short s = 2323;
        int i = 50000;
        float f = 34.3f;
        double d = 35.43421;
        double result = (f * b) + (i / c) - (d - s);
        System.out.println(((f * b) + " " + (i / c) + " " + (d * s)));
        // float + int + decimal = decimal
        System.out.println(result);
        
    }
}
