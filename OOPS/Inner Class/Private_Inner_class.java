// Outer class
class OuterClass {

    int x = 29;   // Instance variable of outer class

    // -----------------------------------------
    // Private Inner Class
    // -----------------------------------------
    // ✔ Accessible only within this outer class
    // ✔ Cannot be accessed from outside the outer class
    // ✔ Used for strong encapsulation
    private class InnerClass {

        int y = 17;   // Instance variable of inner class
    }

    // Method of outer class
    // ✔ Can create and access private inner class
    public void initInnerClass(){

        // Creating object of private inner class
        InnerClass ic = new InnerClass();

        // Accessing both outer and inner class members
        System.out.println("x + y = " + (ic.y + x));
    }
}

public class Private_Inner_class {

    public static void main(String[] args) {

        // Creating object of outer class
        OuterClass oc = new OuterClass();

        /*
         * ❌ NOT ALLOWED:
         * Cannot access private inner class outside the outer class
         *

        OuterClass.InnerClass ic = oc.new InnerClass();
        
         * Compile-time error:
         * "OuterClass.InnerClass has private access"
         */

        // ✔ Correct way:
        // Access private inner class indirectly via outer class method
        oc.initInnerClass();
    }
}
