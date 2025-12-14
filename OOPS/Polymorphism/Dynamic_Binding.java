class Parent {

    // Instance method
    // Instance methods participate in dynamic binding
    public void show(){
        System.out.println("This is Parent class Method");
    }
}

class Child extends Parent {

    // Method overriding
    // The actual method call is resolved at RUNTIME
    // based on the OBJECT type, not the reference type
    @Override
    public void show(){
        System.out.println("This is Child class Method");
    }
}

public class Dynamic_Binding {

    public static void main(String[] args) {

        // ---------------------------------------------
        // Dynamic Binding (Runtime Polymorphism)
        // ---------------------------------------------
        // Reference type: Parent
        // Object type   : Child
        // JVM decides at runtime which show() method
        // to execute based on the object created
        Parent p = new Child();

        // Reference type: Child
        // Object type   : Child
        Child ch = new Child();

        // Calls Child's show() method
        // because object type is Child
        p.show();

        // Calls Child's show() method
        ch.show();
    }
}
