import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {

        // Area Of Circle Java Program

        Scanner in = new Scanner(System.in);
        System.out.print("Please enter radius of the circle : ");
        float radius = in.nextFloat();

        float area = 3.14f * radius * radius;

        System.out.println(area);
    }
}