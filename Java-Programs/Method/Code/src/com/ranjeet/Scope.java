package com.ranjeet;

public class Scope {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        String name  = "Ranjeet";


         {      // block Scope

            name  = "Jeet";
            System.out.println(name);

             a = 80; // reassign the origin ref variable to some other value
            System.out.println(a);
            int c = 20;
            // value initialized in this block, will remain in the block
        }
            int c = 89;
//          System.out.println(c);  // can't be used outside the block
            System.out.println(a);
            System.out.println(name);

         /*
            block scope  = { // statement }

            First point,if variable is initialized outside the block scope,don't need to again
            initialized inside the block. But definitely modified it.

            Second point, when you modify the variable inside the block, it printed also inside and outside the block
        */


        // Loops in scope

        for (int i = 0; i < 10; i++){
            int num = 10;
//            int a = 10;
            System.out.println(num);
        }
    }

    // method Scope mean jo jiska variable initialize hai vo usi ke lie valid hai.
    static void random (int marks){
         int num = 10;
         int a = 10;
         int b = 224;
        System.out.println(num);
        System.out.println(marks);

    }
}
