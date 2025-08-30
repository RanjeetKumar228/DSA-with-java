package Com.ranjeet;

import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {
        String name = "Ranjeet kumar";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.lastIndexOf("k"));
        System.out.println(name.toLowerCase());
        System.out.println(name.indexOf('t'));
        System.out.println(name.replace('R','Y'));
        System.out.println(Arrays.toString(name.split(" ")));
    }
}
