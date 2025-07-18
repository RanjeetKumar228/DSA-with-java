package com.ranjeet;

import java.util.Scanner;

public class Arguments {

    public static void main(String[] args) {

//        int result  = sum3(2,5);
//        System.out.println(result);

        Scanner in = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String name = in.next();
        String personalized = MyGreet(name);
        System.out.println(personalized);
    }

        static String MyGreet(String name) {
            String message = "How are you " + name;
            return message;
//            return "How are you" + name;     direct write
    }
    // Pass the value of numbers when you are calling the method in main()

    static int sum3 (int a, int b){
        int sum = a + b;
        return sum;
    }
}
