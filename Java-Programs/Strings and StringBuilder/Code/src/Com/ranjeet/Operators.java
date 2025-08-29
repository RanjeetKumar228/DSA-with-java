package Com.ranjeet;

import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
//        System.out.println('a' + 'b');
//        System.out.println("a" + "b");
//        System.out.println(('a' + 3));
//
//        System.out.println("a" + 1);
        // this is same as after a few steps : "a" + "1"
        //Integer will be converted to Integer that will call toString()

        System.out.println(("Ranjeet" + new ArrayList<>()));
        System.out.println("Ranjeet" + Integer.valueOf(89));

        String ans = Integer.valueOf(89) + "" + new ArrayList<>();
        System.out.println(ans);
    }
}
