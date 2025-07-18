package com.ranjeet;

import static com.ranjeet.Greeting.greeting;

public class PassValue {
    public static void main(String[] args) {

        String chacha = "Iron Man";
        greeting(chacha);
    }

    private static void greeting(String namm) {

        System.out.println(namm);

    }
}
        /*
                            Notes

            // In java , Pass by value not pass by reference.

            Primitives : int, short, byte, char, ..... ---> Just passing value

            Object & reference : Passing value of the reference Value
        */
