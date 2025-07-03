import java.util.Scanner;

public class Madlib {
    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);

        String noun1;
        String adjective1;
        String noun2;
        String noun3;
        String noun4;
        String noun5;

        System.out.println("Enter the word (A place)" );
        noun1 = scanner.nextLine();
        System.out.println("An adective");
        adjective1 = scanner.nextLine();
        System.out.println("A Celeberity");
        noun2 = scanner.nextLine();
        System.out.println("A body part");
        noun3 = scanner.nextLine();
        System.out.println("A body part");
        noun4 = scanner.nextLine();
        System.out.println("an adjective");
        noun5 = scanner.nextLine();

        System.out.print("Once upon a time, in a place called "+ noun1 + "there was");
        System.out.print("a "+ adjective1 + "princess named" + noun2 + "her kingdom");
        System.out.print("was huge, but her "+ noun3+ "was bigger. She was beautiful");
        System.out.print("form her"+ noun4 + "to her"+ noun5+ ".");
        }
}


