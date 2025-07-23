package com.ranjeet;

public class Main {

    public static void main(String[] args) {

        int[] arr = {1, 3, 3424, 242, 424, 252, 55, 22};

        int target = 424;

        //return index
        int ans1 =  linearSearch(arr,target);
        System.out.println(ans1);

        //return element
        int ans2 = linearSearch2(arr,target);
        System.out.println(ans2);

        //return true or false
        boolean result = linearSearch3(arr,target);
        System.out.println(result);
    }

    // Search the target and return true aur false
    static boolean linearSearch3(int[] arr, int target){
        if (arr.length == 0){
            return false;
        }
        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            if (element == target) {
                return true;
            }
        }
        return false;
    }
/**********************************************************************************************************************/

    //search the target and return the element
    static int linearSearch2 (int[] arr , int target){
//        if(arr.length == 0){
//            return Integer.MAX_VALUE;
//        }  // Don't need to check if you use for-each loop
        for (int element : arr){
            if (element == target){
                return element;
            }
        }
        return Integer.MAX_VALUE;
    }
/********************************************************************************************************************/

    //Search in the array : return the index if the item found
    // otherwise if item not found return -1

    static int linearSearch (int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }
        //run for loop
        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            if(element == target){
                return i;
            }
        }
        //If the item not found
        return -1;
    }
}