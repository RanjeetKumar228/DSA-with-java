package com.ranjeet;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
//      fun(2,44,3,57,23,5,75,74,652,235,67,233);
//      multiple(23, 44,  "Ranjeet","Jeet","Sunny");
//      demo();  // When it is empty it show Error, Ambiguous method call. Both
        demo("Ranjeet");
    }

        static void demo (int ...v){
            System.out.println(Arrays.toString(v));
        }
        static void demo (String ...v) {
            System.out.println(Arrays.toString(v));
        }

        static void multiple (int a, int b, String ...v){   //Vararg parameter must be the last in the list
            System.out.println(a + " " + b + " " + Arrays.toString(v));

        }

        static void fun (int ...v){
            System.out.println(Arrays.toString(v));
        }
}

/*                              What is VarArgs ?
        when you create a method that takes variable number of arguments it is known as VarArgs.

        when we don't know how many input we are giving.
 */