package com.ranjeet;

public class MaxIn2DArray {
    public static void main(String[] args) {
        int[][] arr2D = {
                {11,12,13,14},
                {15,16,17},
                {1,3,345,235},
                {12,25,66,47},
        };
        System.out.println(max(arr2D));
    }

    // By for-each loop

    static int max(int[][] arr){
        int max = Integer.MIN_VALUE;
         for (int[] ints : arr) {
            for (int element : ints) {
                if (element > max) {
                        max = element;
                }
            }
         }
        return max;
    }

//    static int max(int[][] arr){
//    int max = Integer.MIN_VALUE;
//        for (int r = 0; r < arr.length; r++) {
//            for (int c = 0; c < arr[r].length; c++) {
//                if (arr[r][c] > max) {
//                    max = arr[r][c];
//                }
//            }
//        }
//        return max;
//    }
}
