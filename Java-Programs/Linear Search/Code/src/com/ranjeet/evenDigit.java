package com.ranjeet;

import java.util.Arrays;

public class evenDigit {

    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
        System.out.println(findNumbers(nums));

        // for checking no. of digits
        System.out.println(digit(234));
    }

    static int findNumbers(int[] nums){
        int count = 0;
        for (int num : nums) {
            if (even(num)) {
                count++;
            }
        }
        return count;
    }
        //Count no. of even number

    static boolean even(int num) {
        int noOfevenDigit = digit(num);
        if (noOfevenDigit % 2 == 0) {
            return true;
        }
        return false;
    }

        // count the no. of digit

    static int digit(int num) {
        int count = 0;
        if (num < 0) {
            num = num * -1;
        }
        if (num == 0) {
            return 1;
        }
//        while (num > 0){
//            num /= 10;
//            count++;
//        }
//        return count;


        // instead of using while loop
        // write directly

        return (int) (Math.log10(num)) + 1;
    }
}
