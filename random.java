import java.awt.*;
import java.util.Scanner;

public class random {
    public static void main (String [] args){

        // WEIGHT CONVERSION PROGRAM;

        Scanner scanner = new Scanner(System.in);

        double weight;
        double newweight;
        int choice;

        System.out.println("Choose an option to convert the weight");
        System.out.println("1: Convert weight kg to lbs");
        System.out.println("2: Convert weight lbs to kg");

        System.out.print("Enter the choice of the option: ");
        choice = scanner.nextInt();

        if(choice == 1){
            System.out.print("Enter the weight in kg: ");
            weight= scanner.nextDouble();
            newweight = weight * 0.453592;
            System.out.printf("The conversion of the weight is: %.2f", newweight);
        }
        else if(choice == 2) {
            System.out.print("Enter the weight in lbs: ");
            weight= scanner.nextDouble();
            newweight = weight * 2.20462;
            System.out.printf("The conversion of the weight is: %.2f", newweight);
        }
        else{
            System.out.print("Choose a right option that given above");
        }


        scanner.close();


    }
}
