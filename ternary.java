import java.awt.*;
import java.util.Scanner;

public class ternary {
    public static void main (String [] args){


        Scanner scanner = new Scanner(System.in);

        double radius;
        double area;
        double cirucumference;
        double volume;

        System.out.print("Enter the radius: ");
        radius = scanner.nextDouble();

        area = Math.PI * Math.pow( radius, 2);
        cirucumference = 2 * Math.PI * radius;
        volume = (4.0 / 3.0) * Math.PI * Math.pow( radius, 3);

        System.out.printf(" The area of the circle is: %.1fcm\n", area);
        System.out.printf(" The ciruferemce  is: %.1fcm\n", cirucumference);
        System.out.printf(" The volume of the sphere is: %.1fcm\n", volume);

        scanner.close();


    }
}
