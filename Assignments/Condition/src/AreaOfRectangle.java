import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {

        // Area Of Rectangle Java Program

        Scanner in = new Scanner(System.in);
        System.out.print("Please enter length of the rectangle : ");
        float length = in.nextFloat();
        System.out.print("Please enter width of the rectangle : ");
        float width = in.nextFloat();
        float area = length * width;

        System.out.print("Area of rectangle : " + area);
    }
}
