import java.util.Scanner;

public class practice {
    public static  void main ( String [] args ){

        // if statement using scanner

        Scanner scanner = new Scanner(System.in);

        int age;
        String name;

        System.out.print("Enter your name: ");
        name = scanner.nextLine();

        System.out.print("Enter your age: ");
        age = scanner.nextInt();

        if(name.isEmpty()){
            System.out.println("You didn't have entered the Name!");
        }
        else {
            System.out.println("Hello "+ name);
        }

        if( age >= 65){

            System.out.print("You are a Senior!!");
        } else if (age >= 18 ){

            System.out.print("You are an adult");

        }
        else if( age == 0 ){

            System.out.print("you are a baby");}
        else {

            System.out.print("You havent been born yet!");

        }

        scanner.close();


    }
}
