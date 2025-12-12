// Singleton class using private constructor
class Singleton_Class{

    // Static reference to the single instance of this class
    // Initially null => instance will be created on first method call (lazy initialization)
    private static Singleton_Class class_instance = null;

    // Instance variable (non-static)
    String s = "Initial value";

    // Private Constructor -> prevents external instantiation
    private Singleton_Class(){}

    // Public Static Method that returns single instance
    public static Singleton_Class Singleton_Class_Method(){

        // If no instance exists -> create one
        if(class_instance == null){
            class_instance = new Singleton_Class();
            return class_instance;
        }

        // Return the same instance every time
        return class_instance;
        
    }
}

class Singleton_class_using_Private_Constructor {
    public static void main(String[] args) {
        
        // Asking for instance the first time => instance created
        Singleton_Class first_instance = Singleton_Class.Singleton_Class_Method();

        // Asking for instance again => same instance is returned
        Singleton_Class second_instance = Singleton_Class.Singleton_Class_Method();

        // Both instances point to the same object, so both show "Initial value"
        System.out.println(first_instance.s +" "+second_instance.s);

        // Modify the variable using first instance
        first_instance.s = "Changed value";

        // Since both variables reference the same object
        // second instance.s also reflects the updated value
        System.out.println(first_instance.s +" "+second_instance.s);
    }
}