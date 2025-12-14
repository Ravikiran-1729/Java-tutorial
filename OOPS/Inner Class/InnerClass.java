// Outer class
class A {

    int x;  // Instance variable of outer class

    // -----------------------------------------
    // Inner class (Non-static nested class)
    // -----------------------------------------
    // ✔ Can access all members of outer class
    // ✔ Requires an object of outer class to create
    class B {

        int y;  // Instance variable of inner class

        // Method of inner class
        void showInner(){
            System.out.println("This is inner class method; x = "+x+"; y = "+y);
        }
    }

    // Method of outer class
    void showOuter(){
        System.out.println("This is outer class method");
    }
}

public class InnerClass {

    public static void main(String[] args) {

        // Creating object of outer class
        A a = new A();

        // Creating object of inner class
        // Syntax: outerObject.new InnerClass()
        A.B b = a.new B();

        // Calling inner class method
        b.showInner();

        // Calling outer class method
        a.showOuter();
    }
}
