// Interface demonstrating private methods (introduced in Java 9)
interface A {

    // Private method in interface
    // ✔ Allowed from Java 9 onwards
    // ✔ Can be used only inside the interface
    // ✖ Cannot be inherited or overridden by implementing classes
    private void show(){
        System.out.println("Interface private method");
    }

    // Default method in interface
    // ✔ Can call private methods of the same interface
    // ✔ Acts as a reusable implementation
    default void display(){
        show(); // calling private interface method
        System.out.println("Interface default method calling private method");
    }
}

public class Interface_PrivateMethods implements A {

    public static void main(String[] args) {

        // Creating object of implementing class
        Interface_PrivateMethods ip = new Interface_PrivateMethods();

        // Calling default method from interface
        // Internally, this method calls the private method
        ip.display();
    }
}
