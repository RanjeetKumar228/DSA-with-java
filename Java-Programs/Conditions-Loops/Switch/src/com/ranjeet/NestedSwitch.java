package com.ranjeet;

import java.util.Scanner;

public class NestedSwitch {

    public static void main(String[] args) {

        // Nested Case

        Scanner in = new Scanner(System.in);
        int empID = in.nextInt();
        String Department = in.next();
        switch (empID){
            case 1 :
                System.out.println("Employee Name : Ranjeet");
                break;
            case 2 :
                System.out.println("Employee Name : Sunny");
                break;

            case 3 :
                System.out.println("3");
                switch (Department){
                    case "IT" :
                        System.out.println("IT Department");
                        break;
                    case "Management" :
                        System.out.println("Management Department");
                        break;
                    default:
                        System.out.println("No Department");
                        break;
                }
                break;
            default:
                System.out.println("Please enter valid empID and Department");
        }
    }
}
