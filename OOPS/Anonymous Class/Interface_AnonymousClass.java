// Interface declaration
interface Animal {

    // Abstract method
    // Must be implemented by the implementing class
    void sounds();
}

public class Interface_AnonymousClass  {

    public static void main(String[] args) {

        // -----------------------------------------
        // Anonymous Class implementing an Interface
        // -----------------------------------------
        // ✔ No class name
        // ✔ Created at the time of object creation
        // ✔ Used when implementation is needed only once
        // ✔ Provides implementation of interface methods

        Animal dog = new Animal() {

            // Implementing the interface method
            @Override
            public void sounds(){
                System.out.println("Dog barks");
            }
        };

        // Calling method implemented by anonymous class
        dog.sounds();
    }
}
