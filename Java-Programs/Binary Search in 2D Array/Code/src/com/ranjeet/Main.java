package com.ranjeet;
import java.lang.reflect.Array;
import java.util.Arrays;

public class Main{
    public static void main(String[] args) {
        int[][] arr ={
                {10, 12, 13, 14},
                {51, 61, 71, 81},
                {90, 91, 92, 93},
        };
        int target = 81;
        System.out.println(Arrays.toString(BS2DArray(arr,target)));
    }
    static int[] BS2DArray(int[][] arr,int target){
        int row = 0;
        int col = arr[0].length -1;

        while(row < arr.length && col >=0){
            if (arr[row][col] == target) {
                return new int[] {row,col};
            }
            if (arr[row][col] < target ) {
                row++;
            }else  {
                col--;
            }
        }
        return new int[] {-1,-1};
    }
}