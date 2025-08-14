package com.ranjeet;

import java.util.Arrays;

public class BS2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {10, 12, 13, 14},
                {51, 61, 71, 81},
                {90, 91, 92, 93},
        };
        int target = 81;
        System.out.println(Arrays.toString(BS2DArray(arr, target)));
    }

    static int[] BS2DArray(int[][] matrix, int target) {
        int row = 0;
        int col = matrix[0].length - 1;

        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == target) {
                return new int[]{row, col};
            }
            if (matrix[row][col] < target) {
                row++;
            } else {
                col--;
            }
        }
        return new int[]{-1, -1};
    }
}