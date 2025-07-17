package com.ranjeet;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String fruit = in.next();
//        switch (fruit){
//            case "Mango":
//                System.out.println("King of the fruits");
//                break;
//            case "Apple":
//                System.out.println("A sweet red fruit");
//                break;
//            case "Grapes":
//                System.out.println("A small fruit");
//                break;
//            case "Orange":
//                System.out.println("A small fruit");
//                break;
//            default:
//                System.out.println("Please enter valid fruit");


        // Enhanced Switch Case
        switch (fruit) {
            case "Mango" -> System.out.println("King of the fruits");
            case "Apple" -> System.out.println("A sweet red fruit");
            case "Grapes" -> System.out.println("A small fruit");
            case "Orange" -> System.out.println("A round fruit");
            default -> System.out.println("Please enter valid fruit");
        }
    }
}
