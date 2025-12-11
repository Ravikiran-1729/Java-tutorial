public class ObjectLifecycle{

    // static variable
    static int a = 120;

    // instance variable
    int b = 300;


    // static block
    static {
        System.out.println("Static block");
    }


    // instance block
    {
        System.out.println("Instance block");
    }

    // static method
    static void staticMethod(){
        System.out.println("Static Method");
    }

    //Instance method
    void instanceMethod(){
        System.out.println("Instance Method");
    }

    //constructor
    ObjectLifecycle(){
        System.out.println("Constructor");
    }

    public static void main(String[] args) {
        System.out.println("Main method");

        // static method call using class name (ObjectLifecycle)
        ObjectLifecycle.staticMethod();

        // object d
        ObjectLifecycle d = new ObjectLifecycle();

        // instance method call using object name (d)
        d.instanceMethod();
    }
}