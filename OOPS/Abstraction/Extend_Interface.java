// Interface A
// All methods in an interface are implicitly public and abstract
interface A {

    // implicitly: public abstract
    void Method1();

    // implicitly: public abstract
    void Method2();
}

// Interface B extends interface A
// Interface inheritance is allowed using 'extends'
interface B extends A {

    // implicitly: public abstract
    void Method3();
}

// A class can implement an interface
// Since B extends A, this class must implement
// all methods of both A and B
public class Extend_Interface implements B {

    // While implementing interface methods,
    // the access modifier MUST be public
    // Otherwise, compile-time error occurs:
    // "Cannot reduce the visibility of the inherited method"
    @Override
    public void Method1(){
        System.out.println("This is Method 1");
    }

    // public is mandatory here
    @Override
    public void Method2(){
        System.out.println("This is Method 2");
    }

    // public is mandatory here
    @Override
    public void Method3(){
        System.out.println("This is Method 3");
    }

    public static void main(String[] args) {

        // Creating object of the implementing class
        Extend_Interface ei = new Extend_Interface();

        // Calling implemented methods
        ei.Method1();
        ei.Method2();
        ei.Method3();
    }
}
