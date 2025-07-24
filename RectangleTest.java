import java.awt.Rectangle;
import java.util.Scanner;

public class RectangleTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter width: ");
        int width = input.nextInt();

        System.out.print("Enter height: ");
        int height = input.nextInt();

        Rectangle box1 = new Rectangle(0, 0, width, height);
        System.out.println("box1: " + box1);

        int area = width * height;
        System.out.println("Area: " + area);
    }
}
