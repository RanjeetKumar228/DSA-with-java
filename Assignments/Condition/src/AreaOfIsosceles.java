import java.util.Scanner;

public class AreaOfIsosceles {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Area Of isosceles triangle Java Program

        System.out.print("Please enter base of the isosceles triangle : ");
        float base = in.nextFloat();
        System.out.print("Please enter height of the isosceles triangle : ");
        float height = in.nextFloat();

        float area = (base * height)/2;

        System.out.print("Area of isosceles triangle : " + area);

    }
}
