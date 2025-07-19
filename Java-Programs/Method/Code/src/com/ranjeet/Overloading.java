package com.ranjeet;

public class Overloading {

    public static void main(String[] args) {

//      function(32, 54);
//      function("Ranjeet");
        int result = sum(2,3,5);
        System.out.println(result);
    }

    static int sum (int a,int b){
        return a + b;
    }

    static int sum (int a,int b,int c){
        return a + b + c;
    }


    static void function (int a, int b){
        System.out.println(a);
    }

    static void function (String name){
        System.out.println(name);
    }
}

/*
        what is overloading ?
        Function overloading basically happen when two or more function have same name
        they can exist if the parameters are different
 */