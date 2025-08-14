package com.ranjeet;

import java.util.Arrays;

public class BS2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
        };
        System.out.println(Arrays.toString(search(arr,50)));
    }

    static int[] BinaryS(int[][] arr, int target, int row, int cStart, int cEnd){
            while (cStart <= cEnd){
                int mid = cStart + (cEnd - cStart) / 2;

                if (arr[row][mid] == target) {
                    return new int[] {row,mid};
                }

                if (arr[row][mid] > target) {
                    cEnd = mid -1;
                }else {
                    cStart = mid + 1;
                }
            }
            return new int[] {-1,-1};
    }

    static int[]  search(int[][] arr,int target){
        // It may be matrix is one dimension
        int row = arr.length;
        int col = arr[0].length;

        if (row == 1){
            return BinaryS(arr,target,0,0,col -1);
        }

        // run the loop till the 2 rows are remaining
        int rStart = 0;
        int rEnd = row - 1;
        int cMid = col / 2;
        while (rStart < (rEnd - 1)){  //while this is true it will have more than 2 rows
            int mid = rStart + (rEnd - rStart) / 2;
            if (arr[mid][cMid] == target) {
                return new int[] {mid,cMid};
            }
            if (arr[mid][cMid] > target) {
               rEnd = mid;
            }else {
                rStart = mid;
            }
        }

        // Now we have two rows
        //check whether the target is in the col of 2 rows

        if(arr[rStart][cMid] == target){
            return new int[] {rStart,cMid};
        }
        if(arr[rStart + 1][cMid] > target){
            return new int[] {rStart + 1,cMid};
        }

        // search in 1st half
        if (target <= arr[rStart][cMid - 1]) {
            return BinaryS(arr,target,rStart,0,cMid -1);
        }
        // search in 2nd half
        if (target >= arr[rStart][cMid + 1] && target <= arr[rStart][cMid - 1]) {
            return BinaryS(arr,target,rStart,cMid +1,cMid -1);
        }
        // search in 3rd half
        if (target <= arr[rStart + 1][cMid -1]) {
            return BinaryS(arr,target,rStart+1,0,cMid -1);
        }
       else {
            return BinaryS(arr,target,rStart+1,cMid +1,cMid -1);
        }
    }

}
