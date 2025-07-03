import java.util.Scanner;

public class sc {
    public static void main ( String [] args ){

        // shopping Cart

        Scanner scanner = new Scanner(System.in);

        String item;
        double price;
        int quantity;
        char currency = '₹';
        double total;

        System.out.print("What item would you like to buy?: ");
        item = scanner.nextLine();

        System.out.print("What is the price of the item?: ");
        price = scanner.nextDouble();

        System.out.print("How many items do You want: ");
        quantity = scanner.nextInt();

        total = price * quantity;

        System.out.println("\nThe item you have bought is "+ quantity + " "+ item );
        System.out.println("The Total price of the item is "+ currency+ total );

        scanner.close();
    }
}
