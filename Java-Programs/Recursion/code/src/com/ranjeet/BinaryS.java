package com.ranjeet;

public class BinaryS {
    public static void main(String[] args) {
        int[] arr = {5};
        int target = 5;
        System.out.println(bsRecursion(arr,target,0, arr.length-1));

    }

    static int bsRecursion(int[] arr, int target, int start, int end){
        if(start > end) return -1;
        int mid = start + (end - start) / 2;
        if (arr[mid] == target) return  mid;
        if (target < arr[mid]) {
            return bsRecursion(arr, target, start, mid-1);
        }
        return bsRecursion(arr,target,mid+1,end);
    }
}
