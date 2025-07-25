package com.ranjeet;

import java.util.Arrays;

public class SearchInString {
    public static void main(String[] args) {
        String name = "Ranjeet";
        char target = 't';
        System.out.println(searchString(name,target));
        System.out.println(Arrays.toString(name.toCharArray()));
    }

    // By for each loop

    static boolean searchString2 (String str, char target) {
        if (str.isEmpty()) {
            return false;
        }
        for (char ch : str.toCharArray()){
            if(ch == target){
                return true;
            }
        }
        return false;
    }
/*********************************************************************************************************************/

    //Search target and return true or false

    static boolean searchString (String str, char target){
        if(str.isEmpty()){
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if (target == str.charAt(i)){
                return true;
            }
        }
        return false;
    }
}
