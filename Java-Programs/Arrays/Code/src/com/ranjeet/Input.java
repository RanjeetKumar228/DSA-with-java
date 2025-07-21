package com.ranjeet;

import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//      Array of Primitives
        int[] arr = new int[6];
        arr[0] = 230;
        arr[1] = 35;
        arr[2] = 45;
        arr[3] = 34;
        arr[4] = 37;
        arr[5] = 452;

        //internally store like this
//            System.out.println(arr[5]);

//      input using for loop
        for (int i = 0; i < arr.length ; i++) {
             arr[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(arr));

//        for (int i = 0; i < arr.length ; i++) {
//            System.out.print(arr[i] + " ");
//        }


//      Enhanced for loop
//       for (int num : arr){
//           System.out.print(num + " "); // here num represent element of the array
//       }

//         System.out.println(arr[6]);  // index out of bound



        // Array of Object

//        String[] name = {"Ranjeet","Sunny","Jeet"};
//
//        System.out.println(Arrays.toString(name));

        String[] name = new String[5];

        for (int i = 0; i <name.length ; i++) {
            name[i] = in.next();
        }
        System.out.println(Arrays.toString(name));


//      modify
        name[1] = "Ranjeet";
        System.out.println(Arrays.toString(name));
    }
}
