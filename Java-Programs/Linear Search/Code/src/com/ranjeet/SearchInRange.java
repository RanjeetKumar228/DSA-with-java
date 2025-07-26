package com.ranjeet;

public class SearchInRange {

    public static void main(String[] args) {
        int[] arr = {18,12,-7,3,14,28};
        int target = 35;
        System.out.println(range(arr,target,1,4));
    }
    static int range(int[] arr,int target, int start,int end){
        if(arr.length == 0){
            return -1;
        }
        for (int i = start; i < end; i++) {
            int element = arr[i];
            if (element == target){
                return i;
            }
        }
        return -1;
    }
}
