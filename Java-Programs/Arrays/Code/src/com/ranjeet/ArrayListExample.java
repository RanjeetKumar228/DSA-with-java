package com.ranjeet;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

       // Syntax
        ArrayList<Integer> list = new ArrayList<>(10);

//        list.add(2235);
//        list.add(678);
//        list.add(230);
//        list.add(23);
//        list.add(123);
//        list.add(233);
//
//        System.out.println(list);
//
//        list.set(3,369);
//
//        System.out.println(list.contains(12356));
//        System.out.println(list);
//
//        list.remove(2);
//        System.out.println(list);

        // input

        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }

        // get item at any index
        for (int i = 0; i < 5; i++) {
            System.out.print(list.get(i) + " "); // pass index here,list[index syntax will not work]
        }

        System.out.println(list);

    }
}
