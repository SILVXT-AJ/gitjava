import java.util.Scanner;

public class Calc {
    public static void main (String [] args){

        Scanner scanner = new Scanner(System.in);

        double num1;
        double num2;
        char operator;
        double result=0;
        boolean validOperation = true;

        System.out.print("Enter the first Number: ");
        num1 = scanner.nextDouble();

        System.out.print("Enter an operator (+,*,/,-): ");
        operator = scanner.next().charAt(0);

        System.out.print("Enter the second number: ");
        num2 = scanner.nextDouble();

        switch (operator){

            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;
            case '/' -> {
                if(num2 == 0 ){
                    System.out.print("Cannot divide by Zero!");
                    validOperation = false;
                } else {
                    result = num1 / num2;
                }

            }

            default -> {
                System.out.print("Its not valid operator!");
                       validOperation = false;
            }


        }
        if(validOperation) {
            System.out.println(result);
        }
        scanner.close();
    }
}
