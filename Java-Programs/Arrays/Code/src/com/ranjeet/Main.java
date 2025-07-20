package com.ranjeet;

public class demo {
    public static void main(String[] args) {

        // Q: Store a rollNumber
        int rollNumber = 21;

        // Q: Store a Name
        String name = "Ranjeet";

        // Q: Store 5 rollNumber
        int rollNumber1 = 34;
        int rollNumber2 = 35;
        int rollNumber3 = 55;
        int rollNumber4 = 43;
        int rollNumber5 = 40;


        // Syntax
        // datatype[] variable_name = new datatype[size];

        // Store five rollNumber

        int[] rolls = new int[5];
        // or directly
        int[] rolls2 = {45,53,66,43,76,53,74};

        int[] rols; // declaration of array. rols ia getting in the stack
        rols = new int[7]; // Initialisat actually here object is being created in memory (heap)
    }
}

/*
                                What is an array

                An array is basically collection of data type it can be primitive,object,complex datatype.
                                    _______________________
                    int[] rools2 = |{45,53,66,43,76,53,74};|
                       |           |_______________________|
                       |               /
                       |              /
 first point :      this datatype basically represent
                    what is the type of data store inside an array

second point :   All the type of the data inside array should be same ,don't be mix match.

*/