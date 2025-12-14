class Parent {

    // Static method belongs to the class, not to objects
    static void show(){
        System.out.println("This is Parent class show() method");
    }
}

class Child extends Parent {

    // This is NOT method overriding
    // Static methods cannot be overridden, they are method hidden
    static void show(){
        System.out.println("This is Child class show() method");
    }
}

public class Static_Binding  {

    // Method overloading (compile-time polymorphism)
    static void show(int a){
        System.out.println("int argument");
    }

    static void show(String a){
        System.out.println("String argument");
    }

    public static void main(String[] args) {

        // ---------------------------------------------
        // Compile-time binding (Method Overloading)
        // The method call is resolved at compile time
        // based on argument type
        // ---------------------------------------------
        Static_Binding.show("Ravi");   // Calls show(String)
        Static_Binding.show(10);       // Calls show(int)


        // ---------------------------------------------
        // Static Method Binding (Method Hiding)
        // Static methods are resolved using
        // REFERENCE TYPE, not OBJECT TYPE
        // ---------------------------------------------

        // Reference type: Child
        Child ch = new Child();
        ch.show();   // Calls Child.show()


        // Reference type: Parent (object is Child)
        Parent p = new Child();
        p.show();   // Calls Parent.show()

    }
}
