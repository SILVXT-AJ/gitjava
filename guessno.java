import java.util.Random;
import java.util.Scanner;

public class guessno {
    public static void main (String [] args){

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int guess;
        int attempts = 0;
        int min = 1;
        int max = 101;
        int randomnumber = random.nextInt(min , max);

        System.out.println("Its a random number guessing game");
        System.out.printf("Guess a number between %d-%d \n", min , max);

        do {
            System.out.print("Enter a guess: ");
            guess = scanner.nextInt();
            attempts++;

            if(guess < randomnumber){
                System.out.println("Too LOW! ");
            } else if(guess > randomnumber) {
                System.out.println("Too HIGH! ");
            } else {
                System.out.println("Its CORRECT! " + randomnumber);
                System.out.println(" The attempts: "+ attempts);

            }

        }while (guess != randomnumber);

        System.out.println("You have won!!");

        scanner.close();
    }
}
