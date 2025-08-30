package Com.ranjeet;

public class Comparison {
    public static void main(String[] args) {
//        String a = "Ranjeet";
//        String b = "Ranjeet";
//        System.out.println(a==b);

        String name1 = new String("Ranjeet");
        String name2 = new String("Ranjeet  ");

        System.out.println(name1 == name2);

        System.out.println(name1.equals(name2));

        System.out.println(name1.charAt(0));
    }
}
