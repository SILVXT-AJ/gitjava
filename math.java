import java.util.Scanner;

public class math {
    public static void main ( String [] args){

        //System.out.println(Math.PI);
        //System.out.println(Math.E);

        Scanner scanner = new Scanner(System.in);

        double a;
        double b;
        double c;

        System.out.print("Enter the value of a: ");
        a = scanner.nextDouble();

        System.out.print("Enter the value of b: ");
        b = scanner.nextDouble();

        c = Math.sqrt(Math.pow(a, 2) + Math.pow( b,2));

        System.out.print("The value of the Hypotunuse c: "+ c+ " cm");



        scanner.close();

    }
}
