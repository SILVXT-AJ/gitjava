public class Scanner {
    public static void main (String [] args){

       java.util.Scanner scanner = new java.util.Scanner(System.in);

       double width = 0;
       double height = 0;
       double area = 0;

       System.out.print(" Enter the Width: ");
       width = scanner.nextDouble();

       System.out.print("Enter the Hieght: ");
       height = scanner.nextDouble();

       area = width * height;

       System.out.print("The area of the Rectangle is : "+ area + " cm2");

       scanner.close();
    }
}
