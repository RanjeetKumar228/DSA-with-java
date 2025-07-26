package com.ranjeet;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr2D = {
                {11,12,13,14},
                {15,16,17},
                {1,3,345,235},
                {12,25,66,47},
        };
        int target = 8;
        int[] arr = search(arr2D,target);
        System.out.println(Arrays.toString(arr));
    }
    static int[] search (int[][] arr,int target){

        for (int r = 0; r < arr.length; r++) {
            for (int c = 0; c < arr[r].length; c++) {
                if (arr[r][c] == target) {
                    return new int[] {r,c};
                }
            }
        }
        return new int[] {-1,-1};
    }
}
