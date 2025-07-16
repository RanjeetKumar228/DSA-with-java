package com.ranjeet;

import java.sql.SQLOutput;
import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String[] args) {

        // find the nth fibonacci series

        Scanner in = new Scanner(System.in);
        System.out.print("Please enter the nth fibonacci number : ");
        int FiboNum = in.nextInt();

        int p = 0;
        int i = 1;

        int count = 2;
        while (count <= FiboNum){
            int temp = i;
            i =  i + p;
            p = temp;
            count++;
        }
        System.out.println(i);
    }
}
