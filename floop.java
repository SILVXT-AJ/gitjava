import java.util.Scanner;

public class floop {
    public static void main ( String [] args) throws InterruptedException {

      int start = 14;

      for ( int i = start; i > 0; i --){

          System.out.println(i);
          Thread.sleep(1000);
      }
        System.out.println("Happy Christmas!!");
    }
}
