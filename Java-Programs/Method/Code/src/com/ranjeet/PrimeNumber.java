package com.ranjeet;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter a number : ");
        int num = in.nextInt();
        boolean ans = isPrime(num);
        System.out.println(ans);
;

    }

    static boolean isPrime(int num) {
        if (num < 1) {
            return false;
        }
        int count = 2;
        while (count*count < num){
            if (num % count == 0){
                return false;
            }
            count++;
        }
        if(count*count > 2){
            return true;
        }
        return false;
    }

}
