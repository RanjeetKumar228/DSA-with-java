package com.ranjeet;

import java.util.Scanner;

public class AlphabetCheckCase {

    public static void main(String[] args) {

        // Check alphabet is upper case or lower case

        Scanner in = new Scanner(System.in);
        System.out.print("Please enter alphabet : ");

        char alph = in.next().trim().charAt(0);

        if (alph >= 'a' && alph <= 'z'){
            System.out.println("lower case");
        }
        else {
            System.out.println("upper case");
        }
    }
}
