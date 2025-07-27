import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {

        // Area Of Triangle Java Program

        Scanner in = new Scanner(System.in);
        System.out.print("Please enter base of the triangle : ");
        float base = in.nextFloat();
        System.out.print("Please enter height of the triangle : ");
        float height = in.nextFloat();
        float area = (base * height)/2;

        System.out.print("Area of triangle : " + area);
    }
}
