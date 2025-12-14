// Interface represents a contract that classes must follow
interface Animal {

   // Abstract method (implicitly public and abstract)
   // Must be implemented by all implementing classes
   void walk();

   // Default method (introduced in Java 8)
   // Provides a default implementation
   // Can be inherited or overridden by implementing classes
   default void eats(){
      System.out.println("Animal eats");
   }

   // Static method (introduced in Java 8)
   // Belongs to the interface itself
   // Cannot be overridden or inherited by implementing classes
   static void breathe(){
      System.out.println("Animal breathes");
   }
}

// Horse class implements Animal interface
class Horse implements Animal {

   // Implementing the abstract method of interface
   @Override
   public void walk() {
      System.out.println("Horse walks on 4 legs");
   }
}

// Chicken class implements Animal interface
class Chicken implements Animal {

   // Implementing the abstract method of interface
   @Override
   public void walk() {
      System.out.println("Chicken walks on 2 legs");
   }
}

public class Interface {

   public static void main(String args[]) {

      // Creating object of implementing class
      Horse horse = new Horse();

      // Calls Horse's implementation of walk()
      horse.walk();

      // Calls default method from interface
      horse.eats();

      // Static interface method is called
      // using interface name only
      Animal.breathe();
   }
}
