import java.util.Scanner;

public class Maths {
    public static void main (String [] args){

        Scanner scanner = new Scanner(System.in);

        // C = 2 * Math.PI * radius
        // Area = Math.PI * Math.pow( radius, 2)
        // Volume = (4 / 3) * Math.PI * Math.pow(radius, 3)

        double radius;
        double circumference;
        double area;
        double volume;
        double squareroot;

        System.out.print("Enter the radius: ");
        radius = scanner.nextDouble();

        circumference= 2 * Math.PI * radius;
        area = Math.PI * Math.pow( radius, 2);
        volume= (4.0 / 3.0 ) * Math.PI * Math.pow(radius, 3);
        squareroot = Math.pow(radius, 2);


        System.out.printf("The Circumference is %.1fcm\n", circumference );
        System.out.printf("The Area is %.1fcm\n", area );
        System.out.printf("The Volume is %.1fcm\n", volume );
        System.out.printf("The squareriit is %.0f\n", squareroot );

        scanner.close();



    }
}
