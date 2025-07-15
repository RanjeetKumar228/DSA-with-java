package com.ranjeet;

public class Conditionals {

    public static void main(String[] args) {

        /*
            Syntax of if-else statements

            if (boolean expression True or False){
                // statement
            }
            else {
                // do this
            }
         */

//            Scanner input = new Scanner(System.in);
//            System.out.print("Please enter your salary : ");
//            int salary = input.nextInt();
//
//        if (salary>10000){
//            salary = salary + 2000;
//        }
//        else{
//            salary += 1000;
//        }
//
//          System.out.println(salary);


        // Multiple if-else statement

        int marks = 10;

        if (marks >= 70){
            System.out.println("Grade A");
        } else if (marks >= 60) {
            System.out.println("Grade B");
        } else if (marks >= 50) {
            System.out.println("Grade C");
        } else {
            System.out.println("Grade D");
        }
    }
}
