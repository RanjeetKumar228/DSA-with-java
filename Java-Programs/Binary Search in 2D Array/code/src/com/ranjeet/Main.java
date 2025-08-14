package com.ranjeet;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] arr = {
                {10, 20, 30},
                {40, 50, 60},
                {70, 80, 90},
        };
        System.out.println(Arrays.toString(BS2DArray(arr,900)));
    }

    static int[] BS2DArray(int[][] arr, int target) {
        int row = 0;
        int col = arr[0].length - 1;
        while (row < arr.length && col >= 0){
            if (arr[row][col] == target){
                return new int[] {row,col};
            } else if (arr[row][col] > target){
                col--;
            } else {
                row++;
            }
        }
        return new int[] {-1,-1};
    }
}