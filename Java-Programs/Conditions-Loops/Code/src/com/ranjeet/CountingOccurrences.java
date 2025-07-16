package com.ranjeet;

public class CountingOccurrences {

    public static void main(String[] args) {

        // write a program to check how many time number is occurrences

        int n = 6545511;

        int count = 0 ;
        while (n > 0){

            int rem = n % 10;
            if (rem == 5){
                count++;
            }
                n /= 10;
        }
        System.out.println(count);
    }
}
