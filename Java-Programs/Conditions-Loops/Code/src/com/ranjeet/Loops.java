package com.ranjeet;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {

        /*
            Syntax of for loop

            for (initialization; condition; increment/decrement ){
                    // body
            }
         */

        // Print number from 1 to 10

//        for (int num = 1; num <= 10; num++) {
//            System.out.print(" " + num);
//        }


        // Print Number from 1 to n

        Scanner input = new Scanner(System.in);
//        int n = input.nextInt();

//        for (int i = 1; i <=n ; i++) {
//            System.out.println(i);
//        }

//        for (int i = 1; i <n ; i++) {
//            System.out.println("Hello World");
//        }


        /*
            Syntax of while loop

            while (condition){
                   // body
            }
         */


        // Print number from 1 to 10

//        for (int num = 1; num <= 10; num++) {
//            System.out.print(" " + num);
//        }

//            int num = 1;
//            while (num <= 10){
//                System.out.println(" " + num);
//                num++;
//        }

            /*
                      ******* How to know when we will use while loop and for loop *******

                You need to run while loop When we don't know how many times the loops is going to run

                You need to run for loop When we know how many times the loops is going to run

             */


         /*
            Syntax of do while loop

            do {
                // body
            } while (condition);
          */

//        int num = 1;
//        do {
//            System.out.println(num);
//            num++;
//        } while (num <= 10);

        int num = 1;
        do {
            System.out.println("Hello world");

        } while (num != 1);
    }
}
