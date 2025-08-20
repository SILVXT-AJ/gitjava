 class Animal {
    String name="Tiger";
    int age=34;

     static class Dog extends Animal{
        void display(){
            System.out.println("Name: "+ name);
            System.out.println("Age: "+ age);
        }
    }
    public class Single {
         public static void main (String [] args){
             Animal outer = new Animal(); // create an instance of the outer class
              Animal.Dog mydog = new Dog(); // create an instance of the inner class
              mydog.display();
     }
     }
}
