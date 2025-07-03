import java.util.Scanner;

public class Arithmetic {
    public static void main (String [] args){

        Scanner scanner = new Scanner(System.in);

        int year;

        System.out.print("Enter the Year: ");
        year = scanner.nextInt();

        if(year%4==0){

            System.out.println("It is a leap year");
        }
        else {

            System.out.print("it is NOT an leap year");
        }

        scanner.close();

    }
}
